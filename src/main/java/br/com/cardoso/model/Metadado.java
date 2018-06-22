package br.com.cardoso.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "metadado")
public class Metadado implements Serializable {

	private static final long serialVersionUID = 4236840103127298778L;

	private Long id;
	private String nome;
	private String valor;
	private String flAtivo;
	
	private TipoMetadado tipoMetadado;

	public Metadado() {
		super();
	}

	public Metadado(Long id, String nome, String valor, String flAtivo, TipoMetadado tipoMetadado) {
		super();
		this.id = id;
		this.nome = nome;
		this.valor = valor;
		this.flAtivo = flAtivo;
		this.tipoMetadado = tipoMetadado;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getFlAtivo() {
		return flAtivo;
	}

	public void setFlAtivo(String flAtivo) {
		this.flAtivo = flAtivo;
	}

	@ManyToOne
	@JoinColumn(name="tipometadado_id")
	public TipoMetadado getTipoMetadado() {
		return tipoMetadado;
	}

	public void setTipoMetadado(TipoMetadado tipoMetadado) {
		this.tipoMetadado = tipoMetadado;
	}
	
}
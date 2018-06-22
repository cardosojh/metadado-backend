package br.com.cardoso.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipometadado")
public class TipoMetadado implements Serializable {

	private static final long serialVersionUID = -8337191073016516837L;

	private Long id;
	private String nome;

	public TipoMetadado() {
		super();
	}

	public TipoMetadado(Long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
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

}

package br.com.cardoso.dto;

public class MetadadoDTO {

	private Long id;
	private String nome;
	private String valor;
	private String flAtivo;
	
	private TipoMetadadoDTO tipoMetadado;

	public MetadadoDTO() {
		super();
	}

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

	public TipoMetadadoDTO getTipoMetadado() {
		return tipoMetadado;
	}

	public void setTipoMetadado(TipoMetadadoDTO tipoMetadado) {
		this.tipoMetadado = tipoMetadado;
	}
	
}
package br.com.cardoso.initialization;

import java.util.Arrays;
import java.util.List;

import br.com.cardoso.model.Metadado;
import br.com.cardoso.model.TipoMetadado;

public class DadosUtils {

	public static final TipoMetadado tipoMetadado1 = criarMetadado(1l, "Tipo 001");
	public static final TipoMetadado tipoMetadado2 = criarMetadado(2l, "Tipo 002");
	public static final TipoMetadado tipoMetadado3 = criarMetadado(3l, "Tipo 003");
	public static final TipoMetadado tipoMetadado4 = criarMetadado(4l, "Tipo 004");
	public static final TipoMetadado tipoMetadado5 = criarMetadado(5l, "Tipo 005");

	public static final Metadado metadado1 = criarMetadadoA(1l, "Metadado Nome 01", "Metadado Valor 01", "S", tipoMetadado1);
	public static final Metadado metadado2 = criarMetadadoA(2l, "Metadado Nome 02", "Metadado Valor 02", "S", tipoMetadado2);
	public static final Metadado metadado3 = criarMetadadoA(3l, "Metadado Nome 03", "Metadado Valor 03", "S", tipoMetadado3);
	public static final Metadado metadado4 = criarMetadadoA(4l, "Metadado Nome 04", "Metadado Valor 04", "S", tipoMetadado4);
	public static final Metadado metadado5 = criarMetadadoA(5l, "Metadado Nome 05", "Metadado Valor 05", "S", tipoMetadado5);

	private static TipoMetadado criarMetadado(long id, String nome) {
		return new TipoMetadado(id, nome);
	}
	
	private static Metadado criarMetadadoA(long id, String nome, String valor, String flAtivo, TipoMetadado tipoMetadado) {
		return new Metadado(id, nome, valor, flAtivo, tipoMetadado);
	}

	public static List<TipoMetadado> getTipos() {		
		return Arrays.asList(tipoMetadado1, tipoMetadado2, tipoMetadado3, tipoMetadado4, tipoMetadado5); 
	}

	public static List<Metadado> getMetadados() {
		return Arrays.asList(metadado1, metadado2, metadado3, metadado4, metadado5);
	}
}
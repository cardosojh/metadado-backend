package br.com.cardoso.adapter;

import br.com.cardoso.dto.MetadadoDTO;
import br.com.cardoso.model.Metadado;

public class MetadadoAdapter {

	public static MetadadoDTO toMetadadoDTO(Metadado metadado) {

		if (metadado == null) {
			return null;
		}
		
		MetadadoDTO dto = new MetadadoDTO();
		dto.setId(metadado.getId());
		dto.setNome(metadado.getNome());
		dto.setValor(metadado.getValor());
		dto.setFlAtivo(metadado.getFlAtivo());
		dto.setTipoMetadado(TipoMetadadoAdapter.toTipoMetadadoDTO(metadado.getTipoMetadado()));
		
		return dto;
	}

	public static Metadado toMetadado(MetadadoDTO metadadoDTO) {
		
		if (metadadoDTO == null) {
			return null;
		}
		
		Metadado metadado = new Metadado();
		metadado.setId(metadadoDTO.getId());
		metadado.setNome(metadadoDTO.getNome());
		metadado.setValor(metadadoDTO.getValor());
		metadado.setFlAtivo(metadadoDTO.getFlAtivo());
		metadado.setTipoMetadado(TipoMetadadoAdapter.toTipoMetadado(metadadoDTO.getTipoMetadado()));
		
		return metadado;
	}

}
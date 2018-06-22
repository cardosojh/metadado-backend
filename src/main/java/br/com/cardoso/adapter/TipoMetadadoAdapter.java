package br.com.cardoso.adapter;

import br.com.cardoso.dto.TipoMetadadoDTO;
import br.com.cardoso.model.TipoMetadado;

public class TipoMetadadoAdapter {

	public static TipoMetadadoDTO toTipoMetadadoDTO(TipoMetadado tipoMetadado) {
		
		if (tipoMetadado == null) {
			return null;
		}
		
		TipoMetadadoDTO dto = new TipoMetadadoDTO();
		dto.setId(tipoMetadado.getId());
		dto.setNome(tipoMetadado.getNome());
		
		return dto;
	}

	public static TipoMetadado toTipoMetadado(TipoMetadadoDTO tipoMetadadoDTO) {

		if (tipoMetadadoDTO == null) {
			return null;
		}
		
		TipoMetadado tipoMetadado = new TipoMetadado();
		tipoMetadado.setId(tipoMetadadoDTO.getId());
		tipoMetadado.setNome(tipoMetadadoDTO.getNome());
		
		return tipoMetadado;		
	}
	
}
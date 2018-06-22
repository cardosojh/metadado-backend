package br.com.cardoso.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cardoso.adapter.TipoMetadadoAdapter;
import br.com.cardoso.dto.TipoMetadadoDTO;
import br.com.cardoso.model.TipoMetadado;
import br.com.cardoso.repository.TipoMetadadoRepository;

@Service
public class TipoMetadadoService {

	@Autowired
	private TipoMetadadoRepository tipoMetadadoRepository;

	public List<TipoMetadadoDTO> getTiposMetadado() {
		
		List<TipoMetadado> tipos = tipoMetadadoRepository.findAll();
		
		List<TipoMetadadoDTO> list = new ArrayList<TipoMetadadoDTO>();
		
		for (TipoMetadado tipoMetadado : tipos) {
			list.add(TipoMetadadoAdapter.toTipoMetadadoDTO(tipoMetadado));
		}
		
		return list;
	}

	public void novoTipoMetadado(TipoMetadadoDTO tipoMetadadoDTO) {
		
		TipoMetadado tipoMetadado = TipoMetadadoAdapter.toTipoMetadado(tipoMetadadoDTO);
		
		tipoMetadadoRepository.save(tipoMetadado);
	}
	
}

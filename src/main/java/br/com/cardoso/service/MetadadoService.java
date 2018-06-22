package br.com.cardoso.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cardoso.adapter.MetadadoAdapter;
import br.com.cardoso.dto.MetadadoDTO;
import br.com.cardoso.model.Metadado;
import br.com.cardoso.repository.MetadadoRepository;

@Service
public class MetadadoService {

	@Autowired
	private MetadadoRepository metadadoRepository;

	public List<MetadadoDTO> getMetadados() {
		
		List<Metadado> metadados = metadadoRepository.findAll();
		
		List<MetadadoDTO> list = new ArrayList<MetadadoDTO>();
		
		for (Metadado metadado : metadados) {
			list.add(MetadadoAdapter.toMetadadoDTO(metadado));
		}
		
		return list;
	}

	public void novoMetadado(MetadadoDTO metadadoDTO) {
		
		Metadado metadado = MetadadoAdapter.toMetadado(metadadoDTO);
		
		metadadoRepository.save(metadado);
	}
	
}

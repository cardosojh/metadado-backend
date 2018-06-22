package br.com.cardoso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.cardoso.dto.MetadadoDTO;
import br.com.cardoso.service.MetadadoService;

@RestController
@RequestMapping("/metadado")
public class MetadadoController {

	@Autowired
	private MetadadoService metadadoService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<MetadadoDTO> getMetadados() {
		return metadadoService.getMetadados();		
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void novoMetadado(@RequestBody MetadadoDTO metadadoDTO) {
		metadadoService.novoMetadado(metadadoDTO);
	}
	
}
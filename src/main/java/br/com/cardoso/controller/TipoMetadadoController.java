package br.com.cardoso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.cardoso.dto.TipoMetadadoDTO;
import br.com.cardoso.service.TipoMetadadoService;

@RestController
@RequestMapping("/tipo-metadado")
public class TipoMetadadoController {

	@Autowired
	private TipoMetadadoService tipoMetadadoService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<TipoMetadadoDTO> getTiposMetadado() {
		return tipoMetadadoService.getTiposMetadado();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void novoMetadado(@RequestBody TipoMetadadoDTO tipoMetadadoDTO) {
		tipoMetadadoService.novoTipoMetadado(tipoMetadadoDTO);
	}
	
}
package br.com.cardoso.initialization;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import br.com.cardoso.repository.MetadadoRepository;
import br.com.cardoso.repository.TipoMetadadoRepository;

@Component
public class InitializationApplication implements ApplicationListener<ApplicationReadyEvent> {

//	private static final Logger log = LoggerFactory.getLogger(InitializationApplication.class);

	@Autowired
	private TipoMetadadoRepository tipoMetadadoRepository;
	
	@Autowired
	private MetadadoRepository metadadoRepository;
	
	@Override
	public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
		
		criarDados();
		
	}

	private void criarDados() {
		criarTiposMetadado();
		criarMetadados();
	}

	private void criarMetadados() {
		metadadoRepository.saveAll(DadosUtils.getMetadados());
	}

	private void criarTiposMetadado() {
		tipoMetadadoRepository.saveAll(DadosUtils.getTipos());
	}

}
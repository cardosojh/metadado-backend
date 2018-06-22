package br.com.cardoso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cardoso.model.TipoMetadado;

@Repository
public interface TipoMetadadoRepository extends JpaRepository<TipoMetadado, Long> {

}
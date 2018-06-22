package br.com.cardoso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cardoso.model.Metadado;

@Repository
public interface MetadadoRepository extends JpaRepository<Metadado, Long> {

}
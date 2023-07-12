package io.github.michaelAlcantara.model.repository;

import io.github.michaelAlcantara.model.entity.Cliente;
import io.github.michaelAlcantara.model.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {
}

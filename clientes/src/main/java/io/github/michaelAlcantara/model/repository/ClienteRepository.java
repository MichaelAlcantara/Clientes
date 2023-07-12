package io.github.michaelAlcantara.model.repository;

import io.github.michaelAlcantara.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}

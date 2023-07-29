package io.github.michaelAlcantara.model.repository;

import io.github.michaelAlcantara.model.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}

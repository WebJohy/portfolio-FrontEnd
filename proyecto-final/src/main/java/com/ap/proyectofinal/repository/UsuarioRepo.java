package com.ap.proyectofinal.repository;

import com.ap.proyectofinal.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepo extends JpaRepository<Usuario,Long> {
}

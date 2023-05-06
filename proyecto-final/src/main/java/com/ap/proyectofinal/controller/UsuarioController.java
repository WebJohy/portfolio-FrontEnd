package com.ap.proyectofinal.controller;

import com.ap.proyectofinal.models.Usuario;
import com.ap.proyectofinal.services.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")

public class UsuarioController {
  private final UsuarioService usuarioService;

  public UsuarioController(UsuarioService usuarioService){
    this.usuarioService = usuarioService;
  }
  @GetMapping("/id/{id}")
  public ResponseEntity<Usuario> obtenerUsuario(@PathVariable("id") Long id){
    Usuario usuario=usuarioService.buscarUsuarioPorId(id);
  return new ResponseEntity<>(usuario, HttpStatus.OK);
  }
  @PutMapping("/editar")
  public ResponseEntity<Usuario> editarUsuario(@RequestBody Usuario usuario){
    Usuario editarUsuario=usuarioService.editarUsuario(usuario);
    return new ResponseEntity<>(editarUsuario, HttpStatus.OK);
  }

}

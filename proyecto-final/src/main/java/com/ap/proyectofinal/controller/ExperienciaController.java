package com.ap.proyectofinal.controller;

import com.ap.proyectofinal.models.Experiencia;
import com.ap.proyectofinal.services.ExperienciaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/experiencia")
public class ExperienciaController {

  private final ExperienciaService experienciaService;

  public ExperienciaController(ExperienciaService experienciaService){
    this.experienciaService = experienciaService;
  }
  @GetMapping("/id/{id}")
  public ResponseEntity<Experiencia> obtenerExperiencia(@PathVariable("id") Long id){
    Experiencia experiencia=experienciaService.buscarExperienciaPorId(id);
    return new ResponseEntity<>(experiencia, HttpStatus.OK);
  }
  @PutMapping("/editar")
  public ResponseEntity<Experiencia> editarExperiencia(@RequestBody Experiencia experiencia){
    Experiencia editarExperiencia=experienciaService.editarExperiencia(experiencia);
    return new ResponseEntity<>(editarExperiencia,HttpStatus.OK);
  }

}

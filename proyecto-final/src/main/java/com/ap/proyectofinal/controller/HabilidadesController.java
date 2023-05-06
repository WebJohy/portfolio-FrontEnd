package com.ap.proyectofinal.controller;

import com.ap.proyectofinal.models.Habilidades;
import com.ap.proyectofinal.services.HabilidadesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Habilidades")
public class HabilidadesController {
  private final HabilidadesService habilidadesService;
  public HabilidadesController(HabilidadesService habilidadesService){
    this.habilidadesService=habilidadesService;
  }
  @GetMapping("/id/{id}")
  public ResponseEntity<Habilidades> obtenerHabilidades(@PathVariable("id") Long id){
    Habilidades habilidades=habilidadesService.buscarHabilidadesPorId(id);
    return new ResponseEntity<>(habilidades, HttpStatus.OK);
  }
  @PutMapping("/editar")
  public ResponseEntity<Habilidades> editarHabilidades(@RequestBody Habilidades habilidades){
    Habilidades editarHabilidades=habilidadesService.editarHabilidades(habilidades);
    return new ResponseEntity<>(editarHabilidades, HttpStatus.OK);
  }
}

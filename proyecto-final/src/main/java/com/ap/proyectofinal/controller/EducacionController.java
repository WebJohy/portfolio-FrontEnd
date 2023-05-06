package com.ap.proyectofinal.controller;

import com.ap.proyectofinal.models.Educacion;
import com.ap.proyectofinal.services.EducacionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/educacion")
public class EducacionController {

  private final EducacionService educacionService;
  public  EducacionController(EducacionService educacionService){
    this.educacionService = educacionService;
  }
  @GetMapping("/all")
  public ResponseEntity<List <Educacion>> obtenerEducacion(){
    List<Educacion> educaciones=educacionService.buscarEducaciones();
    System.out.println("ingrese!");
    return new ResponseEntity<>(educaciones, HttpStatus.OK);
  }
  @PutMapping("/editar")
  public ResponseEntity<Educacion> editarEducacion(@RequestBody Educacion educacion){
    Educacion editarEducacion=educacionService.editarEducacion(educacion);
    return new ResponseEntity<>(editarEducacion, HttpStatus.OK);
  }

  @PostMapping("/add")
  public ResponseEntity<Educacion> crearEducacion(@RequestBody Educacion educacion){
    Educacion nuevaEducacion=educacionService.addEducacion(educacion);
    return new ResponseEntity<>(nuevaEducacion,HttpStatus.CREATED);
  }

  @DeleteMapping("/delete/{id}")
  public ResponseEntity<?> borrarEducacion(@PathVariable("id") Long id){
    educacionService.borrarEducacion(id);
    return new ResponseEntity<>(HttpStatus.OK);
  }
}

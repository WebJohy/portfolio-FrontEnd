package com.ap.proyectofinal.controller;

import com.ap.proyectofinal.models.Educacion;
import com.ap.proyectofinal.responses.Response;
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

  @DeleteMapping("/eliminar/{id}")
  public ResponseEntity<Response> borrarEducacion(@PathVariable("id") Long id){
    System.out.println(id);
    educacionService.borrarEducacion(id);
    Response response= new Response();
    response.setSuccess(true);
    response.setMessage("Educacion eliminada");
    return new ResponseEntity<>(response,HttpStatus.OK);
  }
}

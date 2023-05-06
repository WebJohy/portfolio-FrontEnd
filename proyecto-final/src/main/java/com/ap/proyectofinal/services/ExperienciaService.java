package com.ap.proyectofinal.services;

import com.ap.proyectofinal.exception.ExperienceNotFoundException;
import com.ap.proyectofinal.exception.UserNotFoundException;
import com.ap.proyectofinal.models.Experiencia;
import com.ap.proyectofinal.models.Usuario;
import com.ap.proyectofinal.repository.ExperienciaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ExperienciaService {

  private final ExperienciaRepo experienciaRepo;

  @Autowired
  public ExperienciaService(ExperienciaRepo experienciaRepo){
    this.experienciaRepo = experienciaRepo;
  }
  public Experiencia addExperiencia(Experiencia experiencia){
    return experienciaRepo.save(experiencia);
  }
  public List<Experiencia> buscarExperiencias(){
    return experienciaRepo.findAll();
  }
  public Experiencia editarExperiencia(Experiencia experiencia){
    return experienciaRepo.save(experiencia);
  }
  public void borrarExperiencia(Long id){
    experienciaRepo.deleteById(id);
  }

  public Experiencia buscarExperienciaPorId(Long id){
    return experienciaRepo.findById(id).orElseThrow(() ->new ExperienceNotFoundException("experiencia no encontrada"));
  }
}

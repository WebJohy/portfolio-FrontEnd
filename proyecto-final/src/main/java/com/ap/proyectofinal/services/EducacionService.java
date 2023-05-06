package com.ap.proyectofinal.services;

import com.ap.proyectofinal.exception.EducationNotFoundException;
import com.ap.proyectofinal.exception.UserNotFoundException;
import com.ap.proyectofinal.models.Educacion;
import com.ap.proyectofinal.models.Usuario;
import com.ap.proyectofinal.repository.EducacionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EducacionService {
  private final EducacionRepo educacionRepo;

  @Autowired
  public EducacionService(EducacionRepo educacionRepo) {
    this.educacionRepo = educacionRepo;
  }
  public Educacion addEducacion(Educacion educacion){
    return educacionRepo.save(educacion);
  }
  public List<Educacion> buscarEducaciones(){
    return educacionRepo.findAll();
  }
  public Educacion editarEducacion(Educacion educacion){return educacionRepo.save(educacion);
  }
  public void borrarEducacion(Long id){
    educacionRepo.deleteById(id);
  }

}

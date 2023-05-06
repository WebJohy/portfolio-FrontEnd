package com.ap.proyectofinal.services;

import com.ap.proyectofinal.exception.SkillNotFoundException;
import com.ap.proyectofinal.exception.UserNotFoundException;
import com.ap.proyectofinal.models.Habilidades;
import com.ap.proyectofinal.models.Usuario;
import com.ap.proyectofinal.repository.HabilidadesRepo;
import com.ap.proyectofinal.repository.UsuarioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class HabilidadesService {
  private final HabilidadesRepo habilidadesRepo;

  @Autowired
  public HabilidadesService(HabilidadesRepo habilidadesRepo){
    this.habilidadesRepo = habilidadesRepo;
  }
  public Habilidades addHabilidades(Habilidades habilidades){
    return habilidadesRepo.save(habilidades);
  }
  public List<Habilidades> buscarHabilidades(){
    return habilidadesRepo.findAll();
  }
  public Habilidades editarHabilidades(Habilidades habilidades){
    return habilidadesRepo.save(habilidades);
  }
  public void borrarHabilidades(Long id){
    habilidadesRepo.deleteById(id);
  }

  public Habilidades buscarHabilidadesPorId(Long id){
    return habilidadesRepo.findById(id).orElseThrow(() ->new SkillNotFoundException("habilidad no encontrada"));
  }
}

package com.ap.proyectofinal.exception;

public class SkillNotFoundException extends RuntimeException{
  public SkillNotFoundException(String mensaje){
    super(mensaje);
  }
}


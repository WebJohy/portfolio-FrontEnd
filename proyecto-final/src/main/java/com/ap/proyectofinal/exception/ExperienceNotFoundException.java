package com.ap.proyectofinal.exception;

public class ExperienceNotFoundException extends RuntimeException{
  public ExperienceNotFoundException(String mensaje){
    super(mensaje);
  }
}

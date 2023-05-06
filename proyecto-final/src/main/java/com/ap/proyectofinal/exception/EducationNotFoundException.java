package com.ap.proyectofinal.exception;

public class EducationNotFoundException extends RuntimeException{
  public EducationNotFoundException(String mensaje){
    super(mensaje);
  }
}

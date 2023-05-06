package com.ap.proyectofinal.exception;

public class UserNotFoundException extends RuntimeException{
  public UserNotFoundException(String mensaje){
    super(mensaje);
  }
}

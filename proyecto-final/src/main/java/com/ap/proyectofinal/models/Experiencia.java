package com.ap.proyectofinal.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Experiencia {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long idEx;
  private String tituloEx;
  private int fechaEx;
  private String descEx;
  private String imagenEx;

  public Experiencia() {

  }

  public Experiencia(Long idEx, String tituloEx, int fechaEx, String descEx, String imagenEx) {
    this.idEx = idEx;
    this.tituloEx = tituloEx;
    this.fechaEx = fechaEx;
    this.descEx = descEx;
    this.imagenEx = imagenEx;
  }

  public Long getIdEx() {
    return idEx;
  }

  public void setIdEx(Long idEx) {
    this.idEx = idEx;
  }

  public String getTituloEx() {
    return tituloEx;
  }

  public void setTituloEx(String tituloEx) {
    this.tituloEx = tituloEx;
  }

  public int getFechaEx() {
    return fechaEx;
  }

  public void setFechaEx(int fechaEx) {
    this.fechaEx = fechaEx;
  }

  public String getDescEx() {
    return descEx;
  }

  public void setDescEx(String descEx) {
    this.descEx = descEx;
  }

  public String getImagenEx() {
    return imagenEx;
  }

  public void setImagenEx(String imagenEx) {
    this.imagenEx = imagenEx;
  }
}

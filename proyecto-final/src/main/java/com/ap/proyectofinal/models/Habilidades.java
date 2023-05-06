package com.ap.proyectofinal.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Habilidades {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long idHab;
  private String nombreHab;
  private String fotoHab;
  private int porcentaje;

  public Habilidades() {
  }

  public Habilidades(Long idHab, String nombreHab, String fotoHab, int porcentaje) {
    this.idHab = idHab;
    this.nombreHab = nombreHab;
    this.fotoHab = fotoHab;
    this.porcentaje = porcentaje;
  }

  public Long getIdHab() {
    return idHab;
  }

  public void setIdHab(Long idHab) {
    this.idHab = idHab;
  }

  public String getNombreHab() {
    return nombreHab;
  }

  public void setNombreHab(String nombreHab) {
    this.nombreHab = nombreHab;
  }

  public String getFotoHab() {
    return fotoHab;
  }

  public void setFotoHab(String fotoHab) {
    this.fotoHab = fotoHab;
  }

  public int getPorcentaje() {
    return porcentaje;
  }

  public void setPorcentaje(int porcentaje) {
    this.porcentaje = porcentaje;
  }
}

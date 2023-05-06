package com.ap.proyectofinal.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
public class Usuario implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(nullable = false, updatable = false)
  private Long id;
  private String nombre;
  private String apellido;
  private String titulo;
  private String descripcion;
  private String fotoPerfil;
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "idEdu")
  private List<Educacion> educacionList;
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "idHab")
  private List<Habilidades> habilidadesList;
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "idEx")
  private List<Experiencia> experienciaList;

  public Usuario() {
  }

  public Usuario(Long id, String nombre, String apellido, String titulo, String descripcion, String fotoPerfil, List<Educacion> educacionList, List<Habilidades> habilidadesList, List<Experiencia> experienciaList) {
    this.id = id;
    this.nombre = nombre;
    this.apellido = apellido;
    this.titulo = titulo;
    this.descripcion = descripcion;
    this.fotoPerfil = fotoPerfil;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public String getFotoPerfil() {
    return fotoPerfil;
  }

  public void setFotoPerfil(String fotoPerfil) {
    this.fotoPerfil = fotoPerfil;
  }
}

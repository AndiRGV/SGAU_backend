package com.umg.sgau.carrera.entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDate;
import java.math.BigDecimal;
@Entity
    @Table(name="carreras")
    public class Carrera {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(length = 255)
    private String nombre;
    @Column(length = 255)
    private String descripcion;
    private Integer duracionAnios;
    private Boolean activa;
    public Carrera() {
    }
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }
    public Integer getDuracionAnios(){
        return duracionAnios;
    }
    public void setDuracionAnios(Integer duracionAnios){
        this.duracionAnios=duracionAnios;
    }
    public Boolean getActiva(){
        return activa;
    }
    public void setActiva(Boolean activa){
        this.activa=activa;
    }
}

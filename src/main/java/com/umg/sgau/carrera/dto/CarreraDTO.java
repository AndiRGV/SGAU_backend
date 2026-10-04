package com.umg.sgau.carrera.dto;
import java.time.LocalDate;
import java.math.BigDecimal;
public class CarreraDTO {
    private Long id;
    private String nombre;
    private String descripcion;
    private Integer duracionAnios;
    private Boolean activa;
    public CarreraDTO(){
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

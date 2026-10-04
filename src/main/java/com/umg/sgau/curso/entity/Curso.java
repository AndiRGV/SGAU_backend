package com.umg.sgau.curso.entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDate;
import java.math.BigDecimal;
@Entity
    @Table(name="cursos")
    public class Curso {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private Long carreraId;
    @Column(length = 255,  unique = true)
    private String codigo;
    @Column(length = 255)
    private String nombre;
    @Column(length = 255)
    private String descripcion;
    private Integer creditos;
    private Long docenteId;
    public Curso() {
    }
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public Long getCarreraId(){
        return carreraId;
    }
    public void setCarreraId(Long carreraId){
        this.carreraId=carreraId;
    }
    public String getCodigo(){
        return codigo;
    }
    public void setCodigo(String codigo){
        this.codigo=codigo;
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
    public Integer getCreditos(){
        return creditos;
    }
    public void setCreditos(Integer creditos){
        this.creditos=creditos;
    }
    public Long getDocenteId(){
        return docenteId;
    }
    public void setDocenteId(Long docenteId){
        this.docenteId=docenteId;
    }
}

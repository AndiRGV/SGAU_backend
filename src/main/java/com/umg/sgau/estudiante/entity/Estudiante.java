package com.umg.sgau.estudiante.entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDate;
import java.math.BigDecimal;
@Entity
    @Table(name="estudiantes")
    public class Estudiante {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private Long usuarioId;
    @Column(length = 255,  unique = true)
    private String codigoEstudiante;
    @Column(length = 255)
    private String telefono;
    @Column(length = 255)
    private String direccion;
    private LocalDate fechaNacimiento;
    public Estudiante() {
    }
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public Long getUsuarioId(){
        return usuarioId;
    }
    public void setUsuarioId(Long usuarioId){
        this.usuarioId=usuarioId;
    }
    public String getCodigoEstudiante(){
        return codigoEstudiante;
    }
    public void setCodigoEstudiante(String codigoEstudiante){
        this.codigoEstudiante=codigoEstudiante;
    }
    public String getTelefono(){
        return telefono;
    }
    public void setTelefono(String telefono){
        this.telefono=telefono;
    }
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        this.direccion=direccion;
    }
    public LocalDate getFechaNacimiento(){
        return fechaNacimiento;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento){
        this.fechaNacimiento=fechaNacimiento;
    }
}

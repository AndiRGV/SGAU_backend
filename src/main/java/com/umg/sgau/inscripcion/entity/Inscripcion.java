package com.umg.sgau.inscripcion.entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDate;
import java.math.BigDecimal;
@Entity
    @Table(name="inscripciones")
    public class Inscripcion {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private Long estudianteId;
    private Long carreraId;
    @Column(length = 255)
    private String cicloAcademico;
    private LocalDate fechaInscripcion;
    @Column(length = 255)
    private String estado;
    public Inscripcion() {
    }
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public Long getEstudianteId(){
        return estudianteId;
    }
    public void setEstudianteId(Long estudianteId){
        this.estudianteId=estudianteId;
    }
    public Long getCarreraId(){
        return carreraId;
    }
    public void setCarreraId(Long carreraId){
        this.carreraId=carreraId;
    }
    public String getCicloAcademico(){
        return cicloAcademico;
    }
    public void setCicloAcademico(String cicloAcademico){
        this.cicloAcademico=cicloAcademico;
    }
    public LocalDate getFechaInscripcion(){
        return fechaInscripcion;
    }
    public void setFechaInscripcion(LocalDate fechaInscripcion){
        this.fechaInscripcion=fechaInscripcion;
    }
    public String getEstado(){
        return estado;
    }
    public void setEstado(String estado){
        this.estado=estado;
    }
}

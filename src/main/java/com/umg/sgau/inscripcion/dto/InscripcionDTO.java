package com.umg.sgau.inscripcion.dto;
import java.time.LocalDate;
import java.math.BigDecimal;
public class InscripcionDTO {
    private Long id;
    private Long estudianteId;
    private Long carreraId;
    private String cicloAcademico;
    private LocalDate fechaInscripcion;
    private String estado;
    public InscripcionDTO(){
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

package com.umg.sgau.nota.entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDate;
import java.math.BigDecimal;
@Entity
    @Table(name="notas")
    public class Nota {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private Long inscripcionId;
    private Long cursoId;
    private Long docenteId;
    private BigDecimal calificacion;
    @Column(length = 255)
    private String periodo;
    @Column(length = 255)
    private String observacion;
    public Nota() {
    }
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public Long getInscripcionId(){
        return inscripcionId;
    }
    public void setInscripcionId(Long inscripcionId){
        this.inscripcionId=inscripcionId;
    }
    public Long getCursoId(){
        return cursoId;
    }
    public void setCursoId(Long cursoId){
        this.cursoId=cursoId;
    }
    public Long getDocenteId(){
        return docenteId;
    }
    public void setDocenteId(Long docenteId){
        this.docenteId=docenteId;
    }
    public BigDecimal getCalificacion(){
        return calificacion;
    }
    public void setCalificacion(BigDecimal calificacion){
        this.calificacion=calificacion;
    }
    public String getPeriodo(){
        return periodo;
    }
    public void setPeriodo(String periodo){
        this.periodo=periodo;
    }
    public String getObservacion(){
        return observacion;
    }
    public void setObservacion(String observacion){
        this.observacion=observacion;
    }
}

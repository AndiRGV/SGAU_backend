package com.umg.sgau.docente.entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDate;
import java.math.BigDecimal;
@Entity
    @Table(name="docentes")
    public class Docente {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private Long usuarioId;
    @Column(length = 255,  unique = true)
    private String codigoDocente;
    @Column(length = 255)
    private String especialidad;
    @Column(length = 255)
    private String telefono;
    public Docente() {
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
    public String getCodigoDocente(){
        return codigoDocente;
    }
    public void setCodigoDocente(String codigoDocente){
        this.codigoDocente=codigoDocente;
    }
    public String getEspecialidad(){
        return especialidad;
    }
    public void setEspecialidad(String especialidad){
        this.especialidad=especialidad;
    }
    public String getTelefono(){
        return telefono;
    }
    public void setTelefono(String telefono){
        this.telefono=telefono;
    }
}

package com.umg.sgau.docente.dto;
import java.time.LocalDate;
import java.math.BigDecimal;
public class DocenteDTO {
    private Long id;
    private Long usuarioId;
    private String codigoDocente;
    private String especialidad;
    private String telefono;
    public DocenteDTO(){
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

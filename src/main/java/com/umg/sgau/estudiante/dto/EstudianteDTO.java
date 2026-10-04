package com.umg.sgau.estudiante.dto;
import java.time.LocalDate;
import java.math.BigDecimal;
public class EstudianteDTO {
    private Long id;
    private Long usuarioId;
    private String codigoEstudiante;
    private String telefono;
    private String direccion;
    private LocalDate fechaNacimiento;
    public EstudianteDTO(){
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

package com.umg.sgau.usuario.entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDate;
import java.math.BigDecimal;
@Entity
    @Table(name="usuarios")
    public class Usuario {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(length = 255,  unique = true)
    private String username;
    @Column(length = 255,  nullable = false)
    @com.fasterxml.jackson.annotation.JsonProperty(access=com.fasterxml.jackson.annotation.JsonProperty.Access.WRITE_ONLY)
    private String password;
    @Column(length = 255,  unique = true)
    private String email;
    @Column(length = 255)
    private String nombre;
    @Column(length = 255)
    private String apellido;
    private Boolean activo;
    public Usuario() {
    }
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username=username;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public Boolean getActivo(){
        return activo;
    }
    public void setActivo(Boolean activo){
        this.activo=activo;
    }
}

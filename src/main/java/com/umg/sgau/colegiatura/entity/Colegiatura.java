package com.umg.sgau.colegiatura.entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDate;
import java.math.BigDecimal;
@Entity
    @Table(name="colegiaturas")
    public class Colegiatura {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private Long inscripcionId;
    @Column(length = 255)
    private String mes;
    private BigDecimal monto;
    private LocalDate fechaVencimiento;
    private LocalDate fechaPago;
    @Column(length = 255)
    private String estado;
    public Colegiatura() {
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
    public String getMes(){
        return mes;
    }
    public void setMes(String mes){
        this.mes=mes;
    }
    public BigDecimal getMonto(){
        return monto;
    }
    public void setMonto(BigDecimal monto){
        this.monto=monto;
    }
    public LocalDate getFechaVencimiento(){
        return fechaVencimiento;
    }
    public void setFechaVencimiento(LocalDate fechaVencimiento){
        this.fechaVencimiento=fechaVencimiento;
    }
    public LocalDate getFechaPago(){
        return fechaPago;
    }
    public void setFechaPago(LocalDate fechaPago){
        this.fechaPago=fechaPago;
    }
    public String getEstado(){
        return estado;
    }
    public void setEstado(String estado){
        this.estado=estado;
    }
}

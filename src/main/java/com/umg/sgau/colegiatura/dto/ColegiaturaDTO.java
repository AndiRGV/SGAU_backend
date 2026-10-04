package com.umg.sgau.colegiatura.dto;
import java.time.LocalDate;
import java.math.BigDecimal;
public class ColegiaturaDTO {
    private Long id;
    private Long inscripcionId;
    private String mes;
    private BigDecimal monto;
    private LocalDate fechaVencimiento;
    private LocalDate fechaPago;
    private String estado;
    public ColegiaturaDTO(){
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

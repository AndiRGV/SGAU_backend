package com.umg.sgau.colegiatura.mapper;
import com.umg.sgau.colegiatura.entity.Colegiatura;
import com.umg.sgau.colegiatura.dto.ColegiaturaDTO;
public final class ColegiaturaMapper {
    private ColegiaturaMapper(){
    }
    public static ColegiaturaDTO aDTO(Colegiatura e){
        ColegiaturaDTO d=new ColegiaturaDTO();
        d.setId(e.getId());
        d.setInscripcionId(e.getInscripcionId());
        d.setMes(e.getMes());
        d.setMonto(e.getMonto());
        d.setFechaVencimiento(e.getFechaVencimiento());
        d.setFechaPago(e.getFechaPago());
        d.setEstado(e.getEstado());
        return d;
    }
}

package com.umg.sgau.inscripcion.mapper;
import com.umg.sgau.inscripcion.entity.Inscripcion;
import com.umg.sgau.inscripcion.dto.InscripcionDTO;
public final class InscripcionMapper {
    private InscripcionMapper(){
    }
    public static InscripcionDTO aDTO(Inscripcion e){
        InscripcionDTO d=new InscripcionDTO();
        d.setId(e.getId());
        d.setEstudianteId(e.getEstudianteId());
        d.setCarreraId(e.getCarreraId());
        d.setCicloAcademico(e.getCicloAcademico());
        d.setFechaInscripcion(e.getFechaInscripcion());
        d.setEstado(e.getEstado());
        return d;
    }
}

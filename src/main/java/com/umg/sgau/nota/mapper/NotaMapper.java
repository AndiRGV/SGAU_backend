package com.umg.sgau.nota.mapper;
import com.umg.sgau.nota.entity.Nota;
import com.umg.sgau.nota.dto.NotaDTO;
public final class NotaMapper {
    private NotaMapper(){
    }
    public static NotaDTO aDTO(Nota e){
        NotaDTO d=new NotaDTO();
        d.setId(e.getId());
        d.setInscripcionId(e.getInscripcionId());
        d.setCursoId(e.getCursoId());
        d.setDocenteId(e.getDocenteId());
        d.setCalificacion(e.getCalificacion());
        d.setPeriodo(e.getPeriodo());
        d.setObservacion(e.getObservacion());
        return d;
    }
}

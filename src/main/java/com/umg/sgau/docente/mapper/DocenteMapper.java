package com.umg.sgau.docente.mapper;
import com.umg.sgau.docente.entity.Docente;
import com.umg.sgau.docente.dto.DocenteDTO;
public final class DocenteMapper {
    private DocenteMapper(){
    }
    public static DocenteDTO aDTO(Docente e){
        DocenteDTO d=new DocenteDTO();
        d.setId(e.getId());
        d.setUsuarioId(e.getUsuarioId());
        d.setCodigoDocente(e.getCodigoDocente());
        d.setEspecialidad(e.getEspecialidad());
        d.setTelefono(e.getTelefono());
        return d;
    }
}

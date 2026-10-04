package com.umg.sgau.curso.mapper;
import com.umg.sgau.curso.entity.Curso;
import com.umg.sgau.curso.dto.CursoDTO;
public final class CursoMapper {
    private CursoMapper(){
    }
    public static CursoDTO aDTO(Curso e){
        CursoDTO d=new CursoDTO();
        d.setId(e.getId());
        d.setCarreraId(e.getCarreraId());
        d.setCodigo(e.getCodigo());
        d.setNombre(e.getNombre());
        d.setDescripcion(e.getDescripcion());
        d.setCreditos(e.getCreditos());
        d.setDocenteId(e.getDocenteId());
        return d;
    }
}

package com.umg.sgau.estudiante.mapper;
import com.umg.sgau.estudiante.entity.Estudiante;
import com.umg.sgau.estudiante.dto.EstudianteDTO;
public final class EstudianteMapper {
    private EstudianteMapper(){
    }
    public static EstudianteDTO aDTO(Estudiante e){
        EstudianteDTO d=new EstudianteDTO();
        d.setId(e.getId());
        d.setUsuarioId(e.getUsuarioId());
        d.setCodigoEstudiante(e.getCodigoEstudiante());
        d.setTelefono(e.getTelefono());
        d.setDireccion(e.getDireccion());
        d.setFechaNacimiento(e.getFechaNacimiento());
        return d;
    }
}

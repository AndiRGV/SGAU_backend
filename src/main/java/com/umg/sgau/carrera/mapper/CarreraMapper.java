package com.umg.sgau.carrera.mapper;
import com.umg.sgau.carrera.entity.Carrera;
import com.umg.sgau.carrera.dto.CarreraDTO;
public final class CarreraMapper {
    private CarreraMapper(){
    }
    public static CarreraDTO aDTO(Carrera e){
        CarreraDTO d=new CarreraDTO();
        d.setId(e.getId());
        d.setNombre(e.getNombre());
        d.setDescripcion(e.getDescripcion());
        d.setDuracionAnios(e.getDuracionAnios());
        d.setActiva(e.getActiva());
        return d;
    }
}

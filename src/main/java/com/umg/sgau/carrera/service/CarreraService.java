package com.umg.sgau.carrera.service;
import com.umg.sgau.carrera.entity.Carrera;
import java.util.List;
public interface CarreraService {
    Carrera crear(Carrera dato);
    List<Carrera> listar();
    Carrera obtener(Long id);
    Carrera actualizar(Long id,  Carrera dato);
    void eliminar(Long id);
}

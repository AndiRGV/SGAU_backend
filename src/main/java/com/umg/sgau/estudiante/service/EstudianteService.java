package com.umg.sgau.estudiante.service;
import com.umg.sgau.estudiante.entity.Estudiante;
import java.util.List;
public interface EstudianteService {
    Estudiante crear(Estudiante dato);
    List<Estudiante> listar();
    Estudiante obtener(Long id);
    Estudiante actualizar(Long id,  Estudiante dato);
    void eliminar(Long id);
}

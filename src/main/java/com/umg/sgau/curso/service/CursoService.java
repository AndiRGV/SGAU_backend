package com.umg.sgau.curso.service;
import com.umg.sgau.curso.entity.Curso;
import java.util.List;
public interface CursoService {
    Curso crear(Curso dato);
    List<Curso> listar();
    Curso obtener(Long id);
    Curso actualizar(Long id,  Curso dato);
    void eliminar(Long id);
}

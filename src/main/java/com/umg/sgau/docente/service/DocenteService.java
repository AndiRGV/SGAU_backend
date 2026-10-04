package com.umg.sgau.docente.service;
import com.umg.sgau.docente.entity.Docente;
import java.util.List;
public interface DocenteService {
    Docente crear(Docente dato);
    List<Docente> listar();
    Docente obtener(Long id);
    Docente actualizar(Long id,  Docente dato);
    void eliminar(Long id);
}

package com.umg.sgau.inscripcion.service;
import com.umg.sgau.inscripcion.entity.Inscripcion;
import java.util.List;
public interface InscripcionService {
    Inscripcion crear(Inscripcion dato);
    List<Inscripcion> listar();
    Inscripcion obtener(Long id);
    Inscripcion actualizar(Long id,  Inscripcion dato);
    void eliminar(Long id);
}

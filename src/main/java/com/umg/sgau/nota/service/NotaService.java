package com.umg.sgau.nota.service;
import com.umg.sgau.nota.entity.Nota;
import java.util.List;
public interface NotaService {
    Nota crear(Nota dato);
    List<Nota> listar();
    Nota obtener(Long id);
    Nota actualizar(Long id,  Nota dato);
    void eliminar(Long id);
}

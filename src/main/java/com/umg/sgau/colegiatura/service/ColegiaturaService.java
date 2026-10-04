package com.umg.sgau.colegiatura.service;
import com.umg.sgau.colegiatura.entity.Colegiatura;
import java.util.List;
public interface ColegiaturaService {
    Colegiatura crear(Colegiatura dato);
    List<Colegiatura> listar();
    Colegiatura obtener(Long id);
    Colegiatura actualizar(Long id,  Colegiatura dato);
    void eliminar(Long id);
}

package com.umg.sgau.colegiatura.service.impl;
import com.umg.sgau.colegiatura.entity.Colegiatura;
import com.umg.sgau.colegiatura.repository.ColegiaturaRepository;
import com.umg.sgau.colegiatura.service.ColegiaturaService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
    public class ColegiaturaServiceImpl implements ColegiaturaService {
    private final ColegiaturaRepository repo;
    public ColegiaturaServiceImpl(ColegiaturaRepository repo){
        this.repo=repo;
    }
    public Colegiatura crear(Colegiatura dato){
        dato.setId(null);
        return repo.save(dato);
    }
    public List<Colegiatura> listar(){
        return repo.findAll();
    }
    public Colegiatura obtener(Long id){
        return repo.findById(id).orElseThrow(()->new EntityNotFoundException("Colegiatura no encontrado: "+id));
    }
    public Colegiatura actualizar(Long id,  Colegiatura dato){
        Colegiatura actual=obtener(id);
        actual.setInscripcionId(dato.getInscripcionId());
        actual.setMes(dato.getMes());
        actual.setMonto(dato.getMonto());
        actual.setFechaVencimiento(dato.getFechaVencimiento());
        actual.setFechaPago(dato.getFechaPago());
        actual.setEstado(dato.getEstado());
        return repo.save(actual);
    }
    public void eliminar(Long id){
        repo.delete(obtener(id));
    }
}

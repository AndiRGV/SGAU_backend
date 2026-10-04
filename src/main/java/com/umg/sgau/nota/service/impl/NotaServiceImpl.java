package com.umg.sgau.nota.service.impl;
import com.umg.sgau.nota.entity.Nota;
import com.umg.sgau.nota.repository.NotaRepository;
import com.umg.sgau.nota.service.NotaService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
    public class NotaServiceImpl implements NotaService {
    private final NotaRepository repo;
    public NotaServiceImpl(NotaRepository repo){
        this.repo=repo;
    }
    public Nota crear(Nota dato){
        dato.setId(null);
        return repo.save(dato);
    }
    public List<Nota> listar(){
        return repo.findAll();
    }
    public Nota obtener(Long id){
        return repo.findById(id).orElseThrow(()->new EntityNotFoundException("Nota no encontrado: "+id));
    }
    public Nota actualizar(Long id,  Nota dato){
        Nota actual=obtener(id);
        actual.setInscripcionId(dato.getInscripcionId());
        actual.setCursoId(dato.getCursoId());
        actual.setDocenteId(dato.getDocenteId());
        actual.setCalificacion(dato.getCalificacion());
        actual.setPeriodo(dato.getPeriodo());
        actual.setObservacion(dato.getObservacion());
        return repo.save(actual);
    }
    public void eliminar(Long id){
        repo.delete(obtener(id));
    }
}

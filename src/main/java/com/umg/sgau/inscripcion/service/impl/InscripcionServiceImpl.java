package com.umg.sgau.inscripcion.service.impl;
import com.umg.sgau.inscripcion.entity.Inscripcion;
import com.umg.sgau.inscripcion.repository.InscripcionRepository;
import com.umg.sgau.inscripcion.service.InscripcionService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
    public class InscripcionServiceImpl implements InscripcionService {
    private final InscripcionRepository repo;
    public InscripcionServiceImpl(InscripcionRepository repo){
        this.repo=repo;
    }
    public Inscripcion crear(Inscripcion dato){
        dato.setId(null);
        return repo.save(dato);
    }
    public List<Inscripcion> listar(){
        return repo.findAll();
    }
    public Inscripcion obtener(Long id){
        return repo.findById(id).orElseThrow(()->new EntityNotFoundException("Inscripcion no encontrado: "+id));
    }
    public Inscripcion actualizar(Long id,  Inscripcion dato){
        Inscripcion actual=obtener(id);
        actual.setEstudianteId(dato.getEstudianteId());
        actual.setCarreraId(dato.getCarreraId());
        actual.setCicloAcademico(dato.getCicloAcademico());
        actual.setFechaInscripcion(dato.getFechaInscripcion());
        actual.setEstado(dato.getEstado());
        return repo.save(actual);
    }
    public void eliminar(Long id){
        repo.delete(obtener(id));
    }
}

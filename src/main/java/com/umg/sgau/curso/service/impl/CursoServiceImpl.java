package com.umg.sgau.curso.service.impl;
import com.umg.sgau.curso.entity.Curso;
import com.umg.sgau.curso.repository.CursoRepository;
import com.umg.sgau.curso.service.CursoService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
    public class CursoServiceImpl implements CursoService {
    private final CursoRepository repo;
    public CursoServiceImpl(CursoRepository repo){
        this.repo=repo;
    }
    public Curso crear(Curso dato){
        dato.setId(null);
        return repo.save(dato);
    }
    public List<Curso> listar(){
        return repo.findAll();
    }
    public Curso obtener(Long id){
        return repo.findById(id).orElseThrow(()->new EntityNotFoundException("Curso no encontrado: "+id));
    }
    public Curso actualizar(Long id,  Curso dato){
        Curso actual=obtener(id);
        actual.setCarreraId(dato.getCarreraId());
        actual.setCodigo(dato.getCodigo());
        actual.setNombre(dato.getNombre());
        actual.setDescripcion(dato.getDescripcion());
        actual.setCreditos(dato.getCreditos());
        actual.setDocenteId(dato.getDocenteId());
        return repo.save(actual);
    }
    public void eliminar(Long id){
        repo.delete(obtener(id));
    }
}

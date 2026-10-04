package com.umg.sgau.estudiante.service.impl;
import com.umg.sgau.estudiante.entity.Estudiante;
import com.umg.sgau.estudiante.repository.EstudianteRepository;
import com.umg.sgau.estudiante.service.EstudianteService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
    public class EstudianteServiceImpl implements EstudianteService {
    private final EstudianteRepository repo;
    public EstudianteServiceImpl(EstudianteRepository repo){
        this.repo=repo;
    }
    public Estudiante crear(Estudiante dato){
        dato.setId(null);
        return repo.save(dato);
    }
    public List<Estudiante> listar(){
        return repo.findAll();
    }
    public Estudiante obtener(Long id){
        return repo.findById(id).orElseThrow(()->new EntityNotFoundException("Estudiante no encontrado: "+id));
    }
    public Estudiante actualizar(Long id,  Estudiante dato){
        Estudiante actual=obtener(id);
        actual.setUsuarioId(dato.getUsuarioId());
        actual.setCodigoEstudiante(dato.getCodigoEstudiante());
        actual.setTelefono(dato.getTelefono());
        actual.setDireccion(dato.getDireccion());
        actual.setFechaNacimiento(dato.getFechaNacimiento());
        return repo.save(actual);
    }
    public void eliminar(Long id){
        repo.delete(obtener(id));
    }
}

package com.umg.sgau.docente.service.impl;
import com.umg.sgau.docente.entity.Docente;
import com.umg.sgau.docente.repository.DocenteRepository;
import com.umg.sgau.docente.service.DocenteService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
    public class DocenteServiceImpl implements DocenteService {
    private final DocenteRepository repo;
    public DocenteServiceImpl(DocenteRepository repo){
        this.repo=repo;
    }
    public Docente crear(Docente dato){
        dato.setId(null);
        return repo.save(dato);
    }
    public List<Docente> listar(){
        return repo.findAll();
    }
    public Docente obtener(Long id){
        return repo.findById(id).orElseThrow(()->new EntityNotFoundException("Docente no encontrado: "+id));
    }
    public Docente actualizar(Long id,  Docente dato){
        Docente actual=obtener(id);
        actual.setUsuarioId(dato.getUsuarioId());
        actual.setCodigoDocente(dato.getCodigoDocente());
        actual.setEspecialidad(dato.getEspecialidad());
        actual.setTelefono(dato.getTelefono());
        return repo.save(actual);
    }
    public void eliminar(Long id){
        repo.delete(obtener(id));
    }
}

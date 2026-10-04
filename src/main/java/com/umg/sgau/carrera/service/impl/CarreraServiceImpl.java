package com.umg.sgau.carrera.service.impl;
import com.umg.sgau.carrera.entity.Carrera;
import com.umg.sgau.carrera.repository.CarreraRepository;
import com.umg.sgau.carrera.service.CarreraService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
    public class CarreraServiceImpl implements CarreraService {
    private final CarreraRepository repo;
    public CarreraServiceImpl(CarreraRepository repo){
        this.repo=repo;
    }
    public Carrera crear(Carrera dato){
        dato.setId(null);
        return repo.save(dato);
    }
    public List<Carrera> listar(){
        return repo.findAll();
    }
    public Carrera obtener(Long id){
        return repo.findById(id).orElseThrow(()->new EntityNotFoundException("Carrera no encontrado: "+id));
    }
    public Carrera actualizar(Long id,  Carrera dato){
        Carrera actual=obtener(id);
        actual.setNombre(dato.getNombre());
        actual.setDescripcion(dato.getDescripcion());
        actual.setDuracionAnios(dato.getDuracionAnios());
        actual.setActiva(dato.getActiva());
        return repo.save(actual);
    }
    public void eliminar(Long id){
        repo.delete(obtener(id));
    }
}

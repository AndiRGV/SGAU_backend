package com.umg.sgau.usuario.service.impl;
import com.umg.sgau.usuario.entity.Usuario;
import com.umg.sgau.usuario.repository.UsuarioRepository;
import com.umg.sgau.usuario.service.UsuarioService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
    public class UsuarioServiceImpl implements UsuarioService {
    private final UsuarioRepository repo;
    public UsuarioServiceImpl(UsuarioRepository repo){
        this.repo=repo;
    }
    public Usuario crear(Usuario dato){
        dato.setId(null);
        return repo.save(dato);
    }
    public List<Usuario> listar(){
        return repo.findAll();
    }
    public Usuario obtener(Long id){
        return repo.findById(id).orElseThrow(()->new EntityNotFoundException("Usuario no encontrado: "+id));
    }
    public Usuario actualizar(Long id,  Usuario dato){
        Usuario actual=obtener(id);
        actual.setUsername(dato.getUsername());
        actual.setPassword(dato.getPassword());
        actual.setEmail(dato.getEmail());
        actual.setNombre(dato.getNombre());
        actual.setApellido(dato.getApellido());
        actual.setActivo(dato.getActivo());
        return repo.save(actual);
    }
    public void eliminar(Long id){
        repo.delete(obtener(id));
    }
}

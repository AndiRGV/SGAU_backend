package com.umg.sgau.usuario.service;
import com.umg.sgau.usuario.entity.Usuario;
import java.util.List;
public interface UsuarioService {
    Usuario crear(Usuario dato);
    List<Usuario> listar();
    Usuario obtener(Long id);
    Usuario actualizar(Long id,  Usuario dato);
    void eliminar(Long id);
}

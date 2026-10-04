package com.umg.sgau.usuario.mapper;
import com.umg.sgau.usuario.entity.Usuario;
import com.umg.sgau.usuario.dto.UsuarioDTO;
public final class UsuarioMapper {
    private UsuarioMapper(){
    }
    public static UsuarioDTO aDTO(Usuario e){
        UsuarioDTO d=new UsuarioDTO();
        d.setId(e.getId());
        d.setUsername(e.getUsername());
        d.setPassword(e.getPassword());
        d.setEmail(e.getEmail());
        d.setNombre(e.getNombre());
        d.setApellido(e.getApellido());
        d.setActivo(e.getActivo());
        return d;
    }
}

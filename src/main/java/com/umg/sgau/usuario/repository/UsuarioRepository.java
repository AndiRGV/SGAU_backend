package com.umg.sgau.usuario.repository;
import com.umg.sgau.usuario.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
    public interface UsuarioRepository extends JpaRepository<Usuario,  Long> {
}

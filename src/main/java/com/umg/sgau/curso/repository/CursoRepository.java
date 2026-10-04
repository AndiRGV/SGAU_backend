package com.umg.sgau.curso.repository;
import com.umg.sgau.curso.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
    public interface CursoRepository extends JpaRepository<Curso,  Long> {
}

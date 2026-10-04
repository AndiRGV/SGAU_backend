package com.umg.sgau.estudiante.repository;
import com.umg.sgau.estudiante.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
    public interface EstudianteRepository extends JpaRepository<Estudiante,  Long> {
}

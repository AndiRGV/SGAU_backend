package com.umg.sgau.carrera.repository;
import com.umg.sgau.carrera.entity.Carrera;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
    public interface CarreraRepository extends JpaRepository<Carrera,  Long> {
}

package com.umg.sgau.colegiatura.repository;
import com.umg.sgau.colegiatura.entity.Colegiatura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
    public interface ColegiaturaRepository extends JpaRepository<Colegiatura,  Long> {
}

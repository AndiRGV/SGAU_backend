package com.umg.sgau.nota.repository;
import com.umg.sgau.nota.entity.Nota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
    public interface NotaRepository extends JpaRepository<Nota,  Long> {
}

package com.umg.sgau.curso.controller;
import com.umg.sgau.curso.entity.Curso;
import com.umg.sgau.curso.service.CursoService;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import java.util.List;
@RestController
    @RequestMapping("/api/cursos")
    public class CursoController {
    private final CursoService servicio;
    public CursoController(CursoService servicio){
        this.servicio=servicio;
    }
    @PostMapping
    public ResponseEntity<Curso> crear(@Valid
    @RequestBody Curso dato){
        return ResponseEntity.status(HttpStatus.CREATED).body(servicio.crear(dato));
    }
    @GetMapping
    public ResponseEntity<List<Curso>> listar(){
        return ResponseEntity.ok(servicio.listar());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Curso> obtener(@PathVariable Long id){
        return ResponseEntity.ok(servicio.obtener(id));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Curso> actualizar(@PathVariable Long id,  @Valid
    @RequestBody Curso dato){
        return ResponseEntity.ok(servicio.actualizar(id,  dato));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id){
        servicio.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}

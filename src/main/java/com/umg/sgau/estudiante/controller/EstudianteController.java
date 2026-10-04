package com.umg.sgau.estudiante.controller;
import com.umg.sgau.estudiante.entity.Estudiante;
import com.umg.sgau.estudiante.service.EstudianteService;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import java.util.List;
@RestController
    @RequestMapping("/api/estudiantes")
    public class EstudianteController {
    private final EstudianteService servicio;
    public EstudianteController(EstudianteService servicio){
        this.servicio=servicio;
    }
    @PostMapping
    public ResponseEntity<Estudiante> crear(@Valid
    @RequestBody Estudiante dato){
        return ResponseEntity.status(HttpStatus.CREATED).body(servicio.crear(dato));
    }
    @GetMapping
    public ResponseEntity<List<Estudiante>> listar(){
        return ResponseEntity.ok(servicio.listar());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Estudiante> obtener(@PathVariable Long id){
        return ResponseEntity.ok(servicio.obtener(id));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Estudiante> actualizar(@PathVariable Long id,  @Valid
    @RequestBody Estudiante dato){
        return ResponseEntity.ok(servicio.actualizar(id,  dato));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id){
        servicio.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}

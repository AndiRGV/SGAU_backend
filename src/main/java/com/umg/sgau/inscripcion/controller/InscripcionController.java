package com.umg.sgau.inscripcion.controller;
import com.umg.sgau.inscripcion.entity.Inscripcion;
import com.umg.sgau.inscripcion.service.InscripcionService;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import java.util.List;
@RestController
    @RequestMapping("/api/inscripciones")
    public class InscripcionController {
    private final InscripcionService servicio;
    public InscripcionController(InscripcionService servicio){
        this.servicio=servicio;
    }
    @PostMapping
    public ResponseEntity<Inscripcion> crear(@Valid
    @RequestBody Inscripcion dato){
        return ResponseEntity.status(HttpStatus.CREATED).body(servicio.crear(dato));
    }
    @GetMapping
    public ResponseEntity<List<Inscripcion>> listar(){
        return ResponseEntity.ok(servicio.listar());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Inscripcion> obtener(@PathVariable Long id){
        return ResponseEntity.ok(servicio.obtener(id));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Inscripcion> actualizar(@PathVariable Long id,  @Valid
    @RequestBody Inscripcion dato){
        return ResponseEntity.ok(servicio.actualizar(id,  dato));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id){
        servicio.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}

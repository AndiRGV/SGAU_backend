package com.umg.sgau.docente.controller;
import com.umg.sgau.docente.entity.Docente;
import com.umg.sgau.docente.service.DocenteService;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import java.util.List;
@RestController
    @RequestMapping("/api/docentes")
    public class DocenteController {
    private final DocenteService servicio;
    public DocenteController(DocenteService servicio){
        this.servicio=servicio;
    }
    @PostMapping
    public ResponseEntity<Docente> crear(@Valid
    @RequestBody Docente dato){
        return ResponseEntity.status(HttpStatus.CREATED).body(servicio.crear(dato));
    }
    @GetMapping
    public ResponseEntity<List<Docente>> listar(){
        return ResponseEntity.ok(servicio.listar());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Docente> obtener(@PathVariable Long id){
        return ResponseEntity.ok(servicio.obtener(id));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Docente> actualizar(@PathVariable Long id,  @Valid
    @RequestBody Docente dato){
        return ResponseEntity.ok(servicio.actualizar(id,  dato));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id){
        servicio.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}

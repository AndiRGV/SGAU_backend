package com.umg.sgau.colegiatura.controller;
import com.umg.sgau.colegiatura.entity.Colegiatura;
import com.umg.sgau.colegiatura.service.ColegiaturaService;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import java.util.List;
@RestController
    @RequestMapping("/api/colegiaturas")
    public class ColegiaturaController {
    private final ColegiaturaService servicio;
    public ColegiaturaController(ColegiaturaService servicio){
        this.servicio=servicio;
    }
    @PostMapping
    public ResponseEntity<Colegiatura> crear(@Valid
    @RequestBody Colegiatura dato){
        return ResponseEntity.status(HttpStatus.CREATED).body(servicio.crear(dato));
    }
    @GetMapping
    public ResponseEntity<List<Colegiatura>> listar(){
        return ResponseEntity.ok(servicio.listar());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Colegiatura> obtener(@PathVariable Long id){
        return ResponseEntity.ok(servicio.obtener(id));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Colegiatura> actualizar(@PathVariable Long id,  @Valid
    @RequestBody Colegiatura dato){
        return ResponseEntity.ok(servicio.actualizar(id,  dato));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id){
        servicio.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}

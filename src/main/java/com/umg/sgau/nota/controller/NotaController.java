package com.umg.sgau.nota.controller;
import com.umg.sgau.nota.entity.Nota;
import com.umg.sgau.nota.service.NotaService;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import java.util.List;
@RestController
    @RequestMapping("/api/notas")
    public class NotaController {
    private final NotaService servicio;
    public NotaController(NotaService servicio){
        this.servicio=servicio;
    }
    @PostMapping
    public ResponseEntity<Nota> crear(@Valid
    @RequestBody Nota dato){
        return ResponseEntity.status(HttpStatus.CREATED).body(servicio.crear(dato));
    }
    @GetMapping
    public ResponseEntity<List<Nota>> listar(){
        return ResponseEntity.ok(servicio.listar());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Nota> obtener(@PathVariable Long id){
        return ResponseEntity.ok(servicio.obtener(id));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Nota> actualizar(@PathVariable Long id,  @Valid
    @RequestBody Nota dato){
        return ResponseEntity.ok(servicio.actualizar(id,  dato));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id){
        servicio.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}

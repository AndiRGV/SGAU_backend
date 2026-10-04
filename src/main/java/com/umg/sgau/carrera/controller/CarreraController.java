package com.umg.sgau.carrera.controller;
import com.umg.sgau.carrera.entity.Carrera;
import com.umg.sgau.carrera.service.CarreraService;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import java.util.List;
@RestController
    @RequestMapping("/api/carreras")
    public class CarreraController {
    private final CarreraService servicio;
    public CarreraController(CarreraService servicio){
        this.servicio=servicio;
    }
    @PostMapping
    public ResponseEntity<Carrera> crear(@Valid
    @RequestBody Carrera dato){
        return ResponseEntity.status(HttpStatus.CREATED).body(servicio.crear(dato));
    }
    @GetMapping
    public ResponseEntity<List<Carrera>> listar(){
        return ResponseEntity.ok(servicio.listar());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Carrera> obtener(@PathVariable Long id){
        return ResponseEntity.ok(servicio.obtener(id));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Carrera> actualizar(@PathVariable Long id,  @Valid
    @RequestBody Carrera dato){
        return ResponseEntity.ok(servicio.actualizar(id,  dato));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id){
        servicio.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}

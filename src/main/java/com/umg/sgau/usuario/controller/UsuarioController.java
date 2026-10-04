package com.umg.sgau.usuario.controller;
import com.umg.sgau.usuario.entity.Usuario;
import com.umg.sgau.usuario.service.UsuarioService;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import java.util.List;
@RestController
    @RequestMapping("/api/usuarios")
    public class UsuarioController {
    private final UsuarioService servicio;
    public UsuarioController(UsuarioService servicio){
        this.servicio=servicio;
    }
    @PostMapping
    public ResponseEntity<Usuario> crear(@Valid
    @RequestBody Usuario dato){
        return ResponseEntity.status(HttpStatus.CREATED).body(servicio.crear(dato));
    }
    @GetMapping
    public ResponseEntity<List<Usuario>> listar(){
        return ResponseEntity.ok(servicio.listar());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Usuario> obtener(@PathVariable Long id){
        return ResponseEntity.ok(servicio.obtener(id));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Usuario> actualizar(@PathVariable Long id,  @Valid
    @RequestBody Usuario dato){
        return ResponseEntity.ok(servicio.actualizar(id,  dato));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id){
        servicio.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}

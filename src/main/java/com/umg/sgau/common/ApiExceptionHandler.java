package com.umg.sgau.common;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import jakarta.persistence.EntityNotFoundException;
import java.util.*;
@RestControllerAdvice
    public class ApiExceptionHandler {
    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<Map<String,  Object>> notFound(RuntimeException e){
        return ResponseEntity.status(404).body(Map.of("status",  404, "error", "NOT_FOUND", "message",  e.getMessage()));
    }
    @ExceptionHandler(org.springframework.dao.DataIntegrityViolationException.class)
    public ResponseEntity<Map<String,  Object>> conflict(Exception e){
        return ResponseEntity.status(409).body(Map.of("status",  409, "error", "CONFLICT", "message", "No se puede guardar: revise duplicados y relaciones existentes."));
    }
    @ExceptionHandler(org.springframework.web.bind.MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String,  Object>> invalid(Exception e){
        return ResponseEntity.badRequest().body(Map.of("status",  400, "error", "BAD_REQUEST", "message", "Datos de entrada no validos."));
    }
    @ExceptionHandler(Exception.class)
    public ResponseEntity<Map<String,  Object>> generic(Exception e){
        return ResponseEntity.status(500).body(Map.of("status",  500, "error", "INTERNAL_SERVER_ERROR", "message", "Ocurrio un error procesando la solicitud."));
    }
}

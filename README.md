# Sistema de Gestión Académica Universitaria (SGAU)

Backend REST para Java 17, Spring Boot 3, Maven y PostgreSQL. Proyecto organizado por dominio y siguiendo la secuencia Entity → Repository → Service → ServiceImpl → DTO → Mapper → Controller indicada en la guía de API Usuarios.

## Requisitos
- JDK 17 o superior
- IntelliJ IDEA
- Maven 3.9+
- PostgreSQL 17+

## Preparar PostgreSQL
1. Abrir pgAdmin o psql y ejecutar `sql/sgau_db.sql` conectado al servidor PostgreSQL. El script crea `sgau_db` y sus tablas.
2. Si tu usuario/clave no son `postgres`/`postgres`, configura variables de entorno `DB_USER` y `DB_PASSWORD`, o edita `src/main/resources/application.properties`.
3. Si ejecutas el script en una herramienta que no admite `\connect`, crea primero la base `sgau_db`, conéctate a ella y ejecuta el resto del script desde `CREATE TABLE`.

## Ejecutar en IntelliJ
1. Extrae el ZIP y abre la carpeta que contiene `pom.xml` como proyecto Maven.
2. Selecciona JDK 17 en File → Project Structure → Project SDK.
3. Espera a que Maven descargue dependencias.
4. Ejecuta `SgauApplication.java`.
5. La API escucha en `http://localhost:9001`.
6. Documentación interactiva: `http://localhost:9001/swagger-ui.html`.

## Endpoints CRUD
Todos los módulos exponen `POST`, `GET`, `GET /{id}`, `PUT /{id}` y `DELETE /{id}`:
- `/api/usuarios`
- `/api/estudiantes`
- `/api/docentes`
- `/api/carreras`
- `/api/cursos`
- `/api/inscripciones`
- `/api/colegiaturas`
- `/api/notas`

Las relaciones se envían como IDs: `usuarioId`, `estudianteId`, `docenteId`, `carreraId`, `cursoId` e `inscripcionId` según el módulo. PostgreSQL rechaza IDs relacionados inexistentes.

## Ejemplos de JSON
Usuario:
```json
{"username":"mlopez","password":"cambiar-esto","email":"mlopez@umg.edu.gt","nombre":"Maria","apellido":"Lopez","activo":true}
```
Estudiante (requiere un `usuarioId` existente):
```json
{"usuarioId":1,"codigoEstudiante":"2026001","telefono":"55555555","direccion":"Guatemala","fechaNacimiento":"2004-05-12"}
```
Carrera:
```json
{"nombre":"Ingenieria en Sistemas","descripcion":"Plan de estudios de sistemas","duracionAnios":5,"activa":true}
```
Curso:
```json
{"carreraId":1,"codigo":"PROG101","nombre":"Programacion I","descripcion":"Fundamentos de programacion","creditos":4,"docenteId":1}
```
Inscripcion:
```json
{"estudianteId":1,"carreraId":1,"cicloAcademico":"2026-2","fechaInscripcion":"2026-10-03","estado":"ACTIVA"}
```
Colegiatura:
```json
{"inscripcionId":1,"mes":"Octubre 2026","monto":850.00,"fechaVencimiento":"2026-10-10","fechaPago":null,"estado":"PENDIENTE"}
```
Nota:
```json
{"inscripcionId":1,"cursoId":1,"docenteId":1,"calificacion":85.50,"periodo":"Primer parcial","observacion":"Buen trabajo"}
```

## Importante sobre alcance
Este ZIP implementa CRUD funcional para los ocho dominios y relaciones mediante claves foráneas, DTO/Mapper por dominio y documentación Swagger. La especificación completa del curso también pide autenticación JWT, roles, BCrypt, paginación, eliminación lógica, Docker y colección Postman; estos elementos no están completamente implementados en esta primera base y deben añadirse si la entrega se evaluará contra todos los requisitos del documento. La API de usuarios sigue el estilo CRUD de la guía compartida.

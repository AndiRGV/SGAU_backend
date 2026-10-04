-- Sistema de Gestion Academica Universitaria (SGAU)
-- Ejecutar conectado a PostgreSQL como usuario con permisos de crear base de datos.
CREATE DATABASE sgau_db;
\connect sgau_db;

CREATE TABLE usuarios (
 id BIGSERIAL PRIMARY KEY,
 username VARCHAR(255) UNIQUE,
 password VARCHAR(255) NOT NULL,
 email VARCHAR(255) UNIQUE,
 nombre VARCHAR(255),
 apellido VARCHAR(255),
 activo BOOLEAN DEFAULT TRUE
);

CREATE TABLE estudiantes (
 id BIGSERIAL PRIMARY KEY,
 usuario_id BIGINT,
 codigo_estudiante VARCHAR(255) UNIQUE,
 telefono VARCHAR(255),
 direccion VARCHAR(255),
 fecha_nacimiento DATE,
 CONSTRAINT fk_estudiantes_usuarioid FOREIGN KEY (usuario_id) REFERENCES usuarios(id) ON DELETE RESTRICT
);

CREATE TABLE docentes (
 id BIGSERIAL PRIMARY KEY,
 usuario_id BIGINT,
 codigo_docente VARCHAR(255) UNIQUE,
 especialidad VARCHAR(255),
 telefono VARCHAR(255),
 CONSTRAINT fk_docentes_usuarioid FOREIGN KEY (usuario_id) REFERENCES usuarios(id) ON DELETE RESTRICT
);

CREATE TABLE carreras (
 id BIGSERIAL PRIMARY KEY,
 nombre VARCHAR(255),
 descripcion VARCHAR(255),
 duracion_anios INTEGER,
 activa BOOLEAN DEFAULT TRUE
);

CREATE TABLE cursos (
 id BIGSERIAL PRIMARY KEY,
 carrera_id BIGINT,
 codigo VARCHAR(255) UNIQUE,
 nombre VARCHAR(255),
 descripcion VARCHAR(255),
 creditos INTEGER,
 docente_id BIGINT,
 CONSTRAINT fk_cursos_carreraid FOREIGN KEY (carrera_id) REFERENCES carreras(id) ON DELETE RESTRICT,
 CONSTRAINT fk_cursos_docenteid FOREIGN KEY (docente_id) REFERENCES docentes(id) ON DELETE RESTRICT
);

CREATE TABLE inscripciones (
 id BIGSERIAL PRIMARY KEY,
 estudiante_id BIGINT,
 carrera_id BIGINT,
 ciclo_academico VARCHAR(255),
 fecha_inscripcion DATE DEFAULT CURRENT_DATE,
 estado VARCHAR(255),
 CONSTRAINT fk_inscripciones_estudianteid FOREIGN KEY (estudiante_id) REFERENCES estudiantes(id) ON DELETE RESTRICT,
 CONSTRAINT fk_inscripciones_carreraid FOREIGN KEY (carrera_id) REFERENCES carreras(id) ON DELETE RESTRICT
);

CREATE TABLE colegiaturas (
 id BIGSERIAL PRIMARY KEY,
 inscripcion_id BIGINT,
 mes VARCHAR(255),
 monto NUMERIC(10,2),
 fecha_vencimiento DATE,
 fecha_pago DATE,
 estado VARCHAR(255),
 CONSTRAINT fk_colegiaturas_inscripcionid FOREIGN KEY (inscripcion_id) REFERENCES inscripciones(id) ON DELETE RESTRICT
);

CREATE TABLE notas (
 id BIGSERIAL PRIMARY KEY,
 inscripcion_id BIGINT,
 curso_id BIGINT,
 docente_id BIGINT,
 calificacion NUMERIC(10,2),
 periodo VARCHAR(255),
 observacion VARCHAR(255),
 CONSTRAINT fk_notas_inscripcionid FOREIGN KEY (inscripcion_id) REFERENCES inscripciones(id) ON DELETE RESTRICT,
 CONSTRAINT fk_notas_cursoid FOREIGN KEY (curso_id) REFERENCES cursos(id) ON DELETE RESTRICT,
 CONSTRAINT fk_notas_docenteid FOREIGN KEY (docente_id) REFERENCES docentes(id) ON DELETE RESTRICT
);

CREATE INDEX idx_estudiantes_usuario_id ON estudiantes(usuario_id);
CREATE INDEX idx_docentes_usuario_id ON docentes(usuario_id);
CREATE INDEX idx_inscripciones_estudiante_id ON inscripciones(estudiante_id);
CREATE INDEX idx_notas_inscripcion_id ON notas(inscripcion_id);
CREATE INDEX idx_colegiaturas_inscripcion_id ON colegiaturas(inscripcion_id);

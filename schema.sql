-- Script de creación de la base de datos de Consulta Médica
-- Ubicación: Raíz del proyecto

CREATE DATABASE IF NOT EXISTS consulta_medica;
USE consulta_medica;

-- Tabla para la Entidad Medico
CREATE TABLE IF NOT EXISTS medico (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255),
    apellidos VARCHAR(255),
    especialidad VARCHAR(255),
    num_colegiado VARCHAR(255)
);

-- Tabla para la Entidad Paciente
CREATE TABLE IF NOT EXISTS paciente (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255),
    apellidos VARCHAR(255),
    fecha_nacimiento DATE,
    num_seguridad_social VARCHAR(255)
);
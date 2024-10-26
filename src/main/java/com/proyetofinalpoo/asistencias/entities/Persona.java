package com.proyetofinalpoo.asistencias.entities;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

/**
 *
 * @author victortinoco
 */

@MappedSuperclass
public class Persona extends Auditoria {
    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "APELLIDO")
    private String apellido;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String estado) {
        super(estado);
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}

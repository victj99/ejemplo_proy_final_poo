package com.proyetofinalpoo.asistencias.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.proyetofinalpoo.asistencias.utils.Constantes;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

/**
 *
 * @author victortinoco
 */

@MappedSuperclass
public class Auditoria implements Serializable {

    @Column(name = "ESTADO")
    private String estado; // A: Activo, I: Inactivo

    @Column(name = "FECHA_CREACION")
    private LocalDateTime fechaCreacion;

    @Column(name = "FECHA_MODIFICACION")
    private LocalDateTime fechaModificacion;

    public Auditoria() {
        this.estado = Constantes.ESTADO_ACTIVO;
        fechaCreacion = LocalDateTime.now();
    }

    public Auditoria(String estado) {
        this.estado = estado;
        fechaCreacion = LocalDateTime.now();
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDateTime getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(LocalDateTime fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }
}

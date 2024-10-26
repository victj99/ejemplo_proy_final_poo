package com.proyetofinalpoo.asistencias.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author victortinoco
 */

@Getter
@Setter
@Entity
public class Empresa extends Auditoria {

    @Id
    @Column(name = "ID_EMPRESA")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmpresa;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "RUC")
    private String ruc;

    public Empresa() {
    }

    public Empresa(String estado, Long idEmpresa, String nombre) {
        super(estado);
        this.idEmpresa = idEmpresa;
        this.nombre = nombre;
    }

    public Empresa(Long idEmpresa) {
        this.idEmpresa = idEmpresa;
    }
}

package com.proyetofinalpoo.asistencias.models;

import com.proyetofinalpoo.asistencias.models.views.FiltroBase;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FiltroUsuario extends FiltroBase {
    private Long id;
    private String nombreApellido;
    private String nombreUsuario;
    private String nombreEmpresa;
    private String estado;

    public FiltroUsuario() {
    }
}

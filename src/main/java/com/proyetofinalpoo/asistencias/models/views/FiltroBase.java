package com.proyetofinalpoo.asistencias.models.views;

import com.proyetofinalpoo.asistencias.models.TipoOrder;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class FiltroBase {
    private TipoOrder tipoOrder;

    public FiltroBase() {
    }
}

package com.proyetofinalpoo.asistencias.models.views;

/**
 * Representa un parámetro el cual es un valor que se transferirá entre formularios.
 */
public interface Params {
    public Object getValue();

    public String getClassName();

    public record IdParam(Long id) implements Params {

        @Override
        public Long getValue() {
            return id;
        }

        @Override
        public String getClassName() {
            return getClass().getName();
        }
    }

}

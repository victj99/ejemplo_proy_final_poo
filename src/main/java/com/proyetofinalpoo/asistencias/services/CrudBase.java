package com.proyetofinalpoo.asistencias.services;

import java.util.List;

public interface CrudBase<T> {

    public abstract List<T> listarTodosDatos();

    public abstract void registrarDatos(T entity);

    public abstract void actualizarDatos(T entity);

    public abstract T obtenerPorId(Long id);
}

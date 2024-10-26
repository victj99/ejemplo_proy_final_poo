package com.proyetofinalpoo.asistencias.models.views;

import java.util.HashMap;
import java.util.Map;

/**
 * Contenedor de parámetros para un formulario.
 */
public class ViewParams {

    private Map<String, Params> paramsMap = new HashMap<>();

    public void agregarParams(Params... params) {
        if (params == null || params.length == 0) {
            paramsMap.clear(); // limpiamos todos los params ya que al cambiar de ventana aún se quedan guardado los datos
            return;
        }

        for (Params item : params) {
            paramsMap.put(item.getClassName(), item);
        }
    }

    public void agregarParam(Params parametro) {
        paramsMap.put(parametro.getClassName(), parametro);
    }

    /**
     * Obtiene un parámetro del contenedor por su tipo.
     *
     * @param clase
     *        La clase del parámetro a obtener.
     * @return El parámetro correspondiente, o null si no se encuentra.
     */
    @SuppressWarnings("unchecked")
    public <T extends Params> T obtenerParam(Class<T> clase) {
        return (T) paramsMap.get(clase.getName());
    }

    public void limpiarParams() {
        paramsMap.clear();
    }
}

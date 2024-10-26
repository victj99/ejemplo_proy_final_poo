package com.proyetofinalpoo.asistencias.views;

import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.proyetofinalpoo.asistencias.models.views.Params;
import com.proyetofinalpoo.asistencias.models.views.ViewParams;

/*
 * Clase base que heredarán los formularios, esta tiene funciones reutilizables necesarios en todos los formularios
 */
@Component
public abstract class BaseView extends javax.swing.JFrame {
    final ViewParams viewParams = new ViewParams();

    @Autowired
    private ApplicationContext appContext;

    protected abstract void limpiar();

    public abstract void iniciarVentana();

    public void mostrarVentana() {
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        iniciarVentana();
    }

    /**
     * Muestra el formulario de la clase pasada como parámetro y oculta la ventana actual.
     * <p>
     * Si se intenta acceder directamente a {@code BaseView}, se mostrará un mensaje de error y la operación se detendrá.
     * </p>
     * Uso: Se debe pasar una clase que extienda BaseView, por ejemplo, abrirFormulario(PrincipalView.class).
     * </p>
     * 
     * @param formClass
     *        la clase del formulario que hereda de {@code BaseView} a la que se desea navegar
     */
    public void abrirFormulario(Class<? extends BaseView> formClass, Params... params) {
        if (formClass.equals(BaseView.class)) {
            JOptionPane.showMessageDialog(rootPane, "No se puede acceder a este formulario", "Acción inválida", JOptionPane.ERROR_MESSAGE);
        }

        var view = appContext.getBean(formClass);
        view.viewParams.agregarParams(params);
        view.mostrarVentana();

        this.dispose();
    }
}

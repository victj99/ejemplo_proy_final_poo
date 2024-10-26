package com.proyetofinalpoo.asistencias;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import com.proyetofinalpoo.asistencias.views.IniciarSesionView;

@SpringBootApplication
public class AsistenciasApplication {
    // public static ConfigurableApplicationContext ctx;

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception ex) {
        }

        // SpringApplication.run(AsistenciasApplication.class, args);
        var ctx = new SpringApplicationBuilder(AsistenciasApplication.class)
                .headless(false).run(args);

        SwingUtilities.invokeLater(() -> {
            IniciarSesionView view = ctx.getBean(IniciarSesionView.class);
            view.mostrarVentana();
        });
    }

}

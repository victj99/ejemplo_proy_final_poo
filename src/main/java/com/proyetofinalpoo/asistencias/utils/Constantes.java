package com.proyetofinalpoo.asistencias.utils;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.UIManager;
import javax.swing.border.Border;

public class Constantes {
    public static final String ESTADO_ACTIVO = "A";
    public static final String ESTADO_INACTIVO = "I";

    // Constantes de UI
    public static final Border ERROR_BORDER = BorderFactory.createLineBorder(Color.RED, 2);
    public static final Border DEFAULT_BORDER = UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border");
}

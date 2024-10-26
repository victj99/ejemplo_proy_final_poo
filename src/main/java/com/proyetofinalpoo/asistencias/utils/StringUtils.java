package com.proyetofinalpoo.asistencias.utils;

public class StringUtils {
    public static boolean isEmpty(String str) {
        return str == null || str.trim().isBlank();
    }
}

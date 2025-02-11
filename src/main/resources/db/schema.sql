CREATE TABLE IF NOT EXISTS EMPRESA (
    ID_EMPRESA INTEGER PRIMARY KEY,
    NOMBRE TEXT NOT NULL,
    RUC TEXT,

    ESTADO TEXT NOT NULL,
    FECHA_CREACION DATETIME NOT NULL,
    FECHA_MODIFICACION DATETIME
);

CREATE TABLE IF NOT EXISTS USUARIO (
    ID_USUARIO INTEGER PRIMARY KEY,
    NOMBRE TEXT NOT NULL,
    APELLIDO TEXT NOT NULL,
    NOMBRE_USUARIO TEXT NOT NULL UNIQUE,
    CONTRASENIA TEXT,

    ID_EMPRESA INTEGER,

    ESTADO TEXT NOT NULL,
    FECHA_CREACION DATETIME NOT NULL,
    FECHA_MODIFICACION DATETIME,

    FOREIGN KEY(ID_EMPRESA) REFERENCES EMPRESA(ID_EMPRESA)
);
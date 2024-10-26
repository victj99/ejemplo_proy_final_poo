-- Uso select porque es la unica forma de que solo se registren 1 vez los datos
INSERT INTO USUARIO (NOMBRE, APELLIDO, NOMBRE_USUARIO, CONTRASENIA, ESTADO, FECHA_CREACION)
SELECT 'Juan', 'Pérez', 'admin', '123456', 'A', '2024-10-11 12:00:00'
WHERE NOT EXISTS (SELECT 1 FROM USUARIO WHERE ID_USUARIO = 1);

INSERT INTO USUARIO (NOMBRE, APELLIDO, NOMBRE_USUARIO, CONTRASENIA, ESTADO, FECHA_CREACION)
SELECT 'María', 'Gómez', 'mgomez', 'securepass', 'I', '2024-10-11 12:30:00'
WHERE NOT EXISTS (SELECT 1 FROM USUARIO WHERE ID_USUARIO = 2);

INSERT INTO USUARIO (NOMBRE, APELLIDO, NOMBRE_USUARIO, CONTRASENIA, ESTADO, FECHA_CREACION)
SELECT 'Carlos', 'López', 'clopez', 'mypassword', 'A', '2024-10-11 13:00:00'
WHERE NOT EXISTS (SELECT 1 FROM USUARIO WHERE ID_USUARIO = 3);

INSERT INTO EMPRESA (NOMBRE, RUC, ESTADO, FECHA_CREACION)
SELECT 'Supermecados del Perú', '20185781289', 'A', '2024-10-11 12:00:00'
WHERE NOT EXISTS (SELECT 1 FROM EMPRESA WHERE ID_EMPRESA = 1);

INSERT INTO EMPRESA (NOMBRE, RUC, ESTADO, FECHA_CREACION)
SELECT 'Petro Perú', '20185781289', 'A', '2024-10-11 12:00:00'
WHERE NOT EXISTS (SELECT 1 FROM EMPRESA WHERE ID_EMPRESA = 2);
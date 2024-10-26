package com.proyetofinalpoo.asistencias.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.proyetofinalpoo.asistencias.entities.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // Cuando se hacen consultas SQL con JPA lo que se usan son los nombres de las clases y las variable mapeadas en estas
    // El uso de alias es obligatorio en este tipo de consultas

    // El signo de interrogacion + numero (?1 y ?2) representa la posicion de los parametros en la función.
    // En este caso nombreUsuario es primero por eso el ?1, esto es algo que usa JPA para pasar parametros en las consultas SQL
    @Query(value = "SELECT t FROM Usuario t WHERE t.nombreUsuario = ?1 AND t.contrasenia = ?2")
    public Usuario obtenerUsuarioByCredenciales(String nombreUsuario, String contrasenia);

    @Query(value = "SELECT t FROM Usuario t WHERE t.nombre LIKE CONCAT('%', ?1,'%') OR t.apellido LIKE CONCAT('%', ?1,'%')")
    public List<Usuario> listarUsuariosByNombreApellido(String nombres);

}

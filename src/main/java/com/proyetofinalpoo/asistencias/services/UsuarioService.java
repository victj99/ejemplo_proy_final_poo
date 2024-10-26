package com.proyetofinalpoo.asistencias.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyetofinalpoo.asistencias.entities.Usuario;
import com.proyetofinalpoo.asistencias.models.FiltroUsuario;
import com.proyetofinalpoo.asistencias.repository.UsuarioRepository;
import com.proyetofinalpoo.asistencias.utils.StringUtils;

@Service
@Transactional(rollbackFor = Exception.class)
public class UsuarioService implements CrudBase<Usuario> {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> listarTodosDatos() {
        return usuarioRepository.findAll();
    }

    @Override
    public void registrarDatos(Usuario entity) {
        usuarioRepository.save(entity);
    }

    @Override
    public void actualizarDatos(Usuario entity) {
        Usuario usuarioExistente = usuarioRepository.findById(entity.getIdUsuario()).get();

        usuarioExistente.setApellido(entity.getApellido());
        usuarioExistente.setNombre(entity.getNombre());
        usuarioExistente.setNombreUsuario(entity.getNombreUsuario());
        usuarioExistente.setContrasenia(entity.getContrasenia());
        usuarioExistente.setIdEmpresa(entity.getIdEmpresa());

        usuarioExistente.setFechaModificacion(LocalDateTime.now());

        usuarioRepository.save(usuarioExistente);
    }

    @Override
    public Usuario obtenerPorId(Long id) {
        return usuarioRepository.findById(id).get();
    }

    public Usuario obtenerUsuarioPorCredenciales(String nombreUsuario, String contrasenia) {
        Usuario usuario = usuarioRepository.obtenerUsuarioByCredenciales(nombreUsuario, contrasenia);

        return usuario;
    }

    public List<Usuario> buscarPorFiltros(FiltroUsuario filtros) {
        if (!StringUtils.isEmpty(filtros.getNombreApellido())) {
            return usuarioRepository.listarUsuariosByNombreApellido(filtros.getNombreApellido());
        }
        // Sino
        return listarTodosDatos();
    }
}

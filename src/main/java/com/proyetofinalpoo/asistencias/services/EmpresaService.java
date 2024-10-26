package com.proyetofinalpoo.asistencias.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyetofinalpoo.asistencias.entities.Empresa;
import com.proyetofinalpoo.asistencias.models.ListItem;
import com.proyetofinalpoo.asistencias.repository.EmpresaRepository;

@Service
@Transactional(rollbackFor = Exception.class)
public class EmpresaService implements CrudBase<Empresa> {

    @Autowired
    private EmpresaRepository empresaRepository;

    @Override
    public List<Empresa> listarTodosDatos() {
        return empresaRepository.findAll();
    }

    @Override
    public void registrarDatos(Empresa entity) {
    }

    @Override
    public void actualizarDatos(Empresa entity) {
    }

    @Override
    public Empresa obtenerPorId(Long id) {
        return null;
    }

    public List<ListItem> listarListItemEmpresa(String filtro) {
        List<Empresa> empresas = empresaRepository.listarEmpresasPorNombreRuc(filtro);

        List<ListItem> datosRespuesta = new ArrayList<>();

        for (Empresa item : empresas) {
            String textoAMostrar = item.getNombre() + " - " + item.getRuc();
            datosRespuesta.add(new ListItem(item.getIdEmpresa(), textoAMostrar));
        }
        return datosRespuesta;
        
        // Si quieres hacerlo mas corto puedes usar la siguiente linea
        // return empresas.stream().map(item -> new ListItem(item.getIdEmpresa(), item.getNombre() + " - " + item.getRuc())).toList();
    }
}

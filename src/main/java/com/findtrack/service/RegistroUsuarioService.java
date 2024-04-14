package com.findtrack.service;

import com.findtrack.entity.RegistroUsuario;

import java.util.List;

public interface RegistroUsuarioService {

    RegistroUsuario guardarUsuario(RegistroUsuario usuario);
    List<RegistroUsuario> obtenerTodosLosUsuarios();
    RegistroUsuario obtenerUsuarioPorId(Long id);
    void eliminarUsuario(Long id);
}

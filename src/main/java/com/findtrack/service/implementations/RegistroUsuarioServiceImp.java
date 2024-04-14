package com.findtrack.service.implementations;

import com.findtrack.entity.RegistroUsuario;
import com.findtrack.service.RegistroUsuarioService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RegistroUsuarioServiceImp implements RegistroUsuarioService {
    @Override
    public RegistroUsuario guardarUsuario(RegistroUsuario usuario) {
        return null;
    }

    @Override
    public List<RegistroUsuario> obtenerTodosLosUsuarios() {
        return null;
    }

    @Override
    public RegistroUsuario obtenerUsuarioPorId(Long id) {
        return null;
    }

    @Override
    public void eliminarUsuario(Long id) {

    }
}

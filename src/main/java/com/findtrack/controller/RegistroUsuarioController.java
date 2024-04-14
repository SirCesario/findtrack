package com.findtrack.controller;

import com.findtrack.entity.RegistroUsuario;
import com.findtrack.service.RegistroUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/registro")
public class RegistroUsuarioController {

    @Autowired
    private RegistroUsuarioService registroUsuarioService;

    @PostMapping("/crear")
    public ResponseEntity<RegistroUsuario> crearUsuario(@RequestBody RegistroUsuario usuario) {
        RegistroUsuario usuarioGuardado = registroUsuarioService.guardarUsuario(usuario);
        return ResponseEntity.ok(usuarioGuardado);
    }
}

package com.example.login.controller;

import com.example.login.entity.Usuario;
import com.example.login.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/registro")
    public ResponseEntity<String> registro(@RequestBody Usuario usuario) {
        String respuesta = authService.registrar(usuario);
        return ResponseEntity.ok(respuesta);
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Usuario usuario) {
        String respuesta = authService.login(usuario.getUsuario(), usuario.getContraseña());
        return ResponseEntity.ok(respuesta);
    }
}

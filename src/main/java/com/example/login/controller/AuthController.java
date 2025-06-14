package com.example.login.controller;

import com.example.login.entity.Usuario;
import com.example.login.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/registro")
    public String registro(@RequestBody Usuario usuario) {
        return authService.registrar(usuario);
    }

    @PostMapping("/login")
    public String login(@RequestBody Usuario usuario) {
        return authService.login(usuario.getUsuario(), usuario.getContraseña());
    }
}
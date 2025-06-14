package com.example.login.service;

import com.example.login.entity.Usuario;
import com.example.login.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public String registrar(Usuario usuario) {
        if (usuarioRepository.findByUsuario(usuario.getUsuario()).isPresent()) {
            return "El usuario ya existe";
        }
        usuario.setContraseña(encoder.encode(usuario.getContraseña()));
        usuarioRepository.save(usuario);
        return "Registro exitoso";
    }

    public String login(String usuario, String contraseña) {
        return usuarioRepository.findByUsuario(usuario)
            .map(u -> encoder.matches(contraseña, u.getContraseña()) ?
                    "Autenticación satisfactoria" :
                    "Error en la autenticación")
            .orElse("Usuario no encontrado");
    }
}
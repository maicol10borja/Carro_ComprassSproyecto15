package service;

import jakarta.servlet.http.HttpServletRequest;
import models.Rol;

import java.util.Optional;

public interface LoginServiceInterface {
    Optional<String> getUsername(HttpServletRequest request);

    Rol verifyUser(String username, String password); // Método para verificar usuario
}
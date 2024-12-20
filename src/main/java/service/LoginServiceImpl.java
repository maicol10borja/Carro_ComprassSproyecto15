// LoginServiceImpl.java
package service;

import jakarta.servlet.http.HttpServletRequest;
import models.Rol;
import models.Usuario;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class LoginServiceImpl implements LoginService {
    private static final Map<String, Usuario> usuarios = new HashMap<>();

    static {
        // Agregar usuarios de ejemplo
        usuarios.put("admin", new Usuario("admin", "admin123", new Rol(1, "admin")));
        usuarios.put("cocinero", new Usuario("cocinero", "cocinero123", new Rol(2, "cocinero")));
        usuarios.put("cliente", new Usuario("cliente", "cliente123", new Rol(3, "cliente")));
        usuarios.put("mesero", new Usuario("mesero", "mesero123", new Rol(4, "mesero"))); // Nuevo rol
    }

    @Override
    public Optional<String> getUsername(HttpServletRequest request) {
        return Optional.empty();
    }

    @Override
    public Rol verifyUser(String username, String password) {
        Usuario usuario = usuarios.get(username);
        if (usuario != null && usuario.getPassword().equals(password)) {
            return usuario.getRol(); // Devolver el rol si las credenciales son válidas
        }
        return null; // Credenciales inválidas
    }
}
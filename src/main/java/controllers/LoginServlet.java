package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import service.LoginService;
import service.LoginServiceImpl; // Asegúrate de que la implementación de servicio esté disponible
import models.Rol;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Optional;

@WebServlet({"/login", "/login.html"})
public class LoginServlet extends HttpServlet {

    private final LoginService loginService = new LoginServiceImpl(); // Initialize LoginService

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Optional<String> usernameOptional = loginService.getUsername(req);

        if (usernameOptional.isPresent()) {
            resp.setContentType("text/html;charset=UTF-8");

            try (PrintWriter out = resp.getWriter()) {
                String username = usernameOptional.get();
                out.print("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<meta charset=\"utf-8\">");
                out.println("<title>Hola " + username + "</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Hola " + username + ", ya has iniciado sesión</h1>");

                HttpSession session = req.getSession();
                Rol role = (Rol) session.getAttribute("rol");

                if (role != null) {
                    if ("admin".equals(role.getNombre())) {
                        out.println("<p>Eres un administrador.</p>");
                    } else if ("cocinero".equals(role.getNombre())) {
                        out.println("<p>Eres un cocinero.</p>");
                    } else if ("cliente".equals(role.getNombre())) {
                        out.println("<p>Eres un cliente.</p>");
                    } else if ("mesero".equals(role.getNombre())) {
                        out.println("<p>Eres un mesero.</p>");
                    }
                }

                out.println("<p><a href='" + req.getContextPath() + "/index.html'>Volver al inicio</a></p>");
                out.println("<p><a href='" + req.getContextPath() + "/logout'>Cerrar sesión</a></p>");
                out.println("</body>");
                out.println("</html>");
            }
        } else {
            getServletContext().getRequestDispatcher("/login.jsp").forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        Rol role = loginService.verifyUser(username, password);

        if (role != null) {
            HttpSession session = req.getSession();
            session.setAttribute("username", username);
            session.setAttribute("rol", role);

            // Redirigir dependiendo del rol
            switch (role.getNombre()) {
                case "admin":
                    resp.sendRedirect(req.getContextPath() + "/adminDashboard.jsp");
                    break;
                case "cocinero":
                    resp.sendRedirect(req.getContextPath() + "/cocineroDashboard.jsp");
                    break;
                case "cliente":
                    resp.sendRedirect(req.getContextPath() + "/clienteDashboard.jsp");
                    break;
                case "mesero":
                    resp.sendRedirect(req.getContextPath() + "/meseroDashboard.jsp"); // Nueva página para meseros
                    break;
                default:
                    resp.sendRedirect(req.getContextPath() + "/login.html");
                    break;
            }
        } else {
            resp.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Lo sentimos, no está autorizado para ingresar a esta página!");
        }
    }
}
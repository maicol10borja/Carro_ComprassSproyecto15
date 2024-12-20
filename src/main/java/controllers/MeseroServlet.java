package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class MeseroServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.getWriter().println("<html lang='es'>");
        resp.getWriter().println("<head><title>Área de Mesero</title></head>");
        resp.getWriter().println("<body style='background-color: #222831; color: #f1f1f1;'>");
        resp.getWriter().println("<h1 style='text-align: center; color: #00adb5;'>Bienvenido al Área de Mesero</h1>");
        resp.getWriter().println("<div style='text-align: center; margin-top: 50px;'>");
        resp.getWriter().println("<a href='/carro_compras/index.jsp' style='font-size: 1.5rem; color: #00adb5;'>Volver a la Página de Inicio</a>");
        resp.getWriter().println("</div>");
        resp.getWriter().println("</body>");
        resp.getWriter().println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Aquí se puede implementar la lógica para manejar solicitudes POST
        resp.sendRedirect(req.getContextPath() + "/index.jsp"); // Redirige a la página de inicio por defecto
    }
}
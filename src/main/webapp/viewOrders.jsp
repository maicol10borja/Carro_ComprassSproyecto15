<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>Lista de Órdenes</title>
</head>
<body>
<h1>Órdenes Actuales</h1>
<table border="1">
  <tr>
    <th>ID de Orden</th>
    <th>Cliente</th>
    <th>Platos</th>
    <th>Estado</th>
  </tr>
  <%
    // Aquí puedes obtener una lista de órdenes de tu servicio
    // List<Order> orders = orderService.getCurrentOrders();
    // Por ahora, simulemos con datos estáticos
    String[][] orders = {
            {"1", "Cliente 1", "Pizza", "En preparación"},
            {"2", "Cliente 2", "Ensalada", "Listo para servir"}
    };
    for (String[] order : orders) {
  %>
  <tr>
    <td><%= order[0] %></td>
    <td><%= order[1] %></td>
    <td><%= order[2] %></td>
    <td><%= order[3] %></td>
  </tr>
  <% } %>
</table>
<p><a href="cocineroDashboard.jsp">Volver al Dashboard del Cocinero</a></p>
</body>
</html>
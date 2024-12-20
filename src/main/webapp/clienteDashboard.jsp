<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>Dashboard del Cliente</title>
</head>
<body>
<h1>Mis Órdenes (Cliente)</h1>
<table border="1">
  <tr>
    <th>ID de Orden</th>
    <th>Platos</th>
    <th>Estado</th>
  </tr>
  <%
    // Simulando una lista de órdenes para el Cliente
    String[][] orders = {
            {"1", "Pizza", "En preparación"},
            {"2", "Ensalada", "Listo para servir"},
            {"3", "Hamburguesa", "Cancelado"}
    };
    for (String[] order : orders) {
  %>
  <tr>
    <td><%= order[0] %></td>
    <td><%= order[1] %></td>
    <td><%= order[2] %></td>
  </tr>
  <% } %>
</table>
<p><a href="index.html">Volver al Inicio</a></p>
</body>
</html>
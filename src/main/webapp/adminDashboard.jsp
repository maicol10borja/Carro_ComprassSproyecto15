<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>Dashboard del Admin</title>
</head>
<body>
<h1>Órdenes Actuales (Admin)</h1>
<table border="1">
  <tr>
    <th>ID de Orden</th>
    <th>Cliente</th>
    <th>Platos</th>
    <th>Estado</th>
  </tr>
  <%
    // Simulando una lista de órdenes para el Admin
    String[][] orders = {
            {"1", "Cliente 1", "Pizza", "En preparación"},
            {"2", "Cliente 3", "Pasta", "Listo para servir"},
            {"3", "Cliente 2", "Taco", "En camino"}
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
<p><a href="index.html">Volver al Inicio</a></p>
</body>
</html>
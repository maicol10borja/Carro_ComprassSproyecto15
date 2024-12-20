<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Iniciar Sesión</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        h2 {
            color: #333;
            text-align: center;
        }

        form {
            background-color: white;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            width: 100%;
            max-width: 400px;
        }

        label {
            font-size: 16px;
            margin-bottom: 5px;
            display: block;
            color: #333;
        }

        input[type="text"],
        input[type="password"] {
            width: 100%;
            padding: 10px;
            margin: 10px 0 20px;
            border: 1px solid #ddd;
            border-radius: 5px;
            font-size: 16px;
            box-sizing: border-box;
        }

        button {
            width: 100%;
            padding: 10px;
            background-color: #4CAF50;
            color: white;
            border: none;
            border-radius: 5px;
            font-size: 16px;
            cursor: pointer;
            transition: background-color 0.3s;
        }

        button:hover {
            background-color: #45a049;
        }

        /* Opcional: Estilo para el enlace de "Olvidé mi contraseña" */
        .forgot-password {
            display: block;
            text-align: center;
            margin-top: 10px;
            color: #333;
            text-decoration: none;
        }

        .forgot-password:hover {
            text-decoration: underline;
        }

    </style>
</head>
<body>
<div>
    <h2>Iniciar Sesion</h2>
    <form action="login" method="post">
        <label for="username">Usuario:</label>
        <input type="text" id="username" name="username" required>
        <br>
        <label for="password">Contrasena:</label>
        <input type="password" id="password" name="password" required>
        <br>
        <button type="submit">Entrar</button>
    </form>
</div>
</body>
</html>

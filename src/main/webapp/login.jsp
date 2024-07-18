<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
    <style>
        /* Estilos para o overlay de carregamento */
        .loading-overlay {
            display: none;
            position: fixed;
            top: 0;
            left: 0;
            width: 100%;
            height: 100%;
            background: rgba(0, 0, 0, 0.5);
            z-index: 1000;
            justify-content: center;
            align-items: center;
        }

        .loading-overlay .spinner {
            border: 16px solid #f3f3f3;
            border-top: 16px solid #3498db;
            border-radius: 50%;
            width: 120px;
            height: 120px;
            animation: spin 2s linear infinite;
        }

        @keyframes spin {
            0% { transform: rotate(0deg); }
            100% { transform: rotate(360deg); }
        }
    </style>
    <script>
        function showLoading() {
            document.getElementById('loading-overlay').style.display = 'flex';
        }
    </script>
</head>
<body>
<h1>Login</h1>
<form action="LoginServlet" method="post" onsubmit="showLoading()">
    <label for="username">Usuário:</label>
    <input type="text" id="username" name="username" required>
    <br>
    <label for="password">Senha:</label>
    <input type="password" id="password" name="password" required>
    <br>
    <input type="submit" value="Login">
</form>

<!-- Exibir mensagem de erro, se houver -->
<%
    String errorMessage = (String) request.getAttribute("errorMessage");
    System.out.println("erro: " + errorMessage);
    if (errorMessage != null && !errorMessage.isEmpty()) {
%>
<p style="color: red;"><%= errorMessage %>
</p>
<%
    }
%>
<!-- Overlay de carregamento -->
<div id="loading-overlay" class="loading-overlay">
    <div class="spinner"></div>
</div>
</body>
</html>

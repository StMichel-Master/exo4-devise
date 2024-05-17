<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Demande de Jours Fériés</title>
</head>
<body>
    <h1>Entrez une année pour voir les jours fériés</h1>
    <form action="JoursFeriesServlet" method="post">
        <label for="annee">Année:</label>
        <input type="text" id="annee" name="annee" required>
        <button type="submit">Voir les jours fériés</button>
    </form>
</body>
</html>
    
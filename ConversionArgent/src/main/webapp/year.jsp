<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Demande de Jours F�ri�s</title>
</head>
<body>
    <h1>Entrez une ann�e pour voir les jours f�ri�s</h1>
    <form action="JoursFeriesServlet" method="post">
        <label for="annee">Ann�e:</label>
        <input type="text" id="annee" name="annee" required>
        <button type="submit">Voir les jours f�ri�s</button>
    </form>
</body>
</html>
    
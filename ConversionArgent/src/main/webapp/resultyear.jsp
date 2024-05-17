<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Résultat des Jours Fériés</title>
</head>
<body>
    <h1>Jours Fériés pour l'année <%= request.getAttribute("annee") %></h1>
    <ul>
        <% Map<String, String> joursFeries = (Map<String, String>) request.getAttribute("joursFeries");
           if (joursFeries != null) {
               for (Map.Entry<String, String> entry : joursFeries.entrySet()) {
                   out.println("<li>" + entry.getKey() + ": " + entry.getValue() + "</li>");
               }
           } else {
               out.println("<p>Aucun jour férié trouvé ou erreur dans la récupération des données.</p>");
           }
        %>
    </ul>
    <a href="index.jsp">Retour</a>
</body>
</html>

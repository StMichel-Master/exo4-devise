<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>R�sultat des Jours F�ri�s</title>
</head>
<body>
    <h1>Jours F�ri�s pour l'ann�e <%= request.getAttribute("annee") %></h1>
    <ul>
        <% Map<String, String> joursFeries = (Map<String, String>) request.getAttribute("joursFeries");
           if (joursFeries != null) {
               for (Map.Entry<String, String> entry : joursFeries.entrySet()) {
                   out.println("<li>" + entry.getKey() + ": " + entry.getValue() + "</li>");
               }
           } else {
               out.println("<p>Aucun jour f�ri� trouv� ou erreur dans la r�cup�ration des donn�es.</p>");
           }
        %>
    </ul>
    <a href="index.jsp">Retour</a>
</body>
</html>

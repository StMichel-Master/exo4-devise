<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Résultat des Jours Fériés</title>
</head>
<body>
	<h1>
		Jours Fériés pour l'année
		<%=request.getAttribute("annee")%></h1>
	<ul>
		<c:forEach var="entry" items="${joursFeries}">
			<li>${entry.key}: ${entry.value}</li>
		</c:forEach>
		%>
	</ul>
	<a href="index.jsp">Retour</a>
</body>
</html>

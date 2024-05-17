<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>
    Montant converti en CHF: <%= request.getAttribute("convertedCHF") %> <br>
    Montant converti en USD: <%= request.getAttribute("convertedUSD") %> <br>
    Montant converti en BTC: <%= request.getAttribute("convertedBTC") %> <br>
</body>
</body>
</html>
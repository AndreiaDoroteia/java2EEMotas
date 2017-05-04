<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.ArrayList, model.Mota" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="HMota" method="post">
		<label>Marca: </label><input type="text" name="marca"><br>
		<label>Modelo: </label><input type="text" name="modelo"><br>
		<label>Cilindrada: </label><input type="number" name="cc"><br>
		<input type="submit" value="Enviar" name="Enviar">
	</form>
	<h2>Listar Motas</h2>
	<% 
		ArrayList arMotas = (ArrayList) request.getAttribute("listaMotas");
		
		for(int i=0; i<arMotas.size();i++){
			Mota m = (Mota) arMotas.get(i);
			out.append("" + m.getId());
	%><br><% 
			out.append(m.getMarca());
	%><br><% 		
			out.append(m.getModelo());
	%><br><% 
			out.append(m.getCc());
		}
		 %><br>
</body>
</html>
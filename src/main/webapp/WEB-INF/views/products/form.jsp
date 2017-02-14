<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Produtos</title>
</head>
<body>
	<form method="post" action="/casadocodigo/produtos">
		<div>
			<label for="title">Titulo</label>
			<input type="text" name="title" id="title" />
		</div>
		<div>
			<label for="description">Descri��o</label>
			<textarea rows="10" cols="20" name="description" id="description"></textarea>
		</div>
		<div>
			<label for="pages">N�mero de p�ginas</label>
			<input type="text" name="pages" id="pages" />
		</div>
		<div>			
			<input type="submit" value="Enviar" />
		</div>
	</form>
	<c:forEach items="${types}" var="bookType" varStatus="status">
		<div>
			<label for="price_${bookType}">${bookType}</label>
			<input type="text" name="prices[${status.index}].value" id="price_${bookType}" />
			<input type="hidden" name="prices[${status.index}].bookType" value="${bookType}" />
		</div>
	</c:forEach>
</body>
</html>
<!-- LUCAS ALEXANDRE - CB3007626 | ELESON OLIVEIRA CB3007235 -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:url value="formNovoProduto.jsp" var="linkServletNovoProduto"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Produtos</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>

	<div class="container">
	<c:if test="${not empty produto}">
		Produto ${ produto } cadastrada com sucesso!
	</c:if>
	
	<h1>Lista de produtos: </h1><br />
	<h5><a href="${linkServletNovoProduto}">Criar um novo produto</a> </h5>
	<table class="table table-striped ">
		<thead>
			<tr>
				<td>Produtos</td>
				<td>Edição</td>
				<td>Remoção</td>
			</tr>
		</thead>
		<c:forEach items="${produtos}" var="produto">
			<tr>
				<td>${produto.nome}</td>
				<td><a href="/gerenciador/exibeProduto?id=${produto.id}">Editar</a></td>
				<td><a href="/gerenciador/removerProduto?id=${produto.id}">Remover</a></td>
			</tr>
		</c:forEach>
	</table>
	</div>
</body>
</html>
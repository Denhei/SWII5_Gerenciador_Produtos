<!-- LUCAS ALEXANDRE - CB3007626 | ELESON OLIVEIRA CB3007235 -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:url value="formNovoProduto.jsp" var="linkServletNovoProduto"/>
<c:url value="/listaProdutos" var="linkServletListaProdutos"/>

<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<div class="container">
<h1>TP - Gerenciador de produtos</h1><br/>

<table class="table table-striped ">
	<thead>
		<tr>
			<td>Ações</td>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td><a href="${linkServletNovoProduto}">Criar um novo produto</a> <br /></td>
		</tr>
		<tr>
			<td><a href="${linkServletListaProdutos}">Listar produtos</a></td>
		</tr>
	</tbody>
</table>
</div>

</body>
</html>
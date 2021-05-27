<!-- LUCAS ALEXANDRE - CB3007626 | ELESON OLIVEIRA CB3007235 -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:url value="/NovoProdutoServlet" var="linkServletNovoProduto"/>

<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Novo Produto</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>

<div class="container" style="padding-top:30px;">
<form action="${linkServletNovoProduto}" method="POST">
	<div class="form-group">
		<label>Nome:</label> 
		<input class="form-control" type="text" name="nome">
		<label>Unidade Compra:</label> <input class="form-control" type="text" name="unidadeCompra">
		<label>Descrição:</label> <input class="form-control" type="text" name="descricao">
		<label>Qtd Previsto no Mês:</label> <input class="form-control" type="text" name="qtdPrevistoMes">
		<label>Preço Máximo Comprado:</label> <input class="form-control" type="text" name="precoMaxComprado">
		<br/><br/>
		<input class="btn btn-success" type="submit" value="Enviar">
	</div>
</form>
</div>

</body>
</html>
<!-- LUCAS ALEXANDRE - CB3007626 | ELESON OLIVEIRA CB3007235 -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:url value="/AlterarProduto" var="linkServletAlterarProduto"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Alterar Produto</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<div class="container" style="padding-top:30px;">
<form action="${linkServletAlterarProduto}" method="POST">
	<input class="form-control" type="hidden" name="id" value="${produto.id}">
	<label>Nome:</label> <input class="form-control" type="text" name="nome" value="${produto.nome}">
	<label>Unidade Compra:</label> <input class="form-control"t type="text" name="unidadeCompra" value="${produto.unidadeCompra}">
	<label>Descrição:</label> <input class="form-control" type="text" name="descricao" value="${produto.descricao}">
	<label>Qtd Previsto no Mês:</label> <input class="form-control" type="text" name="qtdPrevistoMes" value="${produto.qtdPrevistoMes}">
	<label>Preço Máximo Comprado:</label> <input class="form-control" type="text" name="precoMaxComprado" value="${produto.precoMaxComprado}">
	<br/><br/>
	<input class="btn btn-success" type="submit" value="Enviar">
</form>
</div>

</body>
</html>
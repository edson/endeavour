<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Endeavour</title>
<%@ include file="include.jsp"%>
</head>
<body>
<div id="conteudo"><%@ include file="topo.jsp"%>
<form method="post" action="mvc"><input type="hidden"
	name="choice" id="choice" value="CadastrarMusica" />
<jsp:useBean id="dao" class="com.endeavour.dao.AlbumDAO" />
<div id="cadastro">
<fieldset><legend>Cadastro de Música</legend>
<p><label for="Artista">Artista</label> <select name="codartista">
	<option value=2 selected>Dream Theater</option>
</select></p>
<p><label for="Album">Álbum</label> <select name="codalbum">
	<c:forEach var="cd" items="${dao.lista}">
		<option value="${cd.codalbum}">${cd.nome}</option>
	</c:forEach>
</select></p>
<p><label for="Titulo">Título</label> <input name="titulo"
	id="titulo" type="text" size="30" value="" /></p>
<p><label for="Letra">Letra</label> <textarea name="txtletra"></textarea></p>
<p class="tright"><input type="submit" value="enviar" class="botao" />
</p>
</fieldset>
</div>
</form>
</div>
</body>
</html>
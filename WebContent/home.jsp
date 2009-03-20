<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Endeavour</title>
<%@ include file="include.jsp" %>
</head>
<body>
<div id="conteudo">
<%@ include file="topo.jsp" %>
<p>
Seu login digitado foi: ${param.email}
</p>
${param.recriouDB}
<ul>
<li><a href="mvc?choice=CadastroMusica">Cadastro de Música</a></li>
<li><a href="mvc?choice=ListarMusicas">Listar Musicas</a></li>
<li><a href="mvc?choice=RecriarDB">Reconstruir banco de dados (inicialização)</a></li>
</ul>
</div>
</body>
</html>
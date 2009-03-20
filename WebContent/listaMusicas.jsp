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
Lista das músicas cadastradas
</p>
<jsp:useBean id="dao" class="com.endeavour.dao.MusicaDAO"/>
<table border="1">
    <c:forEach var="musica" items="${dao.lista}" varStatus="id">
        <tr bgcolor="#${id.count % 2 == 0 ? 'aaee88' : 'ffffff' }" >
            <td>${id.count}</td><td>${musica.titulo}</td>
        </tr>
    </c:forEach>
</table>
<p>
<a href="mvc?choice=CadastroMusica">Novo cadastro</a>
</p>
</div>
</body>
</html>


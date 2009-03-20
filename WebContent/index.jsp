<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Endeavour</title>
<%@ include file="include.jsp" %>
</head>
<body>
	<form method="post" action="mvc">
    	<input type="hidden" name="choice" id="choice" value="LoginManager" />
		<div id="conteudo">
	    <%@ include file="topo.jsp" %>
			<div id="login">
		  	<fieldset>
		   		<legend>Login</legend>
		   		<label for="nome">Email</label> 
		   		<input type="text" name="email" id="email" value="Apenas clique em ok." />
		   		<label for="tipo">Senha</label> 
		   		<input type="password" name="senha" id="senha" value="user" />
				<p>
		   	  		<input type="submit" value="OK" class="botao" />
		   		</p>
		   	</fieldset>
		  	</div>
		</div> 
    </form>
</body>
</html>
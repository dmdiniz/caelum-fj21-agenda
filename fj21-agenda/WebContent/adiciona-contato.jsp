<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib tagdir="/WEB-INF/tags" prefix="caelum" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Adiciona Contato</title>
		<link rel="stylesheet" href="http://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css" />
		<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  		<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
	</head>
	<body>
		<c:import url="cabecalho.jsp" />
    	<h1>Adiciona Contatos</h1>
    	<hr/>
   		<form action="adicionaContato">
       		Nome: <input type="text" name="nome" /><br/><br/>
       		E-mail: <input type="text" name="email" /><br/><br/>
       		Endereço: <input type="text" name="endereco" /><br/><br/>
       		Data Nascimento:<caelum:campoData id="dataNascimento"/><br/><br/>
       		<input type="submit" value="Gravar" />
   		</form>
   		<c:import url="rodape.jsp" />
</body>
</html>
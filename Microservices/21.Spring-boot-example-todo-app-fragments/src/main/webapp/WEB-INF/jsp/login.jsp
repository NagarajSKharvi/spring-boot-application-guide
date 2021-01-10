<%@ include file = "common/header.jspf"%>
<%@ include file = "common/navigation.jspf"%>
	<div class = "container">
		<form method = "post">
			Name : <input type = "text" name = "name"/>
			Password : <input type = "password" name = "password"/><br>
			<input type = "submit"/>
		</form>
		<font color = "red">${errorMessage}</font>
	</div>
<%@ include file = "common/footer.jspf"%>
<html>
	<head>
		<title>First web application</title>
	</head>
	
	<body>
		<form method = "post">
			Name : <input type = "text" name = "name"/>
			Password : <input type = "password" name = "password"/><br>
			<input type = "submit"/>
		</form>
		<font color = "red">${errorMessage}</font>
	</body>
</html>
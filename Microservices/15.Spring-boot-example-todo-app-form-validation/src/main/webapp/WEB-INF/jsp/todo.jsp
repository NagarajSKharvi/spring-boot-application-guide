<html>
	<head>
		<title>First web application</title>
		<link href="webjars/bootstrap/4.5.3/css/bootstrap.min.css" rel="stylesheet">
	</head>
	
	<body>
		<div class = "container">
			Add Todo page for ${name}
			
			<form method="post">
				<fieldset class = "form-group">
					<label>Description</label>
					<input name = "desc" type = "text" class = "form-control" required="required">
				</fieldset>
	    		 
	    		<button type = "submit" class = "btn btn-success">Add</button>
			</form>
		</div>
		
		<script src="webjars/jquery/3.5.1/jquery.min.js"></script>
		<script src="webjars/bootstrap/4.5.3/js/bootstrap.min.js"></script>
	</body>
</html>
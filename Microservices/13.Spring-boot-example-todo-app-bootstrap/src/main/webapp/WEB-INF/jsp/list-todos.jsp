<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
	<head>
		<title>Todo's for ${name}</title>
		<link href="webjars/bootstrap/4.5.3/css/bootstrap.min.css" rel="stylesheet">
	</head>
	
	<body>
		<div class = "container">
			<caption>Your Todos are</caption>
			<table class = "table table-striped">
				<thead>
					<tr>
						<th>Description</th>
						<th>Target Date</th>
						<th>Is it Done ?</th>
					</tr>	
				</thead>
				<tbody>
					<c:forEach items="${todos}" var = "todo">
						<tr>
							<td>${todo.desc}</td>
							<td>${todo.targetDate}</td>
							<td>${todo.done}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<div>
				<a class = "button" href = "add-todo">Add a Todo</a>
			</div>
			<script src="webjars/jquery/3.5.1/jquery.min.js"></script>
		    <script src="webjars/bootstrap/4.5.3/js/bootstrap.min.js"></script>
	   	</div>
	</body>
</html>
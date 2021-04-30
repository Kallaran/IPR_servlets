<%@ page import="java.util.Date"%>


<html>
<head>

<!-- Required meta tags -->
<meta charset="utf-8">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6"
	crossorigin="anonymous">

<!-- Custom styles for this template -->
<link rel="stylesheet" type="text/css" href="styles/chat.css" />


<title>chat</title>
</head>
<body class="body">
	<main class="container">

		<h1 class="chat-title">chat</h1>


		<pre class="text-content"><%=request.getAttribute("chatContent")%></pre>

		<form name="chatForm" action="chat" method="post">
			<input type="hidden" name="date" value="<%=new Date()%>">
		
		
			<div class="form-row">
				<div class="col-md-8 mr-1 in">
					<input class="form-control" type="text" name="ligne" value="" /> 
				</div>
				<div class="col-md-1 mr-1  in">
					<input class="form-control btn btn-success in" type="submit" name="action" value="submit" />
				</div>
				<div class="col-md-1 mr-1 in">
					<input class="form-control btn btn-primary" type="submit" name="action"	value="refresh" /> 
				</div>
				<div class="col-md-1 mr-1 in">
					<input class="form-control btn btn-danger" type="submit" name="action"	value="logout" />
				</div>
				
			</div>


		</form>
	</main>


</body>
</html>

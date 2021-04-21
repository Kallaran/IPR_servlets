<!doctype html>
<html lang="en">
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
<link href="signin.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="styles/login.css" />


<title>Login Page</title>
</head>


<body class="text-center">

	<main class="form-signin container container-custom">
		<form action="chat" method="post">
			<h1 class="h3 mb-3 fw-normal">Please sign in</h1>

			<div class="form-floating">
				<input type="text" name="user" class="form-control"
					id="floatingInput"> <label for="floatingInput">Username</label>
			</div>

			<button class="w-100 btn btn-lg btn-primary" type="submit">Login</button>

		</form>

	</main>
	
	<img class="img" alt="elephant" src="pictures/elephant.jpg">

</body>
</html>
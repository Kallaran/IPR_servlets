<%@ page import="java.util.Date"%>


<html>
<head>
<title>chat</title>
</head>
<body>
	<h1>chat</h1>

	<pre><%= request.getAttribute("chatContent") %></pre>

	<form name="chatForm" action="chat" method="post">
	
	    <input type="text" name="ligne" value=""/>
	
	    <input type="submit" name="action" value="submit"/>
	
	    <input type="submit" name="action" value="refresh"/>
	
	</form>


</body>
</html>
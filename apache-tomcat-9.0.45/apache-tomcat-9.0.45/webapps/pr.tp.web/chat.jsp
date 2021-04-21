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
	    <input type="hidden" name="date" value="<%=new Date()%>">
	    
	    <input type="submit" name="action" value="submit"/>
	    <input type="submit" name="action" value="refresh"/>  
   	    <input type="submit" name="action" value="logout"/>
	    
	
	</form>


</body>
</html>

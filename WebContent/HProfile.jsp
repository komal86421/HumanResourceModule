<head>
<style>
body{text-align:center;}
</style>
</head>
<body bgcolor="powderblue">
<%!
	String form_user;
%>
<%
	HttpSession httpSession = request.getSession(false);
	form_user = (String)httpSession.getAttribute("sname");
	out.println("<h1>HELLO "+form_user+"you are a valuable employee  of Our Company::</h1>");
	out.println("<br/><form action='http://localhost:2017/HRM/projectFill.html'><input type='submit' value='CREATE Project'></form> ");
	out.println("<br/><form action='http://localhost:2017/HRM/displayData'><input type='submit' value='DISPLAY Project'></form> ");
	out.println("<br/><form action='http://localhost:2017/HRM/updateData'><input type='submit' value='UPDATE Project'></form> ");
	out.println("<br/><form action='http://localhost:2017/HRM/deleteData'><input type='submit' value='DELETE Project'></form> ");
	out.println("<br/><br/><br/><br/><form action='Logout.jsp'><input type='submit' value='Logout'></form> ");	
%>	
</body>
</html>
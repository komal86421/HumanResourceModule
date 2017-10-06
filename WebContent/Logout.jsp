<head>
<style>
body {text-align:center;}
</style>
</head>
<body bgcolor='powderblue'>

<%!
  String user ; 
%>
<%
	HttpSession httpSession = request.getSession(false);
	user = (String)httpSession.getAttribute("sname");
	httpSession.invalidate();
	out.println(user+"  has done Logout::");
	out.println("<a href='http://localhost:2017/HRM/index.html'>home</a>");
%>
</body>

<body bgcolor="pink">
<%!
	String form_user;
%>

<form action="Attendance_Hrm.jsp">
	<input type="submit"   name="present mam" value="attendance" />
	</form>	
<form action="Profile.jsp">
	<input type="submit"  name="my page" value="profile" />
	</form>	
<form action="Logout.jsp">
	<input type="submit"  name="logout" value="logout" />
	</form>	
<%
	HttpSession httpSession = request.getSession(false);
	form_user = (String)httpSession.getAttribute("sname");
	out.println("Hello "+form_user);
%>

</body>


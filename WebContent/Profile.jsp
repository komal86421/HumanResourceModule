<head>
<style>
body {text-align:center;}
</style>
</head>
<body bgcolor='pink'>
<%!
	String form_user;
	String role;
%>
<%
	HttpSession httpSession = request.getSession(false);
	form_user = (String)httpSession.getAttribute("sname");
	role	 = (String)httpSession.getAttribute("role");
	
	if(role.equals("hr_hrm")){
		response.sendRedirect("http://localhost:2017/HRM/HProfile.jsp");
		}
		else if(role.equals("admin_hrm")){
			response.sendRedirect("http://localhost:2017/HRM/AProfile.jsp");
			}
		if(role.equals("employee_hrm")){
			response.sendRedirect("http://localhost:2017/HRM/EmpProfile.jsp");
			}
 %>

</body>

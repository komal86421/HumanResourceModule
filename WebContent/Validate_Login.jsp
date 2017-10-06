<%@page import="java.sql.*"
import="javax.servlet.*"
%>

<%!
	String curl;
	String cuser;
	String cpass;
	String cname;
	String form_user;
	String form_pass;
	String query;
	String myList;
%>

<%
form_user = request.getParameter("user");
form_pass = request.getParameter("pass");
myList = request.getParameter("myList");
	try{
	cname = application.getInitParameter("cname");
    curl = application.getInitParameter("curl");
	cuser = application.getInitParameter("cuser");
	cpass = application.getInitParameter("cpass");

	System.out.println("1");
	query ="select * from "+myList+" where username='"+form_user+"' and password = '"+form_pass+"'";
	
	System.out.println("2");
	
	Class.forName(cname);
	Connection connection = DriverManager.getConnection(curl,cuser,cpass);
	Statement statement = connection.createStatement();
	ResultSet resultSet = statement.executeQuery(query);
	if(resultSet.next())
	{
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("sname",form_user);
		httpSession.setAttribute("role",myList);
		
		response.sendRedirect("http://localhost:2017/HRM/Profile_Attend.jsp");
	}
	else
	{
		System.out.println("4");
		response.sendRedirect("http://localhost:2017/HRM/index.html");	
	}
	connection.close();
   }
	catch(Exception  e){
		e.printStackTrace();	
	}
		
	
%>
	
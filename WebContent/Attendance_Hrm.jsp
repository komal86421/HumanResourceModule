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
	String role;
%>

<%
	HttpSession httpSession = request.getSession(false);
	form_user = (String)httpSession.getAttribute("sname");
	role	 = (String)httpSession.getAttribute("role");
	try{
	cname = application.getInitParameter("cname");
    curl = application.getInitParameter("curl");
	cuser = application.getInitParameter("cuser");
	cpass = application.getInitParameter("cpass");
	java.util.Date  dNow = new java.util.Date ( );
	java.text. SimpleDateFormat ft = new java.text. SimpleDateFormat ("dd-MM-yyyy");
	
   
	System.out.println("s1");
	query = " insert into attend_hrm values('"+form_user+"','"+ft.format(dNow)+"')";

//SQL> alter table attend_hrm add constraint  tc UNIQUE(name1,date1);
	System.out.println("s2");
	
	Class.forName(cname);
	Connection connection = DriverManager.getConnection(curl,cuser,cpass);
	Statement statement = connection.createStatement();
	ResultSet resultSet = statement.executeQuery(query);
	connection.close();
   }
	catch(Exception e){
		out.println("hello Client! we are trying to remove this eroor:");
		
		
	}
	finally{
		if(role.equals("hr_hrm")){
		response.sendRedirect("http://localhost:2017/HRM/HProfile.jsp?user"+form_user);
		}
		else if(role.equals("admin_hrm")){
			response.sendRedirect("http://localhost:2017/HRM/AProfile.jsp?user"+form_user);
			}
		else{
			response.sendRedirect("http://localhost:2017/HRM/EmpProfile.jsp?user"+form_user);
			}
			
	}
		
	
%>
	
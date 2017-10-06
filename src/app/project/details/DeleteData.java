package app.project.details;

import java.io.*;
import java.sql.SQLException;
import java.util.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deleteData")
public class DeleteData extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request,HttpServletResponse  response) throws IOException  
	{
		RetrieveData retrieveData = new RetrieveData();
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		ArrayList<ProjectDetails> empList;
			try {
				empList = retrieveData.getDataFromDB();
				out.print("<body><center>");
				out.print("<br/><h1>DATA FROM DB </h1><br/><br/>");
				out.print("<table bgcolor='99FFFF' border='12' align='center'><tr>");
				out.print("<td>Name</td>");
				out.print("<td>Client</td>");
				out.print("<td>ID Number</td>");
				out.print("<td>StartDate</td>");
				out.print("<td>EndDate</td>");
				out.print("<td>Details</td>");
				out.print("<td>Technology</td>");
				out.print("<td>TeamSize</td>");
				out.println("	<td>Want to delete</td>");
				
				for(ProjectDetails pr_object:empList){
					out.println("<tr><td>"+pr_object.getName()+"</td>");
					out.println("<td>"+pr_object.getClients()+"</td>");
					out.println("<td>"+pr_object.getId()+"</td>");
					out.println("<td>"+pr_object.getStartdate()+"</td>");
					out.println("<td>"+pr_object.getEnddate()+"</td>");
					out.println("<td>"+pr_object.getDetails()+"</td>");
					out.println("<td>"+pr_object.getTechnology()+"</td>");
					out.println("<td>"+pr_object.getTeamsize()+"</td>");
					out.println("<td><a href='http://localhost:2017/HRM/deleteProjectServlet?id="+pr_object.getId()+"'>delete</a>");
					out.println("</td>");
					out.println("</tr>");
					
			}	
				out.println("</table></center></body>");
					
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}
}

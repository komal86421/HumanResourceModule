package app.project.details;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/insertProjectServlet")
public class InsertProjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public InsertProjectServlet() {
        super();
    }

	private String id ,name, startdate,enddate,details,technology,client;
	private Integer teamsize;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			id = request.getParameter("id");
			name = request.getParameter("name");
			startdate = request.getParameter("startdate");
			enddate = request.getParameter("enddate");
			details = request.getParameter("details");
			technology = request.getParameter("technology");
			client = request.getParameter("client");
			System.out.println("insert1");
			teamsize = Integer.parseInt(request.getParameter("teamsize"));
			System.out.println("insert2");
			ProjectDetails projectDetails = new ProjectDetails();
			projectDetails.setClients(client);
			System.out.println("insert3");
			projectDetails.setDetails(details);
			projectDetails.setEnddate(enddate);
			projectDetails.setId(id);
			projectDetails.setName(name);
			projectDetails.setStartdate(startdate);
			projectDetails.setTechnology(technology);
			System.out.println("insert4");
			projectDetails.setTeamsize(teamsize);
			System.out.println("insert5");
			InsertProjectDetails insertProjectDetails = new InsertProjectDetails();
			insertProjectDetails.save(projectDetails);
			System.out.println("insert6");
			response.sendRedirect("HProfile.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}

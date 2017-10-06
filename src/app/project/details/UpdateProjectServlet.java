package app.project.details;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/updateProjectServlet")
public class UpdateProjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UpdateProjectServlet() {
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
			teamsize = Integer.parseInt(request.getParameter("teamsize"));
			ProjectDetails projectDetails = new ProjectDetails();
			projectDetails.setClients(client);
			projectDetails.setDetails(details);
			projectDetails.setEnddate(enddate);
			projectDetails.setId(id);
			projectDetails.setName(name);
			projectDetails.setStartdate(startdate);
			projectDetails.setTechnology(technology);
			projectDetails.setTeamsize(teamsize);
			UpdateProjectDetails  updateProjectDetails = new UpdateProjectDetails();
			updateProjectDetails.update(projectDetails,id);
			response.sendRedirect("HProfile.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}

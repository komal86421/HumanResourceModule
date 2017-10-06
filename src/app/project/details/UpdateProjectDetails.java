package app.project.details;
import java.sql.*;

public class UpdateProjectDetails {

	public void update(ProjectDetails projectDetails,String id) {
		try{
		String query ="update  project_hrm  set  name=?,startdate=?,enddate=?,details=?,technology=?,client=?,teamsize=? where id=?";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","avinash","tiger");
		PreparedStatement statement =  connection.prepareStatement(query);
		statement.setString(1,projectDetails.getName());
		statement.setString(2,projectDetails.getStartdate());
		statement.setString(3,projectDetails.getEnddate());
		statement.setString(4,projectDetails.getDetails());
		statement.setString(5,projectDetails.getTechnology());
		statement.setString(6,projectDetails.getClients());
		statement.setLong(7,projectDetails.getTeamsize());
		statement.setString(8,id);
		statement.executeUpdate();
		connection.close();
	}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}

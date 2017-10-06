package app.project.details;
import java.sql.*;


public class InsertProjectDetails {
		
	public void save(ProjectDetails projectDetails) {
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","avinash","tiger");
		PreparedStatement statement =  connection.prepareStatement("insert into project_hrm values(?,?,?,?,?,?,?,?)");
		System.out.println("2insert3");
		statement.setString(7,projectDetails.getId());
		statement.setString(1,projectDetails.getName());
		statement.setString(2,projectDetails.getStartdate());
		statement.setString(3,projectDetails.getEnddate());
		statement.setString(4,projectDetails.getDetails());
		statement.setString(5,projectDetails.getTechnology());
		statement.setString(6,projectDetails.getClients());
		statement.setLong(8,projectDetails.getTeamsize());
		
		System.out.println("2insert4");
		statement.executeUpdate();
		System.out.println("2insert5");
		connection.close();
	}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
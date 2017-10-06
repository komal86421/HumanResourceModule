package app.project.details;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;



public class RetrieveData {
	private Connection connection;
	private Statement createStatement;
	private ResultSet resultSet;
    String cname ,curl,cuser,cpass,query;
    
	public ArrayList<ProjectDetails> getDataFromDB() throws ClassNotFoundException, SQLException{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","avinash","tiger");
		createStatement = connection.createStatement();
		resultSet =  createStatement.executeQuery("select * from project_hrm");
		ArrayList<ProjectDetails>   arrayList =  new ArrayList<>();
		while(resultSet.next()){
			ProjectDetails projectDetails = new ProjectDetails();
			projectDetails.setName(resultSet.getString(1));
			projectDetails.setStartdate(resultSet.getString(2));
			projectDetails.setEnddate(resultSet.getString(3));
			projectDetails.setDetails(resultSet.getString(4));
			projectDetails.setTechnology(resultSet.getString(5));
			projectDetails.setClients(resultSet.getString(6));
			projectDetails.setId(resultSet.getString(7));
			projectDetails.setTeamsize(resultSet.getInt(8));
			arrayList.add(projectDetails);
		}
		connection.close();
		return  arrayList ;
	}
}

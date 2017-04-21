package Database;
import java.sql.*;
public class Databaseconnectivity {

	public static void main(String args[]){
		
		//Driver
	
		DriverManager.registerDriver(new oracle.jdbc.driver.oracleDriver());
		//Connecting
		Connection con = DriverManager.getConnection("jdbc.oracle:thin@localhost:1521:xe","Scott","Tiger");
		// Sql statement
		Statement stmt = con.createStatement();
		// restriving data
		ResultSet rs = stmt.executeQuery("select*from emp");
		// close
		while(rs.next()){
			
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
		}
		
		con.close();
		
	}
}

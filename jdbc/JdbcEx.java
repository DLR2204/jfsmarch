package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
//		(1)Loading driver classes
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
//		(2)Creating the connection
		
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","march","march");
		
//		(3)create the statement
		
		Statement stmt = conn.createStatement();
		
//		(4)excute the statement
		
		stmt.execute("create table product(pid number,pname varchar2(10),ptype varchar2(10),pprice number)");
		
//		(5)close the connections
		
		conn.close();
		
		System.out.println("Table is created successfully");
	}

}

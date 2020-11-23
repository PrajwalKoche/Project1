package conn;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConn 
{
public static java.sql.Connection getConn() throws Exception
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	java.sql.Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo1","root","Pass@12345");
	return conn;
}
}
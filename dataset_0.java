package mulesoft_submission;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;

public class dataset_0
{
	public static void main(String args[])
	{
		try
		{
		  Connection con = null;
		  Driver d = new com.mysql.cj.jdbc.Driver();
		  DriverManager.registerDriver(d);
		  System.out.println("Driver Class Loadeing");
		  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","root");
		  Statement stmt = con.createStatement();
		  String sql = "CREATE DATABASE mulesoft_data";
		  stmt.executeUpdate(sql);
		  System.out.println("The Movie database named mulesoft_data has been succesfully created.");
		  con.close();
		  con.close();
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
	}
}

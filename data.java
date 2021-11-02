package mulesoft_submission;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;

public class data
{
	public static void main(String args[])
	{
		try
		{
		  Connection con = null;
		  Driver d = new com.mysql.cj.jdbc.Driver();
		  DriverManager.registerDriver(d);
		  System.out.println("Driver class has been loaded");
		  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mulesoft_data","root","root");
		  Statement stmt1 = con.createStatement();
		  Statement stmt2 = con.createStatement();
		  Statement stmt3 = con.createStatement();
		  String sql1 = "insert into movie_details values('End Game','Robert Downey Jr.','Russo Brothers',2019)";
		  String sql2 = "insert into movie_details values('Interstellar','Matthew McConaughey','Christopher Nolan',2014)";
		  String sql3 = "insert into movie_details values('Gravity','Sandra Bullock','Alfonso Cuarón',2013)";
		  stmt1.executeUpdate(sql1);
		  stmt2.executeUpdate(sql2);
		  stmt3.executeUpdate(sql3);
		  System.out.println("Records have been inserted successfully.");
		  con.close();
		  con.close();
		}
		
		catch(Exception e)	{
		System.out.println(e);
		}
		
	}
}

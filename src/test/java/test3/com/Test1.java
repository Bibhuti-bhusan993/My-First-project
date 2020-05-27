package test3.com;

import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.HashSet;


public class Test1 {
	
	public static void main(String args[]) throws ClassNotFoundException, SQLException{
		
		 String dbURL = "jdbc:sqlserver://10.208.92.174:1433/POC";
		 String username = "pocqa";
		String password = "pocuser@1234";
    //Load MS SQL JDBC Driver
    Class.forName("net.sourceforge.jtds.jdbc.Driver");
    //Creating connection to the database
    Connection con = DriverManager.getConnection(dbURL,username,password);
    //Creating statement object
 Statement st = con.createStatement();
 String selectquery = "select * from poc_tm_efforts where poc_contract_id='UTIL-5818'";
    //Executing the SQL Query and store the results in ResultSet
 ResultSet rs = st.executeQuery(selectquery);
 //While loop to iterate through all data and print results
 while (rs.next()) {
 System.out.println(rs.getString("transaction_datetime"));
 }
    //Closing DB Connection
 con.close();}
	
	
}

	
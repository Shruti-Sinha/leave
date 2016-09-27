package leaveMgmtSystem.dbUtil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
	
	static Connection con = null;
	static InputStream iStream = null;
	static String driverClass=null, url=null,user=null,pass=null;
	static FileInputStream fin=null;
	
	
	/*
	 * static block for connecting to the database
	 */
/*	static {
		iStream=DBConnection.class.getClassLoader().getResourceAsStream("/main/java/db-config.properties");
		
		
			System.out.println(iStream);
		
			// Create a Properties class object
			Properties p = new Properties();
			

			try {
				// reads a property list (key and element pairs) from the input byte
				// stream
				p.load(iStream);
				System.out.println(p);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// retrieving the values from the properties file into appropriate
			// variables
			driverClass = p.getProperty("driverclass");
			url = p.getProperty("url");
			user = p.getProperty("uname");
			pass = p.getProperty("pwd");
			System.out.println(p);

			

			try {
				// returns the Class object associated with the class or interface
				// with
				// the given string name, using the given class loader.
				System.out.println(Class.forName(driverClass));
				System.out.println("connecting...");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			

			
	}
	
	public static Connection getDBConnection(){
		try {
				// create a connection object and create DB connection
				con = DriverManager.getConnection(url, user, pass);
				System.out.println(con);
				System.out.println("connected");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return con;
	}
*/
	
	
	
	
	
	
	static {
		
		try {
			// Read bytes from properties file
			fin = new FileInputStream(
						"/home/shrutis/Desktop/miniproj/LeaveManagementSystem/src/main/java/db-config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			System.out.println(fin);
		
			// Create a Properties class object
			Properties p = new Properties();
			

			try {
				// reads a property list (key and element pairs) from the input byte
				// stream
				p.load(fin);
				System.out.println(p);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// retrieving the values from the properties file into appropriate
			// variables
			String driverClass = p.getProperty("driverclass");
			String url = p.getProperty("url");
			String user = p.getProperty("uname");
			String pass = p.getProperty("pwd");
			System.out.println(p);

			

			try {
				// returns the Class object associated with the class or interface
				// with
				// the given string name, using the given class loader.
				System.out.println(Class.forName(driverClass));
				System.out.println("connecting...");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			

			try {
				// create a connection object and create DB connection
				con = DriverManager.getConnection(url, user, pass);
				System.out.println(con);
				System.out.println("connected");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public static Connection getDBConnection(){
		return con;
	}


	
	
	
	
	
	
}

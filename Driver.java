package jdbc1;

import java.sql.*;

public class Driver {

	public static void main(String[] args) {
		
		String url = "jdbc:oracle:thin:@ora3.elka.pw.edu.pl:1521:ora3inf";
		String user = "mrzepec1";
		String password = "mrzepec1";
		
		try {
			// get a connection to db
			Connection myConn = DriverManager.getConnection  (url, user, password);
			//create a statement
			Statement myStmt = myConn.createStatement();
			//execute sql query
			ResultSet myRs = myStmt.executeQuery("SELECT * FROM PRACOWNICY");
			//process the result set
			while (myRs.next()){
				System.out.println(myRs.getString("Imie") + " " + myRs.getString("Nazwisko"));
			}
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}

	}

}

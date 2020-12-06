package DBUtill;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtill {
	public static Connection getConnection() {
		Connection conn = null;
		String myDriver = "oracle.jdbc.driver.OracleDriver";
		String myURL = "jdbc:oracle:thin:@localhost:1521:xe";
		String myID = "jslhrd46";
		String myPass = "1234";
		try {
			Class.forName(myDriver);
		}catch(ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
			System.out.println("드라이버로딩오류");
		}
		try {
			conn=DriverManager.getConnection(myURL,myID,myPass);
		}catch(SQLException ex) {
			ex.printStackTrace();
			System.out.println("오류");
		}return conn;
	}
}
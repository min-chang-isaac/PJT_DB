package jp.cal.sample;
import java.sql.Connection;
import java.sql.DriverManager;

public class Main {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE",
					"MUSIC",
					"TOWN"
					
					);
			
					System.out.println("success");
					conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

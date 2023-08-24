import java.sql.*;
import java.sql.DriverManager;

public class Conn {

	Connection c;
	Statement s;
	public Conn() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem","root","root123");
			s=c.createStatement();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

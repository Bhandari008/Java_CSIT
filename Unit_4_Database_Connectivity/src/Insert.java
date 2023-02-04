import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Insert {
	Connection con;
	Statement statement;
	ResultSet set;
	
	public Insert() throws ClassNotFoundException, SQLException {
		con = new SimpleDatabase().getConnection();
		statement = con.createStatement();
		
		String insert = "INSERT INTO College_tn1 VALUES(2, 'CAB')";
		
		
		statement.executeUpdate(insert); // creates a table in db
		
		
		System.out.println("Insert Data");
		
		// Retrieve
		
		set = statement.executeQuery("SELECT * FROM College_tn1");
		while(set.next()) {
			System.out.println("College Id: "+ set.getInt("id"));
			
			System.out.println("College Name: "+ set.getString("CollegeName"));
			
		}
			
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		new Insert();

	}

}

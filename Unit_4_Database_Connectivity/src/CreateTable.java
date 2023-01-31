import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	Connection con;
	Statement statement;
	
	public CreateTable() throws ClassNotFoundException, SQLException {
		con = new SimpleDatabase().getConnection();
		statement = con.createStatement();
		String create = "\r\n"
				+ "CREATE TABLE College_tn1(\r\n"
				+ "	id int,\r\n"
				+ "	CollegeName varchar(100),\r\n"
				+ ")";
		
		statement.executeUpdate(create); // creates a table in db
		
		System.out.println("Table Created");
		
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		new CreateTable();
	}

}

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SimpleDatabase {
	Connection con;

	public SimpleDatabase() throws ClassNotFoundException, SQLException {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String database = "NCS_CSIT_2075_DB";
		int port = 1433;
		String server = "//DESKTOP-6C86VFI\\";
		String connectionString = "jdbc:sqlserver:"+server+":"+port+";databaseName="+ database+";integratedSecurity=true";
		
		
		con = DriverManager.getConnection(connectionString);
		
		System.out.println("Connection Activated");	
		
	}
	
	Connection getConnection() {
		return con;
	}
}


// CRUD Operation

// SQL 9.4
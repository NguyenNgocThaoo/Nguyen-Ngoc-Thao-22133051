package tuan3.config;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	 private static final String serverName ="localhost";
	    private static final String dbname = "Web_Test_1";
	    private static final String portNumber ="1433";
	    private static final String instance ="";
	    private static final String userID ="sa";
	    private static final String password = "123456";
	    private static final String trust = ";encrypt=true;trustServerCertificate=true";

	    public static Connection getConnection() throws SQLException{
	        Connection conn = null;
	        try {
	            String url = "jdbc:sqlserver://"+serverName+":"+portNumber+"\" + instance + "+";databaseName="+dbname+" "+ trust;

	            if (instance == null || instance.trim().isEmpty())
	                url = "jdbc:sqlserver://"+serverName+":"+portNumber+ ";databaseName="+dbname + " " + trust;
	            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	            conn = DriverManager.getConnection(url, userID , password);
	            return conn;
	 
	        } catch (ClassNotFoundException ex) {
	            ex.printStackTrace();
	        }
	        return null;
	    }
}

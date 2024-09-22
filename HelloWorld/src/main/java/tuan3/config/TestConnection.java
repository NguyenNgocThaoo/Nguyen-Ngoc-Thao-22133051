package tuan3.config;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import tuan3.models.UserModel;

public class TestConnection {
	public static void main(String[] args) {
	
        Connection connection = null;

        try {
            connection = DBConnection.getConnection();
            if (connection != null) {
                System.out.println("Kết nối thành công!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        String sql = "SELECT * FROM [USER] WHERE username = ? ";
		 try {
			 Connection conn = null;
				 PreparedStatement ps = null;
				  ResultSet rs = null;
			 new DBConnection();
			conn = DBConnection.getConnection();
			 ps = conn.prepareStatement(sql);
			 ps.setString(1, "thao");
			 rs = ps.executeQuery();
			 System.out.print("111111111111111111111");
			 while (rs.next()) {
				 System.out.println("Result Set");	

				 UserModel user = new UserModel();
//				 user.setId(rs.getInt("Id"));
//				 user.setUsername(rs.getString("username"));
//				 user.setFullname(rs.getString("fullname"));
//				 user.setPassword(rs.getString("password"));
//				 user.setImage(rs.getString("image"));
				 System.out.print(user);
		 }
		 } catch (Exception e) {e.printStackTrace();}
    }
}

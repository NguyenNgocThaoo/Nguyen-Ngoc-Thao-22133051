package tuan3.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.sql.SQLException;

import tuan3.config.DBConnection;
import tuan3.models.UserModel;

public class UserDaoImpl extends DBConnection implements IUserDao{
	 public Connection conn = null;
	 public PreparedStatement ps = null;
	 public ResultSet rs = null;
	@Override
	public UserModel findOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(UserModel user) {
		String sql = "INSERT INTO [User](email, username, fullname, password, avatar, roleid,phone, createddate) VALUES (?,?,?,?,?,?,?,?)";
				 try {
				 conn = DBConnection.getConnection();
				 ps = conn.prepareStatement(sql);
				 ps.setString(1, user.getEmail());
				 ps.setString(2, user.getUserName());
				 ps.setString(3, user.getFullName());
				 ps.setString(4, user.getPassWord());
				 ps.setString(5, user.getAvatar());
				 ps.setInt(6,user.getRoleid());
				 ps.setString(7,user.getPhone());
				 ps.setDate(8, user.getCreatedDate());
				 ps.executeUpdate();
				 } catch (Exception e) {e.printStackTrace();}
		
	}

	@Override
	public List<UserModel> findAll() {
		String sql = "select * from [User]";
        List<UserModel> list = new ArrayList<>();

        try {
            conn = super.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while(rs.next()) {
                list.add(
                        new UserModel(
                                rs.getString("email"), 
                                rs.getString("username"), 
                                rs.getString("fullName"), 
                                rs.getString("passWord"),
                                rs.getString("avatar"),
                                Integer.parseInt(rs.getString("roleid")),
                                rs.getString("phone"),
                                rs.getDate("createdDate")
                                )
                        );
            }
            return list;

        } catch(Exception e) {
            e.printStackTrace();
        }
        return null;
	}

	@Override
	public UserModel  findByUserName(String username) {
		 String sql = "SELECT * FROM [USER] WHERE username = ? ";
		 try {
			
			conn = DBConnection.getConnection();
			 ps = conn.prepareStatement(sql);
			 ps.setString(1, "thao");
			 rs = ps.executeQuery();
			 System.out.print("111111111111111111111");
			 while (rs.next()) {
				 System.out.print("Result Set");
				 UserModel user = new UserModel();
			        user.setId(rs.getInt("id"));
			        user.setEmail(rs.getString("email"));
			        user.setUserName(rs.getString("username"));
			        user.setFullName(rs.getString("fullname"));
			        user.setPassWord(rs.getString("password"));
			        user.setAvatar(rs.getString("avatar"));
			        user.setRoleid(Integer.parseInt(rs.getString("roleid")));
			        user.setPhone(rs.getString("phone"));
			        user.setCreatedDate(rs.getDate("createdDate"));
				 return user;
			 }
		 }
		 catch (Exception e) {e.printStackTrace();}
		 return null;
	}

	@Override
	public boolean checkExistEmail(String email) {
		 boolean duplicate = false;
		 String query = "select * from [user] where email = ?";
		 try {
		 conn = new DBConnection().getConnection();
		 ps = conn.prepareStatement(query);
		 ps.setString(1, email);
		 rs = ps.executeQuery();
		 if (rs.next()) {
		 duplicate = true;
		 }
		 ps.close();
		 conn.close();
		 } catch (Exception ex) {}
		 return duplicate;
	}

	@Override
	public boolean checkExistUsername(String username) {
		 boolean duplicate = false;
		 String query = "select * from [User] where username = ?";
		 try {
		 conn = new DBConnection().getConnection();
		 ps = conn.prepareStatement(query);
		 ps.setString(1, username);
		 rs = ps.executeQuery();
		 if (rs.next()) {
		 duplicate = true;
		 }
		 ps.close();
		 conn.close();
		 } catch (Exception ex) {}
		 return duplicate;
	}

	@Override
	public boolean checkExistPhone(String phone) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}

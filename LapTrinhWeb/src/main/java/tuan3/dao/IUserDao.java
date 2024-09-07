package tuan3.dao;

import java.util.List;

import tuan3.models.*;

public interface IUserDao {
	List<UserModel> findAll();
	UserModel findOne(int id);
	void insert(UserModel user);
	UserModel  findByUserName(String username);
	 void insert(UserModel user);
	 boolean checkExistEmail(String email);
	 boolean checkExistUsername(String username);
	 boolean checkExistPhone(String phone);
}

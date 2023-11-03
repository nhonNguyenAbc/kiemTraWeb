package vn.iotstar.Services.Users;

import java.util.List;

import vn.iotstar.DAO.Users.IUsersDao;
import vn.iotstar.DAO.Users.UsersDaoImpl;
import vn.iotstar.Models.Users;

public class UsersServiceImpl implements IUsersService{

	IUsersDao users = new UsersDaoImpl();
	
	@Override
	public List<Users> findAll() {
		return users.findAll();
	}

}

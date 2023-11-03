package vn.iotstar.DAO.Users;

import java.util.List;

import vn.iotstar.Models.Users;

public interface IUsersDao {
	List<Users> findAll();
}

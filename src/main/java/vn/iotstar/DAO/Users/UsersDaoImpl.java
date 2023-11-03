package vn.iotstar.DAO.Users;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import vn.iotstar.DAO.DBConnectionsqlserver;
import vn.iotstar.Models.Users;

public class UsersDaoImpl implements IUsersDao{

	Connection cnn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	@Override
	public List<Users> findAll() {
		List<Users> list = new ArrayList<Users>();
		String sql = "select * from Users";
		try {
			cnn = new DBConnectionsqlserver().getConnection();
			ps = cnn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				Users user = new Users();
				user.setUsername(rs.getString("Username"));
				user.setPassword(rs.getString("Password"));
				user.setPhone(rs.getString("Phone"));
				user.setFullname(rs.getString("Fullname"));
				list.add(user);
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
		
	}
	
	
}

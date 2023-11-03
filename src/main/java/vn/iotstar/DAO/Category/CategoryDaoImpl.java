package vn.iotstar.DAO.Category;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import vn.iotstar.DAO.DBConnectionsqlserver;
import vn.iotstar.Models.Category;

public class CategoryDaoImpl implements ICategoryDao{

	Connection cnn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	@Override
	public List<Category> findAll() {
		List<Category> list = new ArrayList<Category>();
		String sql = "select * from Category";
		try {
			cnn = new DBConnectionsqlserver().getConnection();
			ps = cnn.prepareStatement(sql);
			rs = ps.executeQuery();
		while(rs.next()) {
			Category cate = new Category();
			cate.setCategoryid(rs.getInt("Categoryid"));
			cate.setCategoryname(rs.getString("Categoryname"));
			list.add(cate);
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Category findOne(int categoryid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Category category) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Category category) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int categoryid) {
		// TODO Auto-generated method stub
		
	}

}

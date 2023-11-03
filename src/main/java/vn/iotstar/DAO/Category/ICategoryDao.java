package vn.iotstar.DAO.Category;

import java.util.List;

import vn.iotstar.Models.Category;


public interface ICategoryDao {
	List<Category> findAll();
	Category findOne(int Categoryid);
	void insert(Category category);
	void delete(int categoryid);
	void update(Category category);
	
}

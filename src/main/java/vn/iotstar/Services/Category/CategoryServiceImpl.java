package vn.iotstar.Services.Category;

import java.util.List;

import vn.iotstar.DAO.Category.*;
import vn.iotstar.Models.Category;

public class CategoryServiceImpl implements ICategoryService{

	ICategoryDao cate = new CategoryDaoImpl();
	@Override
	public List<Category> findAll() {
		// TODO Auto-generated method stub
		return cate.findAll();
	}
}

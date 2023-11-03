package vn.iotstar.Models;

import java.io.Serializable;

public class Category implements Serializable{
	private static final long serialVersionUID = 1L;
	private int categoryid;
	private String categoryname;
	private String categorycode;
	private String images;
	private boolean status;
	
	
	public Category() {
		super();
	}


	public Category(int categoryid, String categoryname, String categorycode, String images, boolean status) {
		super();
		this.categoryid = categoryid;
		this.categoryname = categoryname;
		this.categorycode = categorycode;
		this.images = images;
		this.status = status;
	}


	public int getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}


	public String getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}


	public String getCategorycode() {
		return categorycode;
	}
	public void setCategorycode(String categorycode) {
		this.categorycode = categorycode;
	}


	public String getImages() {
		return images;
	}
	public void setImages(String images) {
		this.images = images;
	}


	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
}

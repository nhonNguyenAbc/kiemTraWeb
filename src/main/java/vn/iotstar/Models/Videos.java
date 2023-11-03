package vn.iotstar.Models;

import java.io.Serializable;

public class Videos implements Serializable{
	private static final long serialVersionUID = 1L;
	private String videoid;
	private String title;
	private String poster;
	private int views;
	private String description;
	private boolean active;
	private int categoryid;
	
	
	public Videos() {
		super();
	}


	public Videos(String videoid, String title, String poster, int views, String description, boolean active,
			int categoryid) {
		super();
		this.videoid = videoid;
		this.title = title;
		this.poster = poster;
		this.views = views;
		this.description = description;
		this.active = active;
		this.categoryid = categoryid;
	}


	public String getVideoid() {
		return videoid;
	}


	public void setVideoid(String videoid) {
		this.videoid = videoid;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getPoster() {
		return poster;
	}


	public void setPoster(String poster) {
		this.poster = poster;
	}


	public int getViews() {
		return views;
	}


	public void setViews(int views) {
		this.views = views;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public boolean isActive() {
		return active;
	}


	public void setActive(boolean active) {
		this.active = active;
	}


	public int getCategoryid() {
		return categoryid;
	}


	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}
	
	
}

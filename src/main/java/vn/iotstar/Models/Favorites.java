package vn.iotstar.Models;

import java.io.Serializable;
import java.sql.Date;

public class Favorites implements Serializable{
	private static final long serialVersionUID = 1L;
	private int favoriteid;
	private Date likedDate;
	private String videoid;
	private String username;
	
	public Favorites() {
		super();
	}

	public Favorites(int favoriteid, Date likedDate, String videoid, String username) {
		super();
		this.favoriteid = favoriteid;
		this.likedDate = likedDate;
		this.videoid = videoid;
		this.username = username;
	}

	public int getFavoriteid() {
		return favoriteid;
	}

	public void setFavoriteid(int favoriteid) {
		this.favoriteid = favoriteid;
	}

	public Date getLikedDate() {
		return likedDate;
	}

	public void setLikedDate(Date likedDate) {
		this.likedDate = likedDate;
	}

	public String getVideoid() {
		return videoid;
	}

	public void setVideoid(String videoid) {
		this.videoid = videoid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
}

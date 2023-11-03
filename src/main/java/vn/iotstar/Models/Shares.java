package vn.iotstar.Models;

import java.io.Serializable;
import java.sql.Date;

public class Shares implements Serializable{
	private static final long serialVersionUID = 1L;
	private int shareid;
	private String emails;
	private Date sharedDate;
	private String username;
	private String videoid;
	
	
	public Shares() {
		super();
	}

	public Shares(int shareid, String emails, Date sharedDate, String username, String videoid) {
		super();
		this.shareid = shareid;
		this.emails = emails;
		this.sharedDate = sharedDate;
		this.username = username;
		this.videoid = videoid;
	}

	public int getShareid() {
		return shareid;
	}

	public void setShareid(int shareid) {
		this.shareid = shareid;
	}

	public String getEmails() {
		return emails;
	}

	public void setEmails(String emails) {
		this.emails = emails;
	}

	public Date getSharedDate() {
		return sharedDate;
	}

	public void setSharedDate(Date sharedDate) {
		this.sharedDate = sharedDate;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getVideoid() {
		return videoid;
	}

	public void setVideoid(String videoid) {
		this.videoid = videoid;
	}
	
	
	
}

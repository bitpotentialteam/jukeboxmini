package org.juke.domain;

import java.util.Date;

public class MusicVO {
	
	
	private Integer mno;
	private String title, singer, album, jacket, userid;
	private Date regdate, updatedate;
	
	
	public Integer getMno() {
		return mno;
	}
	public void setMno(Integer mno) {
		this.mno = mno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getJacket() {
		return jacket;
	}
	public void setJacket(String jacket) {
		this.jacket = jacket;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public Date getUpdatedate() {
		return updatedate;
	}
	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}
	
	@Override
	public String toString() {
		return "MusicVO [mno=" + mno + ", title=" + title + ", singer=" + singer + ", album=" + album + ", jacket="
				+ jacket + ", userid=" + userid + ", regdate=" + regdate + ", updatedate=" + updatedate + "]";
	}
	
	
}

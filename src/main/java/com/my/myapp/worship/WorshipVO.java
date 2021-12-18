package com.my.myapp.worship;

import java.util.Date;

public class WorshipVO {
	private int seq;
	private String worship;
	private String worshiptime;
	private String writer;
	private String number;
	private String vaccine;
	private Date regdate;
	private int cnt;
	
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getWorship() {
		return worship;
	}
	public void setWorship(String worship) {
		this.worship = worship;
	}
	public String getWorshiptime() {
		return worshiptime;
	}
	public void setWorshiptime(String worshiptime) {
		this.worshiptime = worshiptime;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getVaccine() {
		return vaccine;
	}
	public void setVaccine(String vaccine) {
		this.vaccine = vaccine;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
}

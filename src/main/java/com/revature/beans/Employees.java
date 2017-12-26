package com.revature.beans;

public class Employees {
	private int eid;
	private String username;
	private int reportsto;
	private boolean isdeptHead;
	private boolean isBenCo;
	private String firstname;
	private String lastname;
	private int Available;
	private int password;	
	
	public Employees() {	}
	public Employees(int eid, String username, int reportsto, boolean isdeptHead, boolean isBenCo, String firstname,
			String lastname, int available, int password) {
		super();
		this.eid = eid;
		this.username = username;
		this.reportsto = reportsto;
		this.isdeptHead = isdeptHead;
		this.isBenCo = isBenCo;
		this.firstname = firstname;
		this.lastname = lastname;
		Available = available;
		this.password = password;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getReportsto() {
		return reportsto;
	}
	public void setReportsto(int reportsto) {
		this.reportsto = reportsto;
	}
	public boolean isIsdeptHead() {
		return isdeptHead;
	}
	public void setIsdeptHead(boolean isdeptHead) {
		this.isdeptHead = isdeptHead;
	}
	public boolean isBenCo() {
		return isBenCo;
	}
	public void setBenCo(boolean isBenCo) {
		this.isBenCo = isBenCo;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAvailable() {
		return Available;
	}
	public void setAvailable(int available) {
		Available = available;
	}
		public int getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password.hashCode();
	}
}

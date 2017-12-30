package com.revature.beans;

public class Employees {
	private int eid;
	private String username;
	private int supervisor;
	private int deptHead;
	private boolean isdeptHead;
	private boolean isBenCo;
	private String firstname;
	private String lastname;
	private int Available;
	private int password;	
	
	public Employees() {	}
	public Employees(int eid, String username, int supervisor, int deptHead, boolean isdeptHead, boolean isBenCo, String firstname,
			String lastname, int available, int password) {
		super();
		this.eid = eid;
		this.username = username;
		this.supervisor = supervisor;
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
	
	public int getSupervisor() {
		return supervisor;
	}
	public void setSupervisor(int supervisor) {
		this.supervisor = supervisor;
	}
	public int getDeptHead() {
		return deptHead;
	}
	public void setDeptHead(int deptHead) {
		this.deptHead = deptHead;
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

package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.revature.beans.Employees;
import com.revature.util.ConnectionUtil;


public class EmployeeDao {
	public Employees loginEmp(String username, String password) {
		//return to servlet if deptHead is true
		//render manager view
		Employees emp = new Employees();
		PreparedStatement prepstate;
		String sql = "select * from employees where username = ?";
		try(Connection conn = ConnectionUtil.getConnection()){
			prepstate = conn.prepareStatement(sql);
			prepstate.setString(1, username);
			ResultSet rs = prepstate.executeQuery();
			
			while(rs.next()) {
				String pwd = rs.getString("password");
				
				if(pwd.equals(password)) {
					int eid = rs.getInt("eid");
					int supervisor = rs.getInt("supervisor");
					int deptHead = rs.getInt("deptHead");
					String firstname = rs.getString("firstname");
					String lastname = rs.getString("lastname");
					String isDeptHead = rs.getString("isDeptHead");
					String isBenCo = rs.getString("isBenCo");
					emp.setEid(eid);
					emp.setSupervisor(supervisor);
					emp.setDeptHead(deptHead);
					emp.setFirstname(firstname);
					emp.setLastname(lastname);	
					emp.setBenCo(Boolean.parseBoolean(isBenCo));
					emp.setIsdeptHead(Boolean.parseBoolean(isDeptHead));
				}
				else {
					return null;
				}
			}
			rs.close();
			prepstate.close();
		} catch (Exception ex) {
			ex.printStackTrace();
			ex.getMessage();
		}
		return emp;
	}
	public void createEmp(Employees emp) {
		
	}
}
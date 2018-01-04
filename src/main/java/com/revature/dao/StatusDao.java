package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Reimbursements;
import com.revature.util.ConnectionUtil;

public class StatusDao {
	public void DeptHeadApprove(int rid) {
		PreparedStatement prepstate;
		String sql = "update rstatus set depthead = 'Approve' where rid = ?";
		try(Connection conn = ConnectionUtil.getConnection()){
			prepstate = conn.prepareStatement(sql);
			prepstate.setInt(1,  rid);
			ResultSet rs = prepstate.executeQuery();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	public void DeptHeadDeny(int rid) {
		PreparedStatement prepstate;
		String sql = "update rstatus set depthead = 'Deny' where rid = ?";
		try(Connection conn = ConnectionUtil.getConnection()){
			prepstate = conn.prepareStatement(sql);
			prepstate.setInt(1,  rid);
			ResultSet rs = prepstate.executeQuery();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}

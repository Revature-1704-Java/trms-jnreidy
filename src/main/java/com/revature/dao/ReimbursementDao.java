package com.revature.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
          
import com.revature.beans.Reimbursements;
import com.revature.util.ConnectionUtil;

public class ReimbursementDao {
	public List<Reimbursements> getAllReimburesments(){
		PreparedStatement prepstate;
		List<Reimbursements> reimburse = new ArrayList<>();
		String sql = "select * from reimbursements";
		try(Connection conn = ConnectionUtil.getConnection()){
			prepstate = conn.prepareStatement(sql);
			ResultSet rs = prepstate.executeQuery();
			while(rs.next()) {
				int rid = rs.getInt("id");
				int eid = rs.getInt("eid");
				double amount = rs.getDouble("amount");
				double cost = rs.getDouble("cost");
				String status = rs.getString("status");
				String rtype = rs.getString("rtype");
				String description = rs.getString("descripton");                        
				
				Reimbursements r = new Reimbursements(rid, eid, cost, amount, rtype, description, status);
				reimburse.add(r);
			}
			rs.close();
			prepstate.close();
		} catch (Exception ex) {
			ex.printStackTrace();
			ex.getMessage();
		}
		return reimburse;
	}
}

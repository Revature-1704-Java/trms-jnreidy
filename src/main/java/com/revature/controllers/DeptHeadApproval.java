package com.revature.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.dao.ReimbursementDao;
import com.revature.dao.StatusDao;

/**
 * Servlet implementation class DeptHeadApproval
 */
@WebServlet("/deptHeadApprove")
public class DeptHeadApproval extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		StatusDao dao = new StatusDao();
		String rparam = request.getParameter("rid");
		int rid = Integer.parseInt(rparam);
		dao.DeptHeadApprove(rid);
		ReimbursementDao rdao = new ReimbursementDao();
		String status = dao.checkStatus(rid);
		switch (status) {
		case "Approve":
			rdao.updateStatus("Approved", rid);
			break;
		case "Deny":
			rdao.updateStatus("Denied", rid);
			break;
		default:
			break;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

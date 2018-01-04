package com.revature.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.beans.Employees;
import com.revature.beans.Reimbursements;
import com.revature.dao.ReimbursementDao;


@WebServlet("/DeptHeadView")
public class DeptHeadViewServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		Employees emp = (Employees) session.getAttribute("emp");
		System.out.println(emp.getEid());
		boolean login = (boolean) session.getAttribute("login");
		System.out.println(login);
		if(login) {
			ReimbursementDao dao = new ReimbursementDao();
			List<Reimbursements> reimb = dao.getDeptHeadReimbursements(emp.getEid());
			session.setAttribute("reimbursements", reimb);
			response.sendRedirect("DeptHead.jsp");
		} else {
			response.sendRedirect("login");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		//RequestDispatcher rd = request.getRequestDispatcher("DeptHead.jsp");
		//rd.forward(request,  response);
	}

}

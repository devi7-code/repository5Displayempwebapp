package com.devi.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.devi.web.dao.EnquireDetailsDao;
import com.devi.web.model.Trainer;

/**
 * Servlet implementation class getEnquireDetails
 */
public class getEnquireDetails extends HttpServlet {
		/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int Id=Integer.parseInt(request.getParameter("Trainer_Id"));
		EnquireDetailsDao dao=new EnquireDetailsDao();
		Trainer details = dao.getEnquire(Id);
		request.setAttribute("detailsshow", details);
		RequestDispatcher rd = request.getRequestDispatcher("ShowDetails.jsp");
		rd.forward(request, response);
		
	}
	

}

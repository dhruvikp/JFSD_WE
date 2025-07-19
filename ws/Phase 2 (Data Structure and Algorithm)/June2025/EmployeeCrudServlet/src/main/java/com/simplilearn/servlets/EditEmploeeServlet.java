package com.simplilearn.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.simplilearn.util.DBUtil;

/**
 * Servlet implementation class EditEmploeeServlet
 */
@WebServlet("/editEmployee")
public class EditEmploeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditEmploeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		try {
			Connection con =  DBUtil.getConnection();
			
			PreparedStatement ps= con.prepareStatement("SELECT * FROM employees where id=?");
			ps.setInt(1, id);
			
 			ResultSet rs = ps.executeQuery();
 			
 			if(rs.next()) {
 				
 				out.println("<html><body>");
 				out.println("<h2>Edit Employees</h2>");
 				out.println("<form method='post' action='editEmployee'>");
 				out.println("<input type='hidden' name='id' value='"+id+"'/>");
 				out.println("Name: <input type='text' name='name' value='"+rs.getString("name")+"'/><br/>");
 				out.println("Email: <input type='text' name='email' value='"+rs.getString("email")+"'/><br/>");
 				out.println("Department: <input type='text' name='department' value='"+rs.getString("department")+"'/><br/>");
 				out.println("<input type='submit' value='Update' />");
 				out.println("</form>");
 				out.println("</body></html>");
 				
 			}else {
 				out.println("<h2>Employee not found!</h2>");
 			}
 			
 			rs.close();
 			ps.close();
 			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String dept = request.getParameter("department");
		
		Connection con;
		try {
			con = DBUtil.getConnection();
			PreparedStatement ps = con.prepareStatement("UPDATE employees SET name=?, email=?, department=? where id=?");
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, dept);
			ps.setInt(4, id);
			
			ps.executeUpdate();
			
			ps.close();
			con.close();
			response.sendRedirect("listEmployees");
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}

package com.simplilearn.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.simplilearn.util.DBUtil;

/**
 * Servlet implementation class ListEmployeesServlet
 */
@WebServlet("/listEmployees")
public class ListEmployeesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListEmployeesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<html><body>");
		out.println("<h2>Employee list</h2>");
		out.println("<a href='add_employee.html'> Add New Employee</a><br/><br/>");
		out.println("<table border='1'>");
		out.println("<tr><th>ID</th>");
		out.println("<th>Name</th>");
		out.println("<th>Email</th>");
		out.println("<th>Department</th>");
		out.println("<th>Actions</th>");
		
		try {
			Connection con = DBUtil.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * from employees");
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String dept = rs.getString("department");
				
				
				out.println("<tr>");
				out.println("<td>"+id+"</td>");
				out.println("<td>"+name+"</td>");
				out.println("<td>"+email+"</td>");
				out.println("<td>"+dept+"</td>");
				out.println("<td> <a href='editEmployee?id="+id+"'>Edit</a> |"
						+ "<a href='deleteEmployee?id="+id+"'>Delete</a>"
						+ "</td>");
				out.println("</tr>");
			}
			
			out.println("</table>");
			out.println("</body></html>");
			rs.close();
			stmt.close();
			con.close();
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

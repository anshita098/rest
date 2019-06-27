package com.lti;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lti.Customer;

/**
 * Servlet implementation class SaveServlet
 */
@WebServlet("/SaveServlet")
public class SaveServlet extends HttpServlet {
private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

/**
 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
 */
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 // TODO Auto-generated method stub
 response.setContentType("text/html");
 PrintWriter out = response.getWriter();
 
 String name = request.getParameter("name");
 String lname = request.getParameter("lname");
 String doj = request.getParameter("doj");
 String dept = request.getParameter("dept");
 
 Customer c = new Customer();
 c.setName(name);
 c.setLname(lname);
 c.setDoj(doj);
 c.setDept(dept);
 
 
 int status=CustomerDao.insertCustomer(c);
 if(status > 0) {
  out.println("<p> Record Saved Successfully </p>");
 }
 else {
  out.println("<p>Record Not Saved</p>");
 }
 out.close();
}

/**
 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
 */
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 // TODO Auto-generated method stub
 doGet(request, response);
}

}


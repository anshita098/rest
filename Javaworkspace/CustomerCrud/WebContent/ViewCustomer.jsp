<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,com.lti.*"%>
    
    <link href="./Views1.css" rel="stylesheet" type="text/css">
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
HttpSession sessionObj = request.getSession(true);
int timeout= 20000;
sessionObj.setMaxInactiveInterval(timeout);
response.setHeader("Refresh",timeout+"; TimeOut.jsp");
%>
<a   href="NewCustomer.html">Add new Employee</a><br><br>
<h1>Employees List</h1>

<% List<Customer> list = CustomerDao.getAllEmployees(); %>
<table border=1 >
 <tr>
 <th>Employee ID</th>
 <th>Employee Name</th>
 <th>Employee last name</th>
 <th>Date of joining</th>
 <th>Department</th>
 <th>Delete</th>
 </tr>
 <% for(Customer i:list) { %>
 <tr>
 <td><%=i.getId() %></td>
 <td><%=i.getName() %></td>
 <td><%=i.getLname() %></td>
 <td><%=i.getDoj() %></td>
 <td><%=i.getDept() %></td>
 <td><a href='DeleteServlet?id=<%=i.getId()%>'>Delete</a></td>
 </tr>
 <% } %>
</table>
</body>
</html>


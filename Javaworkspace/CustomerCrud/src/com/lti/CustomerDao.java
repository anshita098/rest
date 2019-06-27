package com.lti;
import java.util.*;

import com.lti.Customer;

import java.sql.*;
public class CustomerDao {

public static Connection getConnection()
{ Connection con=null;
try {
Class.forName("oracle.jdbc.driver.OracleDriver");
con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
}
catch (Exception e) {
System.out.println("Error in connection"+e);
}
return con;
}

public static int insertCustomer(Customer c) {
 int status=0;
 try {
  
  
 Connection con=CustomerDao.getConnection();
 
 
 
 PreparedStatement ps=con.prepareStatement("insert into employee values"+"(inc.NEXTVAL,?,?,?,?)");
 ps.setString(1,c.getName());
 ps.setString(2, c.getLname());
 ps.setString(3,c.getDoj());
 ps.setString(4, c.getDept());
 status=ps.executeUpdate();
 
 con.close();
 }catch (Exception e) {System.out.println(e);}
 return status;
 
 }

public static List<Customer> getAllEmployees(){
 List <Customer> list = new ArrayList<Customer>();
 try {
  Connection con = CustomerDao.getConnection();
  PreparedStatement ps = con.prepareStatement("select * from employee");
  ResultSet rs = ps.executeQuery();
  
  while(rs.next()) {
   Customer c = new Customer();
   c.setId(rs.getInt(1));
   c.setName(rs.getString(2));
   c.setLname(rs.getString(3));
   c.setDoj(rs.getString(4));
   c.setDept(rs.getString(5));
   
   list.add(c);
  }
  con.close();
 }
 catch(Exception e) {
  e.printStackTrace();
 }
 return list;
}

public static int deleteCustomer(long id) {
	int status=0;
	try {
		Connection con=CustomerDao.getConnection();
		PreparedStatement ps=con.prepareStatement(""+"delete from employee where id=?");
		ps.setLong(1,id);	
		status=ps.executeUpdate();
		con.close();
	}catch(Exception e) {
		e.printStackTrace();
	}
	return status;
}


}



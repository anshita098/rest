package com.lti.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Employee {

	private int empId;
	private String name;
	private int salary;
	
	public Employee(String name,int empId,int salary) {
		this.empId=empId;
		this.name=name ;
		this.salary=salary;
	}
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	public boolean equals(Object obj) {
		Employee emp =(Employee) obj;
		Boolean status= false;
		 if(this.name.equalsIgnoreCase(emp.name)
				 &&  this.empId==emp.empId
		 && this.salary == emp.salary) {
			 status=true;
			 
		 }
		 return status;
	}
	
	
	public static String getEmpWithHighestSalary() {
		return "Raj";
	}
	
	public static Employee getMighestPaidEmployee()
	{
		return new Employee("Re",1,15000);
	}
	public int hashCode()
	{
		return this.empId;
	}
	public class EmployeeTest
	{
		@Test
		public void mySimpleEqualsTest() {
		 String expectedName="Raj";
		 assertEquals(expectedName,Employee.getEmpWithHighestSalary());
		 }

		  @Test
		    public void myObjectEqualsTest() {
		 Employee expectedEmpObj=new Employee("raj",1,15000);
		 assertEquals(expectedEmpObj,Employee.getMighestPaidEmployee());
		}
	}
}



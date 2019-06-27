package com.lti;
public class Customer {
private long id;
private String name, lname,doj,dept;

public long getId() {
	return id;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}

public String getDoj() {
	return doj;
}
public void setDoj(String doj) {
	this.doj = doj;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public void setId(long id) {
this.id = id;
}

}


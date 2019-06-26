package com.lti.junit;

public class Calculator {
 public  double add(double a,double b) {
	 return a+b;
 }
 
 public double substract(double a,double b) {
	 return a-b;
 }
 
 public double multiply(double a,double b) {
	 return a*b;
 }
 
 public double divide(double a,double b) {
	 if (b==0)
		 throw new ArithmeticException();
		 else
	 return a/b;
 }
}

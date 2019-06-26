package com.lti.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class SuitTest1 {
	public String message ="Raj";
	JunitMessage junitMessage = new JunitMessage(message);
	@Test
	public void testJunitMessage()
	{
		System.out.println("just msg is printing!");
		junitMessage.PrintMessage();
		
	}
	@Test
	public void testJunitHiMessage()
	{ 
		message = "Hi!"+ message;
		System.out.println("Junit Hi msg is printing");
		assertEquals(message,junitMessage.printHiMessage());
		System.out.println("Suite Test 1 is successful!"+message);
	}

}

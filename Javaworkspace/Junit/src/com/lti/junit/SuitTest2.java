package com.lti.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SuitTest2 {
	@Test
	public void createAndsetName()
	{
		String actual="Y";
		String expected ="Y";
		
		
		assertEquals(expected,actual);
		System.out.println("Suite test 2 is sucessful!!!" + actual);
	}

}

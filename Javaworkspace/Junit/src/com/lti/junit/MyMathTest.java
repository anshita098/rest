package com.lti.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyMathTest {

	MyMath myMath = new MyMath();
	@Before
	public void sum_with3numbers() {
		System.out.println("test1");
		assertEquals(6,myMath.sum(new int[] {1,2,3}));
	}

	@Test
	public void sum_with1number() {
		System.out.println("test2");
		assertEquals(3, myMath.sum(new int[] {3}));
	}
}

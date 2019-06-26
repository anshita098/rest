package com.lti.junit;

public class JunitMessage {
	String m;
	JunitMessage(String msg)
	{
		m=msg;
	}
	String PrintMessage()
	{
		return m;
	}
	String printHiMessage()
	{
		return "Hi"+m;
	}

}

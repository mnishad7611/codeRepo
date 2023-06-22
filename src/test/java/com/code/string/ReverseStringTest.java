package com.code.string;

import com.code.AppTest;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class ReverseStringTest extends TestCase{

	public ReverseStringTest(String str){
		super(str);
	}

	public static Test suite(){
		return new TestSuite( ReverseStringTest.class );
	}

	public void testApp(){
		assertTrue(true);
	}
	public void testReversedString(){
		String result=ReverseString.getReverseString("dheeraj");
		assertEquals("jareehd", result);
	}






	

}

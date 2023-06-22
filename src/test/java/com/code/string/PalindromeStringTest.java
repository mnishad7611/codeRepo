package com.code.string;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class PalindromeStringTest extends TestCase{

	public PalindromeStringTest(String result){
		super(result);
	}

	public static Test suite(){
		return new TestSuite( PalindromeStringTest.class );
	}

	public void testApp(){
		assertTrue(true);
	}

	public void testStringIsPalindromeOrNot(){
		boolean result = PalindromeString.checkPalindromeStr("Keek");
		//assertEquals(true,result );
		assertTrue(result);
	}

	public void testStringIsPalindrome(){
		boolean result = PalindromeString.checkPalindromeStr("Keep");
		//assertEquals(true,result );
		assertFalse(result);
	}
	
	
}

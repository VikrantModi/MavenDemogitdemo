package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CalculatorTests {
	
	Calculator c=new Calculator();
	@Disabled 
    @Test
	public void testSayHello()
	{
    	
		Assertions.assertEquals("Hello World",c.sayHello());
	}
	@Disabled
	@Test 
    
    public void testAddTwoNos() { 
    	int result=c.addNos(100, 200);
    	Assertions.assertEquals(300, result);
    }
	@Test 
    public void testSubTwoNos() {
    	int result =c.subNos(200, 50);
    	Assertions.assertEquals(150, result);
    }
	@Test
	public void testAssertNulls() {
		String s1=null;
		String s2="Vikrant";
		Assertions.assertNull(s1);
		Assertions.assertNotNull(s2);
	}
	@Disabled
	@Test 
	public void testAssertFalse() {
		Assertions.assertFalse(("Vikrant".length()==10));
		Assertions.assertNotEquals("Hello", "Hello");
	}
	
	
}

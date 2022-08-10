package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ExceptionTest {

//	dev writes exception - j-unit checks whether those handled or not
	@Test
	void testExceptions() {
		
		Assertions.assertThrows(IllegalArgumentException.class,
		()->{Integer.parseInt("one");}
		);

}
	public void testmethodExp() {
		Calculator c=new Calculator();
		
		final Exception e=assertThrows(ArithmeticException.class,
				()->{c.searchEmp(0);});
		
		Assertions.assertEquals("U entered zero", e.getMessage());
	}
}

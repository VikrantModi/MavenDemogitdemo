package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestBeforeAfter {
    Calculator c=new Calculator();
    int sum=0;
    
    @BeforeAll
//   BeforeAll aur AfterAll me static use hota hai
    public static void testStartDbConn() {
    	System.out.println(" DB connection is up - only once");
    }
    
    @BeforeEach
    public void testStratup() {
    	int sum=0;
    	System.out.println("sum is zero" + sum);
    }
    
	@Test
	public void testAddTwoNos() { 
		System.out.println("test case 1");
    	int result=c.addNos(100, 200);
    	Assertions.assertEquals(300, result);
    }
	@Test 
    public void testSubTwoNos() {
		System.out.println("test case 2"); 
    	int result =c.subNos(200, 50);
    	Assertions.assertEquals(150, result);
    }
	@AfterEach
	public void testShutDown() {
		System.out.println(" some object null");
	}
	@AfterAll
	public static void testAfterAll() {
		System.out.println("utkarsh");
	}
	

}

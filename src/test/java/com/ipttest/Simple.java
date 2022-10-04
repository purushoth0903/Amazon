package com.ipttest;

import org.testng.annotations.Test;

public class Simple {
	
	
	
	@Test (priority = -2, invocationCount=2)
	private void submethod1() {
		System.out.println("test1");

	}
	@Test (priority = -1)

	private void submethod2() {
		System.out.println("test2");

	}
	@Test (priority = 0)

	private void submethod3() {
		System.out.println("test3");

	}
	@Test (priority = -3)

	private void submethod4() {
		System.out.println("test4");

	}
	@Test (timeOut=3000)

	private void submethod5() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("vandan");

	}
	
	
	@Test (expectedExceptions = ArithmeticException.class)

	private void submethod6() {
		
		System.out.println(10/0);

	}

}

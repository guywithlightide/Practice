package com.practice.main;

public class ChildClass extends ParentClass {
	
	public ChildClass() {
		System.out.println("Child class constructor called");
	}
	
	public void exceptionThrow() throws Exception {
		throw new Exception(this.getClass().getName());
	}
}

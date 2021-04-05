package com.practice.main;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MainClass {
	
	public static void main(String[] args) {
		
		try {
			try {
				try {
					throw new CustomException("This is a custom exception", new FileNotFoundException("FILE NOT FOUND"));
				} catch (CustomException c) {
					c.printStackTrace();
				}
				throw new ArrayIndexOutOfBoundsException();
			} catch (Exception e) {				
				throw e;
			}			
		} catch(RuntimeException exception)
		{
			try {
				exception.printStackTrace(new PrintWriter(new FileWriter("EXCEPTION_LOG.txt",true),true));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		finally {
			System.out.println("Finally block executed");
		}
		
		try {
			ChildClass childClass = (ChildClass) new ParentClass();
			childClass.exceptionThrow();
		} catch (Exception e) {

			e.printStackTrace();
		}
		
	}
}

class CustomException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public CustomException(String errorMessage, Throwable throwable) {
		super(errorMessage, throwable);
	}
}

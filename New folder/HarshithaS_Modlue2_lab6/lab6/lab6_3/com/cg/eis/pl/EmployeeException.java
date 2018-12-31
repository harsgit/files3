package com.cg.eis.pl;

public class EmployeeException extends Exception{
	String name;

	public EmployeeException(String name) {
		super();
		this.name = name;
	}
	

}

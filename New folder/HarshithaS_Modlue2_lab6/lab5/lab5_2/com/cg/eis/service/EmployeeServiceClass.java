package com.cg.eis.service;
import com.cg.eis.bean.*;


public class EmployeeServiceClass implements EmployeeService {
	
	private double salary;
	private String designation;
	private String insuranceScheme;
	private String scheme=" ";
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	@Override
	public String setsInsurance(double salary) {
		 if(salary>5000&&salary<20000)
		 {
			 setDesignation("System Associate");
			 System.out.println(getDesignation());
			 scheme="Scheme C";
		 }
		 //setDesignation("SystemAssociate");
		 if(salary>=20000&&salary<40000)
		 {
			 scheme="Scheme B";
		 //setDesignation("Programmer");
		 }
		 if(salary>=40000)
		 {
			 scheme="Scheme A";
		// setDesignation("Manager");
		 }
		 if(salary<5000)
		 {
			// setDesignation("Clerk");
		 scheme="No scheme";
		 } 
		return scheme;
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		return "EmployeeServiceClass [salary=" + salary + ", Designation=" + designation + "]";
	}
	
	
	 
		//return scheme;
	}

	



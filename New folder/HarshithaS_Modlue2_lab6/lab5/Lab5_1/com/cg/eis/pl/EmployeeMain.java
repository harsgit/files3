
	package com.cg.eis.pl;

	import java.util.Scanner;

	import com.cg.eis.bean.Employee;
	import com.cg.eis.service.EmployeeServiceClass;

	public class EmployeeMain {
		String scheme=" ";

		public static void main(String[] args) {
			EmployeeServiceClass s=new EmployeeServiceClass();
			Employee e=new Employee();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee name");
		String name=sc.nextLine();
		System.out.println("Enter id of Employee");
		int id=sc.nextInt();
		System.out.println("Enter Salary of Employee");
		double salary=sc.nextDouble();
		System.out.println("Enter Designation");
		String designation=sc.next();
		s.setSalary(salary);
		
		s.setDesignation(designation);
		System.out.println(s.getDesignation());
		e.setName(name);
		e.setId(id);
		System.out.println(e.getName());
		System.out.println(e+" "+s);
		System.out.println(s.setsInsurance(salary));
		
		
		
		
		}

	}




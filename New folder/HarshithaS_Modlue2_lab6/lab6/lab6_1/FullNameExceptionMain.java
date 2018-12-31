package lab6_1;

import java.util.Scanner;

public class FullNameExceptionMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your FirstName");
		String firstName=sc.nextLine();
		System.out.println("Enter your LastName");
		String lastName=sc.nextLine();
		try 
		{
			if(firstName.isEmpty()||lastName.isEmpty())
			
				throw new FullNameException("Invalid name");
			
			else
			
				System.out.println("Your name is"+firstName+" "+lastName);
		}
			catch(FullNameException a)
			{
				System.out.println(a);
			}
				
		
		
	}

}

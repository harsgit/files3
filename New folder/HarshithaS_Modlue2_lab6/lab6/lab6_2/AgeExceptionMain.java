package lab6_2;
import java.util.Scanner;

public class AgeExceptionMain {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your age");
	int age=sc.nextInt();
	try 
	{
		if(age<18)
		
			throw new AgeException("Invalid age");
		
		else
		
			System.out.println("Valid age");
	}
		catch(AgeException a)
		{
			System.out.println(a);
		}
			
		
	
}
}

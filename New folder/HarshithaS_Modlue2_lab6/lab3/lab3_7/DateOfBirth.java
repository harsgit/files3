package lab3_7;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DateOfBirth 
{
   static void calcAge()
   {
	   System.out.println("Enter date of birth");
	   Scanner sc= new Scanner(System.in);
	   String s=sc.nextLine();
	   LocalDate dob= LocalDate.parse(s);
	   LocalDate l= LocalDate.now();
	   Period period= dob.until(l);
	   System.out.println("Age: " + period.getYears());
   }
}

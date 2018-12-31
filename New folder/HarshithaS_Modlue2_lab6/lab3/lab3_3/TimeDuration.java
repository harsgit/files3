package lab3_3;



import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class TimeDuration {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a date in yyyy-mm-dd format");
		String input = sc.nextLine();
		TimeDuration.Duration(input);
		sc.close();
	}

	private static void Duration(String input) {
		LocalDate enteredDate = LocalDate.parse(input);
		LocalDate ld = LocalDate.now();
		Period p = enteredDate.until(ld);

		System.out.print("Duration is " + p.getYears() + "yrs");
		System.out.print(p.getMonths() + "months");
		System.out.println(p.getDays() + "days");
	}

	
}

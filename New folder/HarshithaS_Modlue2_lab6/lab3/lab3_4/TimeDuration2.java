package lab3_4;



import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class TimeDuration2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a date in yyyy-mm-dd format");
		String input = sc.nextLine();
		System.out.println("Enter another date in yyyy-mm-dd format");
		String input1 = sc.nextLine();
		TimeDuration2.timeDuration(input, input1);
		sc.close();
	}

	private static void timeDuration(String input, String input1) {
		LocalDate enteredDate1 = LocalDate.parse(input);
		LocalDate enteredDate2 = LocalDate.parse(input1);

		Period p = enteredDate1.until(enteredDate2);

		System.out.print("Duration is " + p.getYears() + "yrs");
		System.out.print(p.getMonths() + "months");
		System.out.println(p.getDays() + "days");

	}
}


package lab3_5;



import java.time.LocalDate;

import java.util.Scanner;

public class Warranty {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter purchase date in yyyy-mm-dd format");
		String input = sc.nextLine();
		System.out.println("Enter warranty in years");
		int year = sc.nextInt();
		System.out.println("Enter warranty in months");
		int months = sc.nextInt();
		Warranty.Duration(input, year, months);
		sc.close();
	}

	private static void Duration(String input, int year, int months) {
		LocalDate l = LocalDate.parse(input);

		LocalDate expireDate = l.plusYears(year).plusMonths(months);
		System.out.println("Product expires on" + expireDate);
	}

}

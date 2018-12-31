package lab3_6;



import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class ZoneDemo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String zone=new String();
	System.out.println("Enter time zone as (Europe/Paris)");
	sc.nextLine();
	ZonedDateTime z=ZonedDateTime.now(ZoneId.of(zone));
	System.out.println(z);
	
}
}


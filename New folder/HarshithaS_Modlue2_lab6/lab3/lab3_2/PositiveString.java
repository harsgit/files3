package lab3_2;


import java.util.*;
public class PositiveString {
	 static boolean sorted = true;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String newStr=sc.nextLine();
		boolean b=PositiveString.positiveString(newStr);
		System.out.println(b);
		sc.close();
		
	}
		static boolean positiveString(String newStr)
		{
		for(int i = 0; i < newStr.length()-1; i++){
		    if(newStr.charAt(i) >= newStr.charAt(i+1)){
		      sorted = false;
		      break;
		    }
		}
		
		
		return sorted;
	}
		

}

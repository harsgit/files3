package lab3_1;

import java.util.Scanner;

public class StringDemo {
	
	 String string;
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String string=sc.next();
		String string1=new String(string);
		String string2=string.concat(string1);
		
		System.out.println("String after concating with itsef :"+" "+string2);
		System.out.print("String after replacing # at odd positions :"+" ");
		for(int index=0;index<string2.length();index++)
		{
			char c=string2.charAt(index);
			if(index%2==0)
			{
			
				System.out.print("#");
			}
			else
			{
				System.out.print(c);
			}
		}
		System.out.println();
		System.out.print("String with odd positions as uppercase :");
		for(int index=0;index<string2.length();index++)
		{
			char c=string2.charAt(index);
			if(index%2==0)
			{
			
				System.out.print(Character.toUpperCase(c));
			}
			else
			{
				System.out.print(c);
			}
		}
		System.out.println();
		sc.close();
		String string3=removeDuplicates(string);
		System.out.println("String after removing duplicate variables :"+string3);
		
	}
	public static String removeDuplicates(String string) {
	    StringBuilder sb = new StringBuilder();
	    char[] arr = string.toCharArray();
	 
	    for (char ch : arr) {
	        if (sb.indexOf(String.valueOf(ch)) != -1)
	            continue;
	        else
	            sb.append(ch);
	        //System.out.println( "append method"+sb.append(ch));
	    }
	    return sb.toString();
	}

	
	}


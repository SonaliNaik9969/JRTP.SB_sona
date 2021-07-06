package logical_and_or;

import java.util.Scanner;

public class Leapyear_or_Ass {

	public static void main(String[] args) {
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year :");
		year=sc.nextInt();
		
		if((year%400==0) || ((year%4==0) && (year%100!=0)))
		{
			System.out.format("Leap Year");
		}
		else
		{
			System.out.format("NOT a Leap Year");
		}

	}

}

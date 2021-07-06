package basic;

import java.util.Scanner;

public class vaccination {

	public static void main(String[] args) {
		int age=0;
		System.out.println("Enter your age :");
		Scanner sc = new Scanner(System.in);
		age=sc.nextInt();
		
		if(age>45)
		{
			System.out.println("You are eligible for vaccination...");
		}
		else
		{
			System.out.println("You are not34 eligible for vaccination...");
		}
	}

}

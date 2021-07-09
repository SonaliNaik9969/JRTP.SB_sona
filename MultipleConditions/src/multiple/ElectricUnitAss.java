package multiple;

import java.util.Scanner;

public class ElectricUnitAss {

	public static void main(String[] args) {
		int unit;
		System.out.println("Enter your units: ");
		Scanner sc = new Scanner(System.in);
		unit=sc.nextInt();
		
		if(unit>0 && unit<=100)
		{
			System.out.println("You will charge per unit 3.44");
		}
		else if(unit>101 && unit<=300)
		{
			System.out.println("You will charge per unit 7.34");
		}
		else if(unit>301 && unit<=500)
		{
			System.out.println("You will charge per unit 10.36");
		}
		else if(unit>501 && unit<=1000)
		{
			System.out.println("You will charge per unit 11.82");
		}
		else
		{
			System.out.println("You will charge per unit 12.00");
		}
	}

}

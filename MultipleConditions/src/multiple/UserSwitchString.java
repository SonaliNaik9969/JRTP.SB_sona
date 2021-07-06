package multiple;

import java.util.Scanner;

public class UserSwitchString {

	public static void main(String[] args) {
		String colour_name;
		System.out.println("A. Black B. Pink C. Red D. Green");
		
		Scanner sc = new Scanner(System.in);
		colour_name=sc.next();
		
		switch (colour_name) 
		{
		case "a":
			System.out.println("I like black colour");
			break;

		case "b":
			System.out.println("I like pink colour");
			break;
			
		case "c":
			System.out.println("I like red colour");
			break;
			
		case "d":
			System.out.println("I like green colour");
			break;
			
		default:
			System.out.println("Invalid choice");
			break;
		}


	}

}

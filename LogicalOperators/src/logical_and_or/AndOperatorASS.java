package logical_and_or;

import java.util.Scanner;

public class AndOperatorASS {
	public static void main(String[] args) {
		
		String Username;
		String Password;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Username: ");
		Username=sc.next();
		
		System.out.println("Enter Password: ");
		Password=sc.next();
		
		if(Username=="Sonali" && Password=="sona123")
		{
			System.out.println("Successfully Login");
		}
		else
		{
			System.out.println("Access Denied");
		}
	}

}

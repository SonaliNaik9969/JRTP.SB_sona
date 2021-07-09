package basic;

import java.util.Scanner;

public class UserTable_DoWhile {

	public static void main(String[] args) {
		int k=0;
		System.out.println("Enter a number :");
		Scanner sc = new Scanner(System.in);
		k=sc.nextInt();
		
		int i=1;
		do
		{
			System.out.println(k*i);
			i=i+1;
		}
		while(i<=10);

	}

}

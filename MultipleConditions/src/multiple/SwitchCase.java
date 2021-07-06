package multiple;

public class SwitchCase {

	public static void main(String[] args) {
		int choice;
		System.out.println("1. Bus 2.Train 3.Taxi");
		
		
		choice=2;
		
		switch (choice) 
		{
		case 1:
			System.out.println(" Travelled by bus");
			break;

		case 2:
			System.out.println(" Travelled by train");
			break;
			
		case 3:
			System.out.println(" Travelled by taxi");
			break;
			
		default:
			System.out.println("Invalid choice");
			break;
		}
	}

}

package multiple;

public class ElseIf {

	public static void main(String[] args) {
		int marks=99;
		
		if(marks>90)
		{
			System.out.println("Passed with A grade!!");
		}
		else if(marks>75)
		{
			System.out.println("Passed with B grade!!");
		}
		else if(marks>60)
		{
			System.out.println("Passed with C grade!!");
		}
		else if(marks>40)
		{
			System.out.println("Passed!!");
		}
		else
		{
			System.out.println("Failed!!");
		}
	}

}

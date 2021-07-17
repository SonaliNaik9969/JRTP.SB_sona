package basic;

public class Calculator {
	
	
		public int addition(int a, int b)
		{
			return a+b;
		}
		
		public int subtraction(int a, int b)
		{
			return a-b;
		}

		public int division(int a, int b)
		{
			return a/b;
		}
		
		public int multiplication(int a, int b)
		{
			return a*b;
		}
		
		public int production(int n)
		{
			int product = 1;
			while (n != 0) 
			{
	            product = product * (n % 10);
	            n = n / 10;
	        }
			return product;
		}
	

}

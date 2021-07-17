package basic;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		int add = calc.addition(6,5);
		System.out.println("Addition of given numbers  : "+add);
		
		int sub = calc.subtraction(6,5);
		System.out.println("Subtraction of given numbers : "+sub);
		
		int div = calc.division(6,5);
		System.out.println("Division of given numbers : "+div);
		
		int mul = calc.multiplication(6,5);
		System.out.println("Multiplication of given numbers : "+mul);
		
		int prod = calc.production(4512);
		System.out.println("production of given number is : "+prod);

	}

}

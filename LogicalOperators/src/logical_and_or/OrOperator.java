package logical_and_or;

public class OrOperator {

	public static void main(String[] args) {
		String ch="a";
		
		if("a".equals(ch) || "e".equals(ch) || "i".equals(ch)
				|| "o".equals(ch) || "u".equals(ch))
		{
			System.out.println("Vowels");
		}
		else
		{
			System.out.println("Not Vowels");
		}
	}

}

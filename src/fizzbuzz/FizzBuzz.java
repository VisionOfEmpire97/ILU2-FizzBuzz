package fizzbuzz;

public class FizzBuzz {
	
	public static final String UN = "1";
	public static final String DEUX = "2";
	public static final String FIZZ = "fizz";
	public static final String BUZZ = "buzz";
	
	public String fizzBuzz(int input) {
		if (input == 3)
			return FIZZ;
		if (input == 5)
			return BUZZ;
		return Integer.toString(input);
	}
}

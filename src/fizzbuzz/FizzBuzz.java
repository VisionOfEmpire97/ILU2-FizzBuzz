package fizzbuzz;

public class FizzBuzz {

	private int[] nbSpeciaux = {3,5};
	private String[] valeursSpeciales = {"fizz","buzz"};
	
	public String fizzBuzz(int input) {
		for (int i = 0; i < nbSpeciaux.length ; i++) {
			if (input == nbSpeciaux[i])
				return valeursSpeciales[i];
		}
		return Integer.toString(input);
	}
}

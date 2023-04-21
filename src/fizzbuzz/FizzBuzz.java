package fizzbuzz;

public class FizzBuzz {

	private int[] nbSpeciaux = {3,5};
	private String[] valeursSpeciales = {"fizz","buzz"};
	
	public String fizzBuzz(int input) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < nbSpeciaux.length ; i++) {
			if (input % nbSpeciaux[i] == 0)
				sb.append(valeursSpeciales[i]);
		}
		if (sb.length() == 0)
			sb.append(Integer.toString(input));
		return sb.toString();
		}
}

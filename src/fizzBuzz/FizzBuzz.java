package fizzBuzz;

public class FizzBuzz {

	public static void main(String[] args) {
		for(Integer i=0; i<args.length; i++) {
			System.out.println(args[i] + ": " + score(Integer.parseInt(args[i])));
		}
	}
	
	public static String score(int numberIn) {
		String theScore = Integer.toString(numberIn);
		
		if((numberIn % 3 == 0) && (numberIn % 5 != 0)) {
			theScore = "fizz";
		}
		else if((numberIn % 5 == 0) && (numberIn % 3 != 0)) {
			theScore = "buzz";
		}
		else if((numberIn % 3 == 0) && (numberIn % 5 == 0)) {
			theScore = "fizz buzz";
		}
		
		return theScore;
	}
}
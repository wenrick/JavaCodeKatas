package fizzBuzz;

import java.util.regex.Pattern;
import java.util.ArrayList;

public class StringCalculator {
	
	public Integer Add(String numbers) {
		Integer numberSum  = 0;
		Integer endDelimiterIndex;
		String customDelimiter;
		String[] myNumbers;
		ArrayList<Integer> foundNegatives = new ArrayList<Integer>();
		
		if(numbers.length() > 0) {
			if(Pattern.matches("^//.+\\n.*", numbers)) {
				endDelimiterIndex = numbers.indexOf("\n");
				customDelimiter = numbers.substring(2,endDelimiterIndex);
				myNumbers = numbers.substring(endDelimiterIndex+1).split(customDelimiter);
			}
			else {
				myNumbers = numbers.split(",|\n");
			}
			for(Integer i = 0; i < myNumbers.length; i++) {
				Integer currentNumber = Integer.valueOf(myNumbers[i]);
				if(currentNumber < 0) {
					foundNegatives.add(currentNumber);
				}
				else {
					numberSum += Integer.valueOf(myNumbers[i]);
				}
			}
			if(foundNegatives.size() > 0) {
//				throw "negatives not allowed ";
			}
		}
		
		return numberSum;
	}

}

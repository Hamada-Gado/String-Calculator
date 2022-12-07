package main;

public class StringCalc {

	int Add(String string_numbers) {
		
		// "//[delimiter]\n[numbers…]"
		
		if(string_numbers.length() == 0) return 0;
		
		String delimiter = "" + string_numbers.charAt(2);
		
		String[] numbers_split = (string_numbers.split("\n"))[1].split(delimiter);
		
		int sum = 0;
		
		for(int i = 0; i < numbers_split.length; i++) {
			sum += Integer.parseInt(numbers_split[i]);
		}
		
		return sum;
	}

}
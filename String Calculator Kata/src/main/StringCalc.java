package main;

public class StringCalc {

	int Add(String string_numbers) {
		
		// "//[delimiter]\n[numbers…]"
		
		if(string_numbers.length() == 0) return 0;
		

		boolean change_delimiter = (string_numbers.length() > 2 && string_numbers.substring(0, 2).equals("//"));
		String[] numbers_split;		
		
		if(change_delimiter) {
			String delimiter = "" + string_numbers.charAt(2);
			numbers_split = (string_numbers.split("\n"))[1].split(delimiter);
		}
		else {
			numbers_split = string_numbers.split(",|\n");			
		}
		
		int sum = 0;
		
		for(int i = 0; i < numbers_split.length; i++) {
			sum += Integer.parseInt(numbers_split[i]);
		}
		
		return sum;
	}

}
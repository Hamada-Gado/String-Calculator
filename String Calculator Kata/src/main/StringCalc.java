package main;

public class StringCalc {

	int Add(String numbers) {
		if(numbers.length() == 0) return 0;
		
		String[] numbers_split = numbers.split(",");
		if(numbers_split.length == 1)
			return Integer.parseInt(numbers_split[0]);
		
		return Integer.parseInt(numbers_split[0]) + Integer.parseInt(numbers_split[1]);
	}

}
	
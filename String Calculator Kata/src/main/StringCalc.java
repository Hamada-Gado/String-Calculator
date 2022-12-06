package main;

public class StringCalc {

	int Add(String numbers) {
		if(numbers.length() == 0) return 0;
		
		String[] numbers_split = numbers.split(",|\n");
		
		int sum = 0;
		
		for(int i = 0; i < numbers_split.length; i++) {
			sum += Integer.parseInt(numbers_split[i]);
		}
		
		return sum;
	}

}
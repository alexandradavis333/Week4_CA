import java.util.Arrays;

public class Wk4CodingAssignment {

	public static void main(String[] args) {
		// Create array of ages
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 2};
		int subFirstFromLast = (ages[0] - ages[ages.length - 1]);
		System.out.println("Subtracting first age from last: ");
		System.out.println(subFirstFromLast);
		
		// Finding the Average Age
		int sum = 0;
		for(int age: ages) {
			sum += age;
		}
		System.out.println("Average age: ");
		System.out.println(sum/ages.length);
		
		// Creating array of names
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		// Average number of letters per name
		int stringSum = 0;
		String namesconcat = "";
		for(String name:names) {
			stringSum += name.length();
			namesconcat += name + " ";
		}
		System.out.println("Average number of letters per name: ");
		System.out.println(stringSum/names.length);
		
		// Concat each name
		System.out.println("Concatenating the names seperated by a space: ");
		System.out.println(namesconcat);
		
		// Access the last element in an Array
		System.out.println("Accessing the last element in an array: ");
		System.out.println(names[names.length - 1]);
		
		// Access the first element in an Array
		System.out.println("Accessing the first element in an array: ");
		System.out.println(ages[0]);
		
		// Adding length of each name to a new Array
		int[] nameLengths = new int[names.length]; 
		for(int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		System.out.println("Array of each name length: ");
		System.out.println(Arrays.toString(nameLengths));
		
		// Sum of values in nameLengths array
		int valueSum = 0;
		for(int j = 0; j < nameLengths.length; j++) {
			valueSum += nameLengths[j];
		}
		System.out.println("Sum of each value in nameLengths Array: ");
		System.out.println(valueSum);
		
		// Testing method of concatenating words x amount of times
		System.out.println("Print out Hi 5 times: ");
		System.out.println(concatWord("Hi", 5));
		
		// Testing fullName method
		System.out.println("Printing out full name: ");
		System.out.println(fullName("Bob", "Ross"));
		
		// Testing sumGreaterThan100 method
		int[] test1 = {5, 8, 9, 56};
		int[] test2 = new int[70];
		for(int g = 1; g < 70; g++) {
			int f = g;
			test2[g] = f;
		}
		System.out.println("Testing sumGreaterThan100 method: ");
		System.out.println(sumGreaterThan100(test1));
		System.out.println(sumGreaterThan100(test2));
		
		// Testing double average method
		double[] doubleArray = {56.25, 85.1, 96.4, 2.3, 71.6, 1.06, 0.4};
		System.out.println("Testing array of doubles average method: ");
		System.out.println(doubleAverage(doubleArray));
		
		// Testing the double array average comparison method
		double[] test3 = {5.2, 96.4, 4.11, 65.2, 88.2, 1009.4};
		double[] test4 = {1.0, 2.05, 7.66, 8.2, 4.6};
		System.out.println("Testing the double averages comparison method: ");
		System.out.println(compareAverages(doubleArray, test3));
		System.out.println(compareAverages(doubleArray, test4));
	
		// Testing the willBuyDrink Method
		System.out.println("Testing the willBuyDrink method: ");
		System.out.println("False test: " + willBuyDrink(false, 15.6));
		System.out.println("True test: " + willBuyDrink(true, 12.40));
		
		// Testing my currency conversion method
		System.out.println("Currency Conversion: ");
		System.out.println("I have 34.88 US Dollars which converts to " + currencyConverter("Yen", 34.88) + " Yen");
	}
	
	// Method that concats a string x amount of times
	static String concatWord(String word, int n) {
		String words = "";
		for(int k = 0; k < n; k++) {
			words += word;
		}
			return words;
		}
	
	// Method that takes two strings and returns the full name
	static String fullName(String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		return fullName;
	}
	
	// Method that adds an array of ints and returns true if the sum is greater than 100
	static boolean sumGreaterThan100(int[] numbers) {
		int sum = 0;
		for(int number:numbers) {
			sum += number;
		}
		if(sum > 100) {
			return true;
		} else {
			return false;
		}
	}
	
	// Method that takes an array of doubles and returns the average
	static double doubleAverage(double[] numbers) {
		double sum = 0.0;
		for(double number:numbers) {
			sum += number; 
		}
		return sum/numbers.length;
	}
	
	// Method that takes 2 arrays of doubles and returns true if the average of the elements
	//	in the first array are greater than the average of the second
	static boolean compareAverages(double[] array1, double[] array2) {
		double sum1 = 0.0;
		double avg1 = 0.0;
		double sum2 = 0.0;
		double avg2 = 0.0;
		for(double value:array1) {
			sum1 += value;
		}
		avg1 = sum1/array1.length;
		
		for(double val:array2) {
			sum2 += val;
		}
		avg2 = sum2/array2.length;
		
		return avg1 > avg2;
	}
	
	// Will buy drink method
	static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if(isHotOutside == true && moneyInPocket > 10.50) {
			return true;
		} else {
			return false;
		}
	}
	
	// Method of my own: 
	// This method will be a currency converter! It will ask for user input as to which kind of currency they would like to 
	// convert to and US dollar amount. For time and sanity, I only included 5 currencies: 
	// the Euro, Yen, pesos, Canadian dollar, and Bitcoin just for fun 
	
	static double currencyConverter(String newCurrency, double amount) {
		double conversionFactor = 0.0;
		switch (newCurrency) {
		case "Euro" : conversionFactor = 0.9255;
		break;
		case "Yen" : conversionFactor = 137.992;
		break;
		case "Peso" : conversionFactor = 17.792;
		break;
		case "Canadian Dollar" : conversionFactor = 1.3499;
		break;
		case "Bitcoin" : conversionFactor = 0.00004;
		}
		
		return amount * conversionFactor;
		
	}

}

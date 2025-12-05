public class Functions {

public static double sum(double[] numbers) {
	double sum = 0.0;
	for(double number : numbers) {
		sum += number;
	}
	return sum;
}

public static double average(double number, int frequency) {
	return number / frequency;
}

public static double maximum(double[] numbers) {
	double largest = numbers[0];
	for(double number : numbers){
		if(number > largest) largest = number;}
	return largest;
}


public static double minimum(double[] numbers) {
	double smallest = numbers[0];
	for(double number : numbers){
		if(number < smallest) smallest = number;}
	return smallest;
}

public static double[] descending(double[] numbers) {
	for(int i = 0; i < numbers.length -1; i++) {
		for(int j = 0; j < numbers.length - i - 1; j++) {
			if(numbers[j] < numbers[j + 1]) {
				double temp = numbers[j];
				numbers[j] = numbers[j+1];
				numbers[j+1] = temp;
			}
		}
	}
	return numbers;
}

public static int index(double[] numbers,double element) {
	for(int count = 0; count < numbers.length; count++) {
		if(numbers[count] == element) {
			int answer = count;
			return answer;}
		}
	return 0;
	
}
			

public static int[] positions(double[] original, double[] sorted) {
	int[] ratings = new int[original.length];
	for(int count = 0; count < original.length; count++) {
		ratings[count] = Functions.index(original,sorted[count]) + 1;
		
	}
	return ratings;
}
		

}
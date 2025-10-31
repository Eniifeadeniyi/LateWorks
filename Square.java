import java.util.Arrays;
public class Square {

public static void main(String[] args) {

boolean[] result = perfectSquare(new int[] {2,4,49,100});
System.out.print(Arrays.toString(result));
}


public static boolean[] perfectSquare(int[] numbers) {
	boolean[] output = new boolean[numbers.length];
	int count = 0;
	while(count < numbers.length) {
	for(int number : numbers) {
		double answer = Math.pow(number,0.5);
		if(number % 2 == 0 && answer % 2 == 0) {
			output[count] = true;}	
		if(number % 2 != 0 && answer % 2 != 0) {
			output[count] = true;}		
		if(number % 2 != 0 && answer % 2 == 0) {
			output[count] = false;}	
		if(number % 2 == 0 && answer % 2 != 0) {
			output[count] = false;}	
		}
	count++;
	}
	return output;
}
}

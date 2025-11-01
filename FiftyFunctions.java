public class FiftyFunctions{
//1
public static String greetingChooser(String name) {
	if(name.equalsIgnoreCase("Alex")) return "Hello, friend!";
	else return "Hi, stranger!";
}

//2 
public static String petChooser(String pet) {
	if(pet.equalsIgnoreCase("Dog")) return "Woof! Dogs are awesome!";
	else return "Cool choice, but I love dogs!";
}

//3
public static String favouriteNumber(int number) {
	int favouriteNumber = 7;
	if(number == favouriteNumber) return "That's my favourite number!";
	else return "Nice try, guess again!";
}

//4
public static void countingToFive() {
	int count = 1;
	while(count < 6) {
		System.out.println("Number: " + count);
		count++;}
}


//5
public static String evenOrOdd(int number) {
	if(number % 2 == 0) return "Even!";
	else return "Odd!";
}

//6
public static void multiplesOfThree() {
	int count = 3;
	while(count < 16) {
		System.out.print("\"" + count + "\",");
		count += 3;
	}
}

//7
public static String passwordChecker(String userTrial) {
	String password = "secret123.";
	if(userTrial.equals(password)) return "Access granted! Welcome!";
	else return "Access denied!";
}

//8
public static void countingDown() {
	int count = 10;
	while(count > 0) {
		System.out.print("\"" + count + "\",");
		count -= 1;
	}
}

//9
public static String trafficLight(String colour) {
	if(colour.equalsIgnoreCase("red")) return "Stop!";
	if(colour.equalsIgnoreCase("yellow")) return "Wait!";
	if(colour.equalsIgnoreCase("green")) return "Go!";
	return null;
}

//10
public static int squareNumbers(int number) {
	return number * number;
}

//11
public static String positiveOrNegative(int number){
	if(number > 0) return "Positive!";
	else return "Negative or zero!";
}

//12
public static void loopingStars() {
	for(int count = 0; count < 5; count++) {
		System.out.println("*");}
}

//13
public static String ageRestriction(int age) {
	int minimumAge = 10;
	if(age >= minimumAge) return "Welcome to the show!";
	else return "Sorry, you're too young!";
}

//14
public static void sumOfNumbers() {
	int sum = 0;
	for(int count = 1; count < 11; count++) {
		sum += count;}
	System.out.print("The sum is " + sum);
}

//15
public static String guessTheAnimal(String animal) {
	String myAnimal = "dog";
	if(animal.equalsIgnoreCase(myAnimal)) return "Correct! It's a dog!";
	else return "Nope, it's a dog!";
}

//16
public static void countingByTwos() {
	for(int count = 2; count < 11; count += 2) {
		System.out.print("\"" + count + "\",");}
}

//17
public static String temperatureCheck(int temperature) {
	if(temperature > 30) return "Hot!";
	if(temperature <= 30 & temperature >= 15) return "Nice!";
	else return "Cold!";
}

//18
public static void printYourName(String name) {
	for(int count = 0; count < 3; count++) {
		System.out.println("\"" + name + "\"!");}
}

//19
public static String magicNumber(int guess) {
	int magicNumber = 42;
	if(guess == magicNumber) return "You found the magic number!";
	else return "Keep looking!";
}

//20
public static void countingUp() {
	for(int count = 1; count < 8; count++) {
		System.out.print("\"" + count + ",\"");}
}

//21
public static String numberGuessingGame(int guess) {
	int secret = 8;
	if(guess != secret) return "Try again!";
	else return "Correct!";
}

//22
public static void multiplicationTable() {
	for(int multiplier = 1; multiplier < 11; multiplier++) {
		System.out.print("5 times " + multiplier + " is " + 5 * multiplier);}
}

//23
public static String gradeCalculator(int score) {
	if(score >= 90) return "A";
	if(score >= 80 & score <= 89) return "B";
	if(score >= 70 & score <= 79) return "C";
	else return "D";
}

//24
public static void nestedEvenChecker() {
	int[] numbers = {1,2,3,4,5,6,7,8,9,10};
	for(int number : numbers) {
		if(number % 2 == 0) System.out.print("\"" + number + ",\"");
	}
}

//25
public static String passwordRetry(String trial, int count) {
	String correctPassword = "python.";
	if(count < 3 & correctPassword.equalsIgnoreCase(trial)) return "Success!";
	if(!correctPassword.equalsIgnoreCase(trial)){
		if(count < 3)return "Try again!";
		if(count == 3) return "Locked out!";}
	return null;
}

//26
public static void starTriangle() {
	for(int row = 1; row <= 5; row++) {
		for(int column = 1; column <= row; column++) {
			System.out.print("*");}
	System.out.println();
	}
}

//27
public static void divisibleByThreeAndFive() {
	for(int count = 1; count < 21; count++) {
		if(count % 3 == 0) System.out.println(count);}
}

//28
public static int simpleCalculator(int number1, int number2, String operation) {
	if(operation.equals("-")) return Math.max(number1,number2) - Math.min(number1,number2);
	if(operation.equals("+")) return number1 + number2;
	else return 0;
}

//29
public static int countingVowels(String word){
	int count = 0;
	String[] vowels = {"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};
	for(String letter : vowels){
		if(word.contains(letter)) count += 1;
	}

	return count;
}

//30
public static void nestedLoopSquare() {
	for(int row = 1; row <= 4; row++) {
		for(int column = 0; column <= 4; column++) {
			System.out.print("*");}
	System.out.println();
	}
}

//31
public static String ageAndHeightCheck(int age, double height) {
	if(age >= 12 & height >= 140) return "Ride allowed!";
	if(age < 12) return "Too young!";
	else return "Too short!";
} 

//32
public static int sumOfEvens() {
	int sum = 0;
	for(int count = 1; count < 21; count++) {
		if(count % 2 == 0) sum += count;
	}
	return sum;
}

//33
public static String guessWithHints(int guess, int answer) {
		if(guess == answer) return "Correct!";
		if(guess > answer) return "Too high!";
		else return "Too low!";
}

//34
public static void numberPattern() {
	for(int count = 1; count <= 3; count++) {
		for(int counter = 1; counter <= count; counter++){
			System.out.print(counter);}
	System.out.println();}
}

//35
public static String ticketPrice(int age) {
	if(age >= 18) return "$10";
	else return "$5";
}

//36
public static int factorCounter(int number) {
	int sum = 0;
	for(int divisor = 1; divisor <= number; divisor++) {
		if(number % divisor == 0) sum += 1;
	}
	return sum;
}
 
//37
public static void nestedColourChooser(String colour) {
	if(!colour.equalsIgnoreCase("red")) System.out.print("I like red better!");
	 else {	
	for(int count = 1; count < 4; count++) {
		 System.out.print("Red is awesome!");}
	}	
}

//38
public static void multiplesInRange(int maximum, int minimum) {
	for(int multiple = minimum; multiple <= maximum; multiple++) {
		if(multiple % 4 == 0) System.out.print(multiple + ",");
	}
}

//39
public static 

}
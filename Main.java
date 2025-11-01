import java.util.Scanner;
public class Main {

public static void main(String[] args) {
Scanner input = new Scanner(System.in);
/*
//1
System.out.print("What's your name?: ");
String userName = input.nextLine();
System.out.println(FiftyFunctions.greetingChooser(userName));

//2
System.out.print("Enter pet: ");
String pet = input.next();
System.out.println(FiftyFunctions.petChooser(pet));

//3
System.out.print("Guess a number: ");
int number = input.nextInt();
System.out.println(FiftyFunctions.favouriteNumber(number));

//4
FiftyFunctions.countingToFive();

//5
System.out.print("Enter a number: ");
int digit = input.nextInt();
System.out.println(FiftyFunctions.evenOrOdd(digit));

//6
FiftyFunctions.multiplesOfThree();

input.nextLine();
System.out.println();

//7
System.out.print("Enter password: ");
String userTrial = input.nextLine();
System.out.println(FiftyFunctions.passwordChecker(userTrial));

//8
FiftyFunctions.countingDown();

System.out.println();
//9
System.out.print("Enter traffic light colour: ");
String colour = input.next();
System.out.println(FiftyFunctions.trafficLight(colour));

//10
System.out.print("Enter a number: ");
int num =  input.nextInt();
System.out.println(num + " squared is " + FiftyFunctions.squareNumbers(num));

//26
FiftyFunctions.starTriangle();

//28
System.out.print("Enter a number: ");
int number1 = input.nextInt();
System.out.print("Enter a number: ");
int number2 = input.nextInt();
System.out.print("Enter an operation(- or +): ");
String operation = input.next();
System.out.println(FiftyFunctions.simpleCalculator(number1,number2,operation));

input.nextLine();

//29
System.out.print("Enter a word: ");
String word = input.next();
System.out.println(FiftyFunctions.countingVowels(word));
*/

//30
FiftyFunctions.nestedLoopSquare();

//31
System.out.print("Enter age: ");
int age = input.nextInt();
System.out.print("Enter height: ");
double height = input.nextDouble();
System.out.println(FiftyFunctions.ageAndHeightCheck(age,height));

//32
System.out.println("Sum of evens: " + FiftyFunctions.sumOfEvens());

//33
System.out.print("Enter a number: ");
int numberGuess = input.nextInt();
int answer = 25;
while(numberGuess != answer) {
System.out.println(FiftyFunctions.guessWithHints(numberGuess, answer));
System.out.print("Enter a number: ");
numberGuess = input.nextInt();
}
System.out.println(FiftyFunctions.guessWithHints(numberGuess, answer));


//34
FiftyFunctions.numberPattern();

//35
System.out.print("Enter age: ");
int userAge = input.nextInt();
System.out.println(FiftyFunctions.ticketPrice(userAge));

//36
System.out.print("Enter a number: ");
int numberr = input.nextInt();
System.out.println("Factors: " + FiftyFunctions.factorCounter(numberr));

//37
System.out.print("Enter a colour: ");
String color = input.next();
FiftyFunctions.nestedColourChooser(color);

System.out.println();

//38
System.out.print("Enter a number to represent minimum: ");
int min = input.nextInt();
System.out.print("Enter a number to represent maximum: ");
int max = input.nextInt();
FiftyFunctions.multiplesInRange(max, min);

System.out.println();

//41
FiftyFunctions.nestedNumberChecker();

}
}
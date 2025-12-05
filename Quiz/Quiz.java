import java.util.ArrayList;
import java.util.Scanner;
public class Quiz {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);


String[] answers = {"A", "C", "B", "C", "B", "C", "A", "B", "C", "D"};

String[] questions = {"Who was swallowed by a large fish?", "What is the first book of the New Testament?", "Who had a dream about a giant statue made of gold, silver, bronze, iron, and clay?", "Which disciple denied Jesus three times?", "What did God create on the first day?", "Who killed Goliath?", "Which disciple betrayed Jesus for thirty pieces of silver?", "Where is the shortest verse in the Bible found?", "Who led the Israelites out of Egypt?", "What kind of fruit did Adam and Eve eat in Eden?"};

String[] options = {"A. Jonah | B. Moses | C. Peter | D. Elijah", "A. Luke | B. Mark | C. Matthew | D. John", "A. Solomon | B. Nebuchadnezzar | C. Pharaoh | D. Ahab", "A. Andrew | B. John | C. Peter | D. James", "A. Animals | B. Light | C. Plants | D. Stars", "A. Saul | B. Samson | C. David | D. Jonathan", "A. Judas Iscariot | B. Thomas | C. Matthew | D. Philip", "A. Psalm 103:119 | B. John 11:35 | C. John 1:1 | D. Exodus 14:14", "A. Abraham | B. Joseph | C. Moses | D. Joshua", "A. Apple | B. Grapes | C. Banana | D. Bible didn’t say"};

System.out.print("Enter your name: ");
String name = input.nextLine();
System.out.println("Welcome, " + name);
System.out.println("There are 10 questions in total!");
System.out.println("Goodluck, and remember to have fun!");

ArrayList<Integer> numbers = new ArrayList<Integer>();
for(int count = 0; count < 10; count++) {
	numbers.add(count);
}

String[] validAnswers = {"a","b","c","d"};

int score = 0;
while(numbers.size() != 0) {
	System.out.println(numbers);
	System.out.print("Please, enter a number from numbers above: ");
	int choice = input.nextInt();
	int index = numbers.indexOf(choice);
	if(numbers.contains(choice)) {
	numbers.remove(index);
	System.out.println(Functions.getQuestion(questions, choice));
	System.out.println(Functions.getOptions(options, choice));
	System.out.print("Enter answer: ");
	String answer = input.next();
	for(String letter : validAnswers) {
		if(answer.toLowerCase().equals(letter)) {
			System.out.println(Functions.compareAnswer(answers,answer,choice));
			score = Functions.increaseScore(answers,answer,choice,score);}
	}
	}
}

System.out.print( name + " ,you scored " + Functions.finalScore(score) + " over 10");

}
}


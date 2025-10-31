public class Functions {



public static String getQuestion(String[] questions, int choice) {
	return questions[choice];
}

public static String getOptions(String[] options, int choice) {
	return options[choice];
}


public static String compareAnswer(String[] answers, String answer, int choice) {
	if(answer.equalsIgnoreCase(answers[choice]))
		return "Correct!";
	
	return"Oops!!!";
	
}

public static int increaseScore(String[] answers, String answer,int choice, int score) {
	if(answer.equalsIgnoreCase(answers[choice])) score += 1;
	return score;
}

public static int finalScore(int score) {
	return score;
}

}


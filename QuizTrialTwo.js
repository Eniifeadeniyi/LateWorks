let answers = ["A", "C", "B", "C", "B", "C", "A", "B", "C", "D"]

let questions = ["Who was swallowed by a large fish?", "What is the first book of the New Testament?", "Who had a dream about a giant statue made of gold, silver, bronze, iron, and clay?", "Which disciple denied Jesus three times?", "What did God create on the first day?", "Who killed Goliath?", "Which disciple betrayed Jesus for thirty pieces of silver?", "Where is the shortest verse in the Bible found?", "Who led the Israelites out of Egypt?", "What kind of fruit did Adam and Eve eat in Eden?"]

let options = ["A. Jonah | B. Moses | C. Peter | D. Elijah", "A. Luke | B. Mark | C. Matthew | D. John", "A. Solomon | B. Nebuchadnezzar | C. Pharaoh | D. Ahab", "A. Andrew | B. John | C. Peter | D. James", "A. Animals | B. Light | C. Plants | D. Stars", "A. Saul | B. Samson | C. David | D. Jonathan", "A. Judas Iscariot | B. Thomas | C. Matthew | D. Philip", "A. Psalm 103:119 | B. John 11:35 | C. John 1:1 | D. Exodus 14:14", "A. Abraham | B. Joseph | C. Moses | D. Joshua", "A. Apple | B. Grapes | C. Banana | D. Bible didn’t say"]

function get_question(choice) {
	return questions[choice];
}

function get_options(choice) {
	return options[choice];
}

function compare_answer(answer,choice) {
	if(answer.toUpperCase() == answers[choice])
		return "Correct!";
	else {
		return"Oops!!!";
	}
}

function increase_score(answer,choice,score) {
	if(answer.toUpperCase() == answers[choice]) score += 1
	return score;
}

function final_score(score) {
	return score;
}


let prompt = require('prompt-sync')();

let name = prompt('Enter your name: ');
console.log("Welcome, " + name);
console.log("There are 10 questions in total!")
console.log("Goodluck, and remember to have fun!")

let score = 0;
let numbers = [0,1,2,3,4,5,6,7,8,9];
let valid_answers = ["a","b","c","d","A","B","C","D"]
while(numbers.length != 0) {
	console.log(numbers);
	let choice = prompt("Enter a number from numbers above: ");
	if(numbers.includes(Number(choice))) {
		let temp = numbers.at(-1);
		let index = numbers.indexOf(Number(choice))
		numbers[numbers.length-1] = numbers[index]
		numbers[index] = temp
		numbers.pop();
		console.log(get_question(Number(choice)));
		console.log(get_options(Number(choice)));
		let answer = prompt("Enter an answer: ");
		if(valid_answers.includes(answer)) {
			console.log(compare_answer(answer,Number(choice)));
			score = increase_score(answer,Number(choice),score);
		}
		else {
			console.log("Next time, enter an option from above!");}
	}
		
	else {
		console.log("Please, enter an available number!");
	
	}

}

console.log(name + "You scored " + final_score(score) + " over 10")

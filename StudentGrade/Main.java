import java.util.Scanner;
import java.util.Arrays;
public class Main {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);





		
System.out.print("Enter number of students: ");
while(!input.hasNextInt()) {
	System.out.println("Invalid input!");
	input.nextLine();
	System.out.print("Enter number of students: ");}
int numberOfStudents = input.nextInt();

input.nextLine();

System.out.print("Enter number of subjects: ");
while(!input.hasNextInt()) {
	System.out.println("Invalid input!");
	input.nextLine();
	System.out.print("Enter number of subjects: ");}
int numberOfSubjects = input.nextInt();

double[][] record = new double[numberOfStudents][numberOfSubjects];

if(numberOfStudents > 0 & numberOfSubjects > 0) {
	for(int count = 0; count < numberOfStudents; count++) {
		for(int counter = 0; counter < numberOfSubjects; counter++) {
			System.out.printf("Enter score for student %d for subject %d: ", count + 1, counter + 1);
			while(!input.hasNextDouble()) {
				System.out.print("Invalid input!");
				input.nextLine();
				System.out.printf("Enter score for student %d for subject %d: ", count + 1, counter + 1);}
			double score = input.nextDouble();
			record[count][counter] = score;
		}
}
System.out.printf("STUDENT \t");

for(int counter = 1; counter <= numberOfSubjects; counter++) {
		System.out.printf("SUB %d \t", counter);}
System.out.printf("TOTAL \t");
System.out.printf("AVE \t");
System.out.printf("POS \t");
System.out.println();

double[] totals = new double[numberOfStudents];
double[] totals1 = new double[numberOfStudents];

for(int c = 0; c < numberOfStudents; c++){
	double total = Functions.sum(record[c]);
	totals[c] = total;
	totals1[c] = total;}
	Functions.descending(totals);
for(int count = 0; count < numberOfStudents; count++) {
	System.out.printf("%d \t\t",count+1);
	for(int counter = 0; counter < numberOfSubjects; counter++) {
		
		System.out.printf("%.2f \t",record[count][counter]);
		
	}
	double total = Functions.sum(record[count]);
	double mean = Functions.average(total,numberOfSubjects);
	System.out.printf("%.2f \t", total);
	System.out.printf("%.2f \t", mean);
	System.out.printf("%d \t", Functions.positions(totals1,totals)[count]);
	System.out.println();
}
}
for(int count = 0; count < numberOfStudents; count ++) {
System.out.println(Arrays.toString(record[count 2]));}
System.out.println("SUBJECT SUMMARY");
for(int count = 0; count < numberOfSubjects; count++) {
	System.out.printf("Subject %d %n", count + 1);

	//System.out.printf("Highest scoring student is: Student %d scoring %.2f", );
}


}
}
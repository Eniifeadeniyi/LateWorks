import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

HashMap<Integer, ArrayList> transaction = new HashMap<>();
ArrayList<String[]> receipt = new ArrayList<String[]>();
ArrayList<String[]> invoice = new ArrayList<String[]>();

double sum = 0.0;
int count = 1;

System.out.print("Enter product name or type 'done' to finish: ");
String choice = input.nextLine();

while(!choice.equalsIgnoreCase("done")) {
System.out.print("Enter price for " + choice + ": ");
if(input.hasNextDouble() && !choice.trim().isEmpty()) {
	double price = input.nextDouble();
	if(price > 0) {
	String value = String.valueOf(price);
	sum += price;
	invoice.add(Functions.makeInvoice(choice,value));
	receipt.add(Functions.makeReceipt(choice,value));
	transaction.put(count, receipt);
	System.out.println("Purchase successful!");}
	else 
		System.out.println("Invalid input!");}
else
	System.out.println("Invalid input!");

input.nextLine();
System.out.print("Enter product name or type 'done' to finish: ");
choice = input.nextLine();
count++;
}

System.out.println("-----INVOICE-----");
for(String[] array : invoice) {
	System.out.printf("%s : %s %n",array[0],array[1]);}
System.out.printf("%s : %.2f \n","Subtotal",sum);
System.out.printf("%s : %.2f \n","VAT(7.5%)",vat);
System.out.printf("%s : %.2f \n","Total Amount",total);}


}
}

package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int number_of_customers = scan.nextInt();
		
		for (int i = 0; i < number_of_customers; i++) {
			String first_name = scan.next();
			String last_name = scan.next();
			double total = 0;
			int number_of_items = scan.nextInt();
			for (int j = 0; j < number_of_items; j++) {
				int item_quantity = scan.nextInt();
				String item_name = scan.next();
				double item_price = scan.nextDouble();
				total = total + (item_quantity * item_price);
			}
			
			String string_total = String.format("%.2f", total);
			char first_initial = first_name.charAt(0);
			
			System.out.println(first_initial + ". " + last_name + ": " + string_total);
		}
		
		
		
		
		
		
		
		
		
	} 
}

package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int number_of_items = scan.nextInt();
		
		String[] store_items = new String[number_of_items];
		
		double[] item_prices = new double[number_of_items];
		
		for (int i = 0; i < number_of_items; i++) {
			store_items[i] = scan.next();
			item_prices[i] = scan.nextDouble();
		}
		
		int number_of_customers = scan.nextInt();
		
		String[] first_names = new String[number_of_customers];
		
		String[] last_names = new String[number_of_customers];
		
		double[] totals = new double[number_of_customers];
		
		double max = 0;
		
		double min = 0;
		
		double average = 0;
		
		String max_fn = "";
		
		String max_ln = "";
		
		String min_fn = "";
		
		String min_ln = "";
		
		for (int k = 0; k < number_of_customers; k++) {
			first_names[k] = scan.next();
			last_names[k] = scan.next();
			totals[k] = 0;
			int number_of_customer_items = scan.nextInt();
			for (int j = 0; j < number_of_customer_items; j++) {
				int item_quantity = scan.nextInt();
				String item_name = scan.next();
				for (int m = 0; m < store_items.length; m++) {
					if (store_items[m].equals(item_name)) {
						totals[k] = totals[k] + (item_quantity * item_prices[m]);
					}
				}
			}
			if (totals[k] > max) {
				max = totals[k];
				max_fn = first_names[k];
				max_ln = last_names[k];
			}
			if (k == 0) {
				min = totals[k];
				min_fn = first_names[k];
				min_ln = last_names[k];
			} else if (totals[k] < min){
				min = totals[k];
				min_fn = first_names[k];
				min_ln = last_names[k];
			}
		}
		
		for (int i = 0; i < totals.length; i++) {
			average = average + totals[i];
		}
		
		average = average / totals.length;
		
		String string_min = String.format("%.2f", min);
		String string_max = String.format("%.2f", max);
		String string_average = String.format("%.2f", average);
		
		System.out.println("Biggest: " + max_fn + " " + max_ln + " (" + string_max + ")");
		System.out.println("Smallest: " + min_fn + " " + min_ln + " (" + string_min + ")");
		System.out.println("Average: " + string_average);
	}
}

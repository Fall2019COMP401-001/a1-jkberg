package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int number_of_items = scan.nextInt();
		
		String[] store_items = new String[number_of_items];
		
		for (int i = 0; i < number_of_items; i++) {
			store_items[i] = scan.next(); // stores the item names in the array
			scan.nextDouble(); // this skips the prices
		}
		
		int number_of_customers = scan.nextInt();
		int[] number_of_each_item = new int[store_items.length]; 
		int[] number_of_customers_per_item = new int[number_of_items];
		
		for (int i = 0; i < number_of_customers; i++) {
			String fn = scan.next(); // first name
			String ln = scan.next(); // last name 
			int number_of_items_per_customer = scan.nextInt();
			int[] customers_item_quantity = new int[number_of_items];
			for (int j = 0; j < number_of_items_per_customer; j++) {
				int item_quantity = scan.nextInt();
				String item_name = scan.next();
				for (int k = 0; k < number_of_items; k++) {
					if (item_name.equals(store_items[k])) {
						customers_item_quantity[k]++;
					}
				}
			}
			
			for (int k = 0; k < number_of_items; k++) {
				if (customers_item_quantity[k] >= 1) {
					number_of_customers_per_item[k]++;
				}
			}
		}
		
		for(int m = 0; m < number_of_items; m++) {
			if (number_of_customers_per_item[m] == 0) {
				System.out.println("No customers bought " + store_items[m]);
			} else {
				System.out.println(number_of_customers_per_item[m] + " customers bought " + store_items[m]);
			}
		}
	}
}

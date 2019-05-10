package Shop;

import java.util.*;

public class Shop {
	Scanner input = new Scanner(System.in);
	public String name;
	public double price;
	
	public Shop(String name, double price) {
		while (price <= 0) {
			say("Sorry it can't be priceless");
			price = input.nextDouble();
		}
		this.name = name;
		this.price = price;
	}
	
	public int menu() {
		say("Menu:");
		say("1. New Item");
		say("2. Delete Item");
		say("3. Most expensive Item");
		say("4. Most cheap Item");
		say("5. Avarge Price");
                say("6. List all");
		say("7. Exit");
		
		return input.nextInt();
	}
	
	private static void say(String text) {
		System.out.println(text);
	}
}
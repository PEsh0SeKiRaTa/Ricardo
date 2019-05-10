package WindowedShop;

import java.util.*;
import javax.swing.*;

public class Index {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
        Scanner inputS = new Scanner(System.in);
        Calculate calc = new Calculate();
        
        String temp;
        int size = 0;
        final int min = 3;
        do {
            try {
                temp = read("How much items your shop has (min " +  min + ")");
                size = Integer.parseInt(temp);
            } catch (Exception e) {
                say("NaN");
                continue;
            }
            if(size < min) {
                say("Its too small");
            }
        } while (size < min);
        
        String name;
        double price = 0;
        int amount = 0;
	ArrayList<Shop> sladk = new ArrayList<>();
	for (int i = 0; i < size; i++) {
            name = read("Name for Item " + (i + 1) + ":");
            price = price("Price for Item " + (i + 1) + ":");
            amount = num("Items in stock for Item " + (i + 1) + ":");
            sladk.add(new Shop(name, price, amount));
	}
        
	int n, a;
	boolean brk = false;
	while (true) {
            n = sladk.get(0).menu();
            switch (n) {
		case 1:
                    name = read("Enter the name for the new Item");
                    price = price("Now enter its price");
                    amount = num("Finally how much are in stock");
                    sladk.add(new Shop(name, price, amount));
                    break;
                case 2:
                    if(sladk.size() < min) {
                        say("You can't delete anymore Items");
                        continue;
                    }
                    try {
                        temp = "Which item do you want to delete (0 to exit)\n";
                        
                        for (int i = 0; i < sladk.size(); i++) {
                            temp += ("Item " + (i + 1) + ": " + sladk.get(i).name + "#" + sladk.get(i).price + "\n");
                        }
                        temp = read(temp);
                        a = Integer.parseInt(temp);
                    } catch (Exception e) {
                        say("NaN");
                        break;
                    }
                    if(a == 0 || a > sladk.size()) {
                        break;
                    }
                    sladk.remove(a - 1);
                    break;
                case 3:
                    try {
                        temp = "Which item do you want to edit (0 to exit)\n";
                        for (int i = 0; i < sladk.size(); i++) {
                            temp += ("Item " + (i + 1) + ": " + sladk.get(i).name + "#" + sladk.get(i).price + "\n");
                        }
                        temp = read(temp);
                        a = Integer.parseInt(temp);
                    } catch (Exception e) {
                        say("NaN");
                        break;
                    }
                    if(a == 0 || a > sladk.size()) {
                        break;
                    }
                    temp = read("What do you want to edit\n1. Name\n2. Price\n5. Amount\n4. Both");
                    n = Integer.parseInt(temp);
                    switch(n) {
                        case 1:
                            name = read("Enter the new name");
                            sladk.set(a - 1, new Shop(name, sladk.get(a - 1).price, sladk.get(a - 1).amount));
                            break;
                        case 2:
                            price = price("Enter the new price");
                            //sladk.set(a - 1, new Shop(sladk.get(a - 1).name, price));
                            break;
                        case 3:
                        case 4:
                            name = read("Enter the new name");
                            price = price("Now the new price");
                            //sladk.set(a - 1, new Shop(name, price));
                            break;
                        default:
                            say("Invalid option");
                    }
                    break;
                case 4:
                    Shop item = calc.most(sladk);
                    say("Most expensive item is " + item.name + "#" + item.price);
                    break;
                case 5:
                    Shop item2 = calc.least(sladk);
                    say("Least priced item is " + item2.name + "#" + item2.price);
                    break;
                case 6:
                    say("Avarge price is " + calc.avg(sladk));
                    break;
                case 7:
                    temp = "";
                    for (int i = 0; i < sladk.size(); i++) {
                        temp += ("Item " + (i + 1) + ": " + sladk.get(i).name + "#" + sladk.get(i).price + "\n");
                    }
                    say(temp);
                    break;
                case 8:
                    brk = true;
                    break;
                default:
                    say("Invalid choice");
            }
            
            if(brk == true) {
                say("Goodbye");
                System.exit(0);
            }
        }
    }
    
    private static int num (String text) {
        String temp;
        int num = 0;
        do {
            try {
                temp = read(text);
                num = Integer.parseInt(temp);
            } catch (Exception e) {
                say("Not a number");
                continue;
            }
            if (num < 0) {
                say("Can't be less than 0");
            }
        } while (num < 0);
        return num;
    }
    
    private static double price(String text) {
        String temp;
        double price = 0;
        do {
            try { 
                temp = read(text);
                price = Double.parseDouble(temp);
            } catch (Exception  e) {
                say("Price must be a number");
                continue;
            }
            if (price <= 0) {
                say("Can't be priceless");
            }
        } while (price <= 0);
        return price;
    }
    
    private static String read(String text) {
        return JOptionPane.showInputDialog(null, text);
    }
	
    private static void say(String text) {
	JOptionPane.showMessageDialog(null, text);
    }
}
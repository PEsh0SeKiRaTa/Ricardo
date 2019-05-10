package WindowedShop;

import java.util.*;
import javax.swing.JOptionPane;

public class Shop {
    Scanner input = new Scanner(System.in);
    public String name;
    public double price;
    public int amount;

    public void setName(String name) {
        while (name == null) {
            name = read("Can't be empty");
        }
        this.name = name;
    }

    public void setPrice(double price) {
        while (price <= 0) {
            price = price("Can't be priceless");
        }
        this.price = price;
    }

    public void setStock(int stock) {
        while (stock < 0) {
            stock = num("Can't be less than 0");
        }
        this.amount = stock;
    }
    
    
	
    public Shop(String name, double price, int amount) {
	this.name = name;
	this.price = price;
        this.amount = amount;
    }
    
    public int menu() {
        String menu = "Menu:"
            + "\n1. New Item"
            + "\n2. Delete Item"
            + "\n3. Edit Item"
            + "\n4. Most expensive Item"
            + "\n5. Most cheap Item"
            + "\n6. Avarge Price"
            + "\n7. List all"
            + "\n8. Exit";
        boolean flag;
        int n = 0;
        do {
            flag = false;
            try {
                String temp = read(menu);
                n = Integer.parseInt(temp);
            } catch (Exception e) {
                say("NaN");
                flag = true;
            }
        } while (flag);
	return n;
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
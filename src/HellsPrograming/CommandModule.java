package HellsPrograming;

import javax.swing.JOptionPane;

public class CommandModule extends Rules{
    public static void say(String text) {
        JOptionPane.showMessageDialog(null, text);
    }
    
    public static String read(String text) {
        return JOptionPane.showInputDialog(null, text);
    }
    
    public static int num (String text) {
        String temp;
        int num = 0;
        do {
            try {
                temp = read(text);
                num = Integer.parseInt(temp);
                if (num < 0) say("Can't be less than 0");
            } catch (Exception e) {
                say("Not a number");
            }
        } while (num < 0);
        return num;
    }
    
    public static double price(String text) {
        String temp;
        double price = 0;
        do {
            try { 
                temp = read(text);
                price = Double.parseDouble(temp);
                if (price <= 0) say("Can't be priceless");
            } catch (Exception  e) {
                say("Price must be a number");
            }
        } while (price <= 0);
        return price;
    }
}
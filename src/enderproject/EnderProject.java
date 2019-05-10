package enderproject;

import java.util.Scanner;

public class EnderProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n;
        do {
            System.out.println("How much item does your shop have");
            n = input.nextInt();
            if(n < 1){
                System.out.println("Can't be less than 1");
            }
        } while (n < 1);
        

        
        Item[] item = new Item[n];
        for (int i = 0; i < item.length; i++) {
            System.out.println("Enter the name of the item and its price");
            item[i] = new Item(input.next(), input.nextDouble());
        }
        
        int i;
        do {
            System.out.println("1. Place on sale");
            System.out.println("2. Expencify");
            System.out.println("3. Show items");
            System.out.println("4. Exit");
            n = input.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Witch item do you want to change");
                    i = input.nextInt() - 1;
                    System.out.println("How much percent");
                    n = input.nextInt();
                    item[i].sale(n);
                    break;
                case 2:
                    System.out.println("Witch item do you want to change");
                    i = input.nextInt() - 1;
                    System.out.println("How much percent");
                    n = input.nextInt();
                    item[i].expence(n);
                    break;
                case 3:
                    for (i = 0; i < item.length; i++) {
                        System.out.println("Item" + (i + 1) + ": " + item[i].name + "#" + item[i].price);
                    }
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    return;
            }
        } while (true);
    }
}
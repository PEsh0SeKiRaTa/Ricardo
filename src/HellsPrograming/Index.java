package HellsPrograming;

import java.util.ArrayList;
import java.util.Scanner;

public class Index extends CommandModule {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scanstr = new Scanner(System.in);
        //LOGIN MENU

        Scanner kb = new Scanner(System.in);
        Scanner kbs = new Scanner(System.in);
        System.out.println("For User register select 1");
        System.out.println("For User login select 2");
        System.out.println("For Admin login select 3");
        User P1= new User();
        String check = null;
        int fc = kb.nextInt();
        switch (fc) {

            case 1 :


                System.out.println("Enter your Username;");
                P1.use=kbs.nextLine();
                while (P1.use==null) {
                    System.out.println("Write your fkin username u cunt");
                    P1.use=kbs.nextLine();
                }

                System.out.println("Enter your Nickname");
                P1.nick=kbs.nextLine();
                while(P1.nick==null) {
                    System.out.println("Write your fking nickname u cunt");
                    P1.nick=kbs.nextLine();
                }

                System.out.println("Enter your password");
                P1.pass=kbs.nextLine();
                while(P1.pass==null) {
                    System.out.println("Enter you fking password u cunt");
                    P1.pass=kbs.nextLine();
                }

                System.out.println("ReEnter your password");
                check = kbs.nextLine();

                while(check==null) {

                    System.out.println("You stupid - enter the fking pass again u cunt");
                    check=kbs.nextLine();

                }while(P1.pass!=check);

                System.out.println("You didn't write and rewrote the pass.");

                System.out.println("Enter your password");
                P1.pass=kbs.nextLine();

                System.out.println("ReEnter your password");
                check = kbs.nextLine();
                break;
            case 2:
                do {System.out.println("Enter your username here.");
                    P1.use=kbs.nextLine();
                    System.out.println("Enter your password here.");
                    P1.pass=kbs.nextLine();
                }while(P1.use==null||P1.pass==null);
                break;
            case 3:
                        do

        }
    }

        
        
        
        
        
        
        
        
        ArrayList Items = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Items.add(new Item("a", 1, 1));
        }
    }
}
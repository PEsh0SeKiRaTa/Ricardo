package HellsPrograming;

import java.util.ArrayList;

public class Index extends CommandModule {

    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        ArrayList<Item> items = new ArrayList<>();
        User user = null;

        boolean flag = true;
        while (flag) {
            int fc = num("For User registration select 1"
                    + "\nFor User login select 2"
                    + "\nFor Admin login select 3");
            switch (fc) {

                case 1:
                    String username = read("Enter your username");
                    String nickname = read("Enter your nickname");
                    String password = read("Enter your password");
                    String check = read("Re enter your password");
                    if (check.equals(password)) {
                        if (users.isEmpty()) {
                            users.add(new User(username, nickname, password, true));
                            say("Created as admin account, can't be deleted");
                            int size = num("how much items do you have in the shop?");
                            items = new ArrayList<>();
                            for (int i = 0; i < size; i++) {
                                items.add(new Item(read("Enter item number " + i), price("Enter price for the item"), num("And how much is in stock?")));
                            }

                        } else {
                            users.add(new User(username, nickname, password, false));
                        }
                        say("Registration succsessfull");
                        flag = false;
                    } else {
                        say("Passwords did not match");
                    }
                    break;
                case 2:
                    if (users.isEmpty()) {
                        say("There are no users");
                        break;
                    }
                    username = read("Enter your nickname");
                    int index = 0;
                    boolean found = false;
                    for (int i = 0; i < users.size(); i++) {
                        User a = (User) users.get(i);
                        if (username.equals(a.getUser())) {
                            index = i;
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        say("No user found sorry :(");
                        break;
                    }

                    password = read("User found! Enter password");
                    if (users.get(index).checkPassword(password)) {
                        user = users.get(index);
                        say("Login succsessfull");
                        flag = false;
                    } else {
                        say("Login failed");
                    }
                    break;
            }
        }
        flag = true;
        while (flag) {
            int choice = num("Add item"
                    + "\n1. Delete item"
                    + "\n2. Edit item"
                    + "\n3. Log off");
            switch (choice) {
                case 1:
                    items.add(new Item(read("Enter name for new item", price("Enter price for new item"), num("How much items do we have ion store"))));
                    break;
                case 2:
                    
                    break;
                case 3:
                    user = null;
                    flag = false;
                    break;
                default:
                    say("Invalid choice");
            }
        }

    }
}

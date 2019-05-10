package Football;

import java.util.Scanner;

public class Football {
    private Scanner input = new Scanner(System.in);
    private String name;
    private int goals;
    private String team;
   
    public void setName() {
        this.name = input.nextLine();
    }
    public String getName() {
        return name;
    }

    public void setGoals() {
        Scanner in = new Scanner(System.in);
        do {
            this.goals = in.nextInt();
            if (this.goals < 0) {
                System.out.println("Can't be less than 0 enter again");
            }
        } while (this.goals < 0);
    }
    public void addGoal() {
        this.goals++;
    }
    public int getGoals() {
        return goals;
    }

    public void setTeam() {
        this.team = input.nextLine();
    }
    public String getTeam() {
        return team;
    }
}
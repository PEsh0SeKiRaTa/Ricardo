package Football;


import Football.Football;

public class Index {
    public static void main(String[] args) {
        Football player1 = new Football();
        Football player2 = new Football();
        
        System.out.println("Enter name, goals and team for player 1");
        player1.setName();
        player1.setGoals();
        player1.setTeam();
        
        System.out.println("Enter name goals and team for player 2");
        player2.setName();
        player2.setGoals();
        player2.setTeam();
        
        if (player1.getGoals() > player2.getGoals()) {
            System.out.println(player1.getName() + " from team " + player1.getTeam() + " has score of " + player1.getGoals());
        } else if (player1.getGoals() < player2.getGoals()) {
            System.out.println(player2.getName() + " from team " + player2.getTeam() + " has score of " + player2.getGoals());
        } else {
            System.out.println(player1.getName() + " and " + player2.getName() + " have the same score of " + player1.getGoals());
        }
    }
}
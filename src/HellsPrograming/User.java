package HellsPrograming;

public class User {
    private String user;
    private String nick;
    private String pass;
    private double balance;
    private boolean admin;
    
    public User (String user, String nick, String pass, boolean admin) {
        this.user = user;
        this.nick = nick;
        this.pass = pass;
        this.balance = 500;
        this.admin = admin;
    }
    
    public String getUser() {
        return user;
    }
    public String getNick() {
        return nick;
    }
    public double getBal() {
        return balance;
    }
    public boolean checkPassword(String password) {
        boolean check = ((pass.equals(password)));
        return check;
    }
    public boolean isAdmin() {
        return admin;
    }
    
    public void changeNick(String newNick) {
        this.nick = newNick;
    }
    public boolean buy(double money) {
        return money <= balance;
    }
    public void work(double money) {
        this.balance += money;
    }
}

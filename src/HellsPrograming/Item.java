package HellsPrograming;

public class Item extends CommandModule {
    private String name;
    private double price;
    private int stocked;
    
    public Item (String name, double price, int stocked) {
        this.name = name;
        this.price = price;
        this.stocked = stocked;
    }
    
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getStocked() {
        return stocked;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setStocked(int stocked) {
        this.stocked = stocked;
    }
}
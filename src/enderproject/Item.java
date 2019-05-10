package enderproject;

public class Item {
    public String name;
    public double price;
    
    public Item (String newName, double newPrice) {
        name = newName;
        price = newPrice;
    }
    
    public void sale(int percent) {
        price = price - (percent / 100) * percent;
    }
    
    public void expence(int percent) {
        price = price - (price / 100) * percent;
    }
}
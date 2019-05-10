package Shop;

import java.util.*;

public class Calculate{
    public Shop most(ArrayList<Shop> items) {
        int size = items.size();

        Shop max = items.get(0);
        
        for (int i = 0; i < size; i++) {
            Shop item = items.get(i);
            if(item.price > max.price){
                max = item;
            }
        }
        return max;
    }
    
    public Shop least(ArrayList<Shop> items) {
        int size = items.size();
        
        Shop least = items.get(0);
        
        for (int i = 0; i < size; i++) {
            Shop item = items.get(i);
            if(item.price < least.price){
                least = item;
            }
        }
        return least;
    }
    
    public double avg(ArrayList<Shop> items) {
        int size = items.size();
        
        double avg = 0;
        for (int i = 0; i < size; i++) {
            avg += items.get(i).price;
        }
        return avg /= size;
    }
}

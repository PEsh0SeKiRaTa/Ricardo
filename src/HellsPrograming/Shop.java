package HellsPrograming;

import java.util.ArrayList;

public class Shop extends CommandModule {
    public Item min(ArrayList<Item> items) {
        Item minItem = items.get(0);
        for (Item item : items) {
            if (item.getPrice() < minItem.getPrice()) {
                minItem = item;
            }
        }
        return minItem;
    }
    
    public Item max(ArrayList<Item> items) {
        Item maxItem = items.get(0);
        for (Item item : items) {
            if (item.getPrice() < maxItem.getPrice()) {
                maxItem = item;
            }
        }
        return maxItem;
    }
    
    public ArrayList<Item> sort(ArrayList<Item> items, boolean sortSmall) {
        if (sortSmall) {
            for (int i = 0; i < items.size() - 1; i++) {
                for (int j = 0; i < items.size() - i - 1; i++) {
                    Item temp = items.get(j);
                    items.set(j, items.get(j + 1));
                    items.set(j + 1, temp);
                }
            }
        } else {
            for (int i = 0; i < items.size() - 1; i++) {
                for (int j = 0; i > items.size() - i - 1; i++) {
                    Item temp = items.get(j);
                    items.set(j, items.get(j + 1));
                    items.set(j + 1, temp);
                }
            }
        }
        return items;
    }
}
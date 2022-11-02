
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ansh Singh
 */
public class Suitcase {
    private ArrayList<Item> items;
    private int maxweight;
    
    public Suitcase(int maxweight) {
        this.maxweight = maxweight;
        this.items = new ArrayList<Item>(); 
    }
    
    public void addItem(Item item) {
        if(this.totalWeight() + item.getWeight() <= maxweight) {
            this.items.add(item);
        }
    }
    
    public int totalWeight() {
       int weightSum = 0;
       for(Item entry : items) {
           weightSum += entry.getWeight();
       } 
       return weightSum;
    }
    
    public String toString() {
        if (items.size() == 0) {
            return "no items (" + this.totalWeight() + " kg)";
        } else if(items.size() > 1) {
            return items.size() + " items (" + this.totalWeight() + " kg)";
        } else {
            return items.size() + " item (" + this.totalWeight() + " kg)";
        }
    }
    
    public void printItems() {
        for(Item entry : items) {
            System.out.println(entry);
        }
    }
    
    public Item heaviestItem() {
        if(this.items.isEmpty()) {
            return null;
        }
        
        Item heaviestObject = this.items.get(0);
        
        for(Item entry : items) {
            if(heaviestObject.getWeight() < entry.getWeight()) {
                heaviestObject = entry;
            }
        }
        return heaviestObject;
    }
}

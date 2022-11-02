
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
public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<Suitcase>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if(suitcase.totalWeight() + this.totalWeight() <= this.maxWeight) {
            suitcases.add(suitcase);  
        }        
    }
    
    public String toString() {
        return this.suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
    }
    
    private int weightSum;
    private int totalWeight() {
        for(Suitcase entry : suitcases) {
            weightSum += entry.totalWeight();
        }
        return weightSum;
    }
    
    public void printItems() {
        for(Suitcase entry : suitcases) {
            System.out.println(entry);
        }
    }
 
}

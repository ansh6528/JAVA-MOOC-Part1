
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ansh.singh
 */
public class Container {
    
    private int maxAmount;
    private int currentAmount;
    
    public Container() {
        this.maxAmount = 100;
        this.currentAmount = 0;
    }
    
    public int contains() {
        return this.currentAmount;
    }
    
    public void add(int amount) {
        if(amount > 0) {
            this.currentAmount += amount;
            if(this.currentAmount > 100) {
                this.currentAmount = 100;
            }
        }
    }
    
    public void remove(int amount) {
        if(amount > 0) {
            this.maxAmount -= amount;
            if(this.maxAmount < 0) {
                this.maxAmount = 0;
            }
        }
    }
    
    public String toString() {
        return this.currentAmount + "/" + this.maxAmount;
    }
        
}

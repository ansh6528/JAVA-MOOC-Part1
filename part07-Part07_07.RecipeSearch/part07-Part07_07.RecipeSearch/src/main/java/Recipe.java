
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
public class Recipe {
    private String name;
    private int time;
    private ArrayList<String> ingredients;
    
    public Recipe(String name, int time, ArrayList<String> ingredients) {
        this.name = name;
        this.time = time;
        this.ingredients = ingredients;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setTime(int time) {
        this.time = time;
    }
    
    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }
    
    public String getName() {
        return this.name;
    }
}

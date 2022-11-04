
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ansh.singh
 */
public class JokeManager {
    
    private ArrayList<String> jokes;
    
    public JokeManager() {
        this.jokes = new ArrayList<>();
    }
    
    public void addJoke(String joke) {
        this.jokes.add(joke);
    }
    
    public String drawJoke() {
        if(jokes.isEmpty()) {
            System.out.println("Jokes are in short supply.");
        } else {
            Random random = new Random();
            int index = random.nextInt(jokes.size());
            System.out.println(jokes.get(index));
        }
    }
    
    public void printJokes() {
        for(String joke : jokes) {
            System.out.println(joke);
        }
    }
}

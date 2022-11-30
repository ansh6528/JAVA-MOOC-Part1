
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ansh.singh
 */
public class UserInterface {
    private Scanner scanner;
    private ArrayList<Recipe> recipeList = new ArrayList<>();
    
    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }
    
    public void start() {
        System.out.println("File to read: ");
        String fileName = scanner.nextLine();
        readFile(fileName);
        
        System.out.println("");
        
        System.out.println("Commands: \nlist - lists the recipes \nstop - stops the program"
                + "\nfind name - searches recipes by name \nfind cooking time - searches recipes by cooking time"
                + " \nfind ingredient - searches recipes by ingredient");
        System.out.println("");
        
        while (true) {
            System.out.println("Enter command: ");
            String command = scanner.nextLine();
            
            if (command.equalsIgnoreCase("stop")) {
                break;
            }
            
            if (command.equalsIgnoreCase("list")) {
                for(Recipe r : recipeList) {
                    System.out.println(r);
                }
            }
            
            if (command.equalsIgnoreCase("find name")) {
                System.out.println("Searched word: ");
                String findWord = scanner.nextLine();
                
                for (Recipe r : recipeList) {
                    if (r.getName().contains(findWord)) {
                        System.out.println(r);
                    }
                }
            }
            
            if (command.equalsIgnoreCase("find cooking time")) {
                System.out.println("Max cooking time: ");
                int maxTime = scanner.nextInt();
            }
        }
    }
    
    public void readFile(String fileName) {
        try (Scanner fileReader = new Scanner(Paths.get("recipes.txt"))) {
            while(fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                
                if (line.isEmpty()) {
                    continue;
                }
                
                String name = line;
                
                int time = Integer.valueOf(fileReader.nextLine());
                ArrayList <String> ingredientsList = new ArrayList();
                
                while (fileReader.hasNextLine()) {
                    String ingredient = fileReader.nextLine();
                    if (ingredient.isEmpty()) {
                        break;
                    }
                    ingredientsList.add(ingredient);
                }
                recipeList.add(new Recipe(name, time, ingredientsList));
            }
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
       
            
        
    }

}

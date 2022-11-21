
import static java.time.Clock.system;
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
    private Container firstContainer;
    private Container secondContainer;
    private Scanner scanner;
    
    public UserInterface(Container firstContainer, Container secondContainer, Scanner scanner) {
        this.firstContainer = firstContainer;
        this.secondContainer = secondContainer;
        this.scanner = scanner;
    }
    
    public void start() {
        while(true) {
            String input = scanner.nextLine();
            
            if(input.equalsIgnoreCase("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if(command.equalsIgnoreCase("add")) {
                this.firstContainer.add(amount);
            } else if (command.equalsIgnoreCase("move")) {
                if ((this.firstContainer.contains() - amount) >= 0) {
                    this.firstContainer.remove(amount);
                    this.secondContainer.add(amount);
                } else {
                    int bufferAmount = this.firstContainer.contains();
                    this.firstContainer.remove(this.firstContainer.contains());
                    this.secondContainer.add(bufferAmount);
                }
            } else if (command.equalsIgnoreCase("remove")) {
                this.secondContainer.remove(amount);
            }
        }
        
        System.out.println("First: " + firstContainer);
        System.out.println("Second: " + secondContainer);
    }
    
}

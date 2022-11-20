
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstContainer = 0;
        int secondContainer = 0;
        int maxAmount = 100;


        while (true) {

            String input = scan.nextLine();
            String part[] = input.split(" ");
            
            String command = part[0];
            int amount = Integer.valueOf(part[1]);
            
            if (input.equals("quit")) {
                break;
            }
            
            System.out.println("First: " + firstContainer + "/" + maxAmount);
            System.out.println("Second: " + secondContainer + "/" + maxAmount);
                
            if (command.equalsIgnoreCase("add") && amount >= 0) {
                if (firstContainer <= maxAmount ) {
                    firstContainer += amount;
                    
                    if (firstContainer > maxAmount) {
                        firstContainer = maxAmount;
                    }
                }
            } else if (command.equalsIgnoreCase("move") && amount >= 0) {
                if ((firstContainer - amount) >= 0) {
                    secondContainer += amount;
                    firstContainer -= amount; 
                    if (secondContainer > maxAmount) {
                        secondContainer = maxAmount;
                    }
                } else if ((firstContainer - amount) < 0) {
                    secondContainer =+ firstContainer;
                    firstContainer = 0;
                    if(secondContainer >= maxAmount) {
                        secondContainer = maxAmount;
                    }
                }
            } else if (command.equalsIgnoreCase("remove") && amount >= 0 ) {
                if ((secondContainer - amount) >= 0) {
                    secondContainer -= amount;
                } else if ((secondContainer - amount) < 0){
                    secondContainer = 0;
                }
            }

        }
        
    }

}

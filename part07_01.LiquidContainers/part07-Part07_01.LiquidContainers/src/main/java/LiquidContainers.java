
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstVolume = 0;
        int secondVolume = 0;
        int maxVolume = 0;


        while (true) {
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts;
            parts = input.split(" ");
            String command  = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            System.out.println("First: " + firstVolume + "/" + maxVolume);
            System.out.println("Second: " + secondVolume + "/" + maxVolume);
            
            if(command.equalsIgnoreCase("add") && amount >= 0) {
                if(firstVolume < maxVolume) {
                    firstVolume += amount;
                }
                if(firstVolume > maxVolume) {
                    firstVolume = maxVolume;
                }
            } else if(command.equalsIgnoreCase("move") && amount >= 0) {
                if(amount < firstVolume) {
                    firstVolume -= amount;
                    secondVolume += amount;
                }
                    secondVolume += firstVolume;
                    firstVolume = 0;
            } else if(command.equalsIgnoreCase("remove") && amount >= 0) {
                if(amount > secondVolume) {
                    secondVolume = 0;
                }
                secondVolume -= amount;
            }
            
        }
        System.out.println("First: " + firstVolume + "/" + maxVolume);
        System.out.println("Second: " + secondVolume + "/" + maxVolume);
    }

}

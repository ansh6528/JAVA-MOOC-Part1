
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ansh Singh
 */
public class UserInterface {
    private Scanner scanner;
    private GradeBook gradeBook;
    
    public UserInterface(Scanner scanner, GradeBook gradeBook) {
        this.gradeBook = gradeBook;
        this.scanner = scanner;
    }
    
    public void start() {
        readingPoints();
        printingAverage();
        passingPointsAverage();
        passPercentage();
    }
    
    public void readingPoints() {
        
        System.out.println("Enter points totals, -1 stops:");
        
        while(true) {
            String input = scanner.nextLine();
            int points = Integer.valueOf(input);
            
            if (points == -1) {
                break;
            }
            
            if (points > 0 && points < 100) {
                this.gradeBook.addPoints(points);
            }
            
        }
    } 
    
    public void printingAverage() {
        System.out.println("Point average (all): " + this.gradeBook.pointsAverage());
    }
    
    public void passingPointsAverage() {
        String empty = "-";
        if (gradeBook.passingAverage() == 0) {
            System.out.println("Point average (passing): " + empty);
        } else {
            System.out.println("Point average (passing): " + this.gradeBook.passingAverage());
        }
    }
    
    public void passPercentage() {
        System.out.println("Pass percentage: " + this.gradeBook.passingPercentage());
    }
        
        
}

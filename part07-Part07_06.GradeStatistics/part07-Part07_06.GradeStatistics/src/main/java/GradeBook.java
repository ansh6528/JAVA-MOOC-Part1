
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
public class GradeBook {
    private ArrayList<Integer> points;
    private ArrayList<Integer> passingPoints;
    
    public GradeBook() {
        this.points = new ArrayList<>();
        this.passingPoints = new ArrayList<>();
    }
    
    public void addPoints(int points) {
        this.points.add(points);
        
        if (points >= 50) {
            this.passingPoints.add(points);
        }
    } 
    
    public double pointsAverage() {
        int sum = 0;
        double avg = 0;
        
        if (points.isEmpty()) {
            return -1;
        } else {
            for (int x : points) {
                sum += x;
            }
        }
        avg = 1.0 * sum/points.size();
        return avg;
    } 
    
    public double passingAverage() {
        int sum = 0;
        double avg = 0;
        
        if (passingPoints.isEmpty()) {
            return 0.00;
        } else {
            for (int y : passingPoints) {
                sum += y;
            }
        }
        avg = 1.0 * sum/passingPoints.size();
        return avg; 
    }
    
    public double passingPercentage() {
        
        int participants = this.points.size();
        int passing = this.passingPoints.size();
        double passingRatio = 1.00 * passing/participants;
        
        if (participants == 0) {
            return -1;
        } else {
            return 100.00 * passingRatio;
        }
    }
}

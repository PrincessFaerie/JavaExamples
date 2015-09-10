/*
Created by: Adam Schlagenhauf
Date: 7/28/14
Virsion: 3.0
Perpose: CAlculate weekly wage
 */

package weekly.wage.calculator;
import java.util.*;
/**
 *
 * @author schlag
 */
public class WeeklyWageCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("What is your houerly wage in dollars?");
        double w = scan.nextDouble();
        System.out.println("How manny houers did you work?");
        double h = scan.nextDouble();
        double num1= ((w*1.5)*10)+(w*40);
        
        if (h<=40){
           double weekly = h*w;
           System.out.println("You earned: $"+weekly);
        }
        else if ((h>=41) && (h<=50)){
            double num2 = (h-40)*(w*1.5);
            double num3 = num2 + (w*40);
            System.out.println("You earned: $"+num3);
        }
        else
           System.out.println("You earned: $"+num1);
            
        }
        
        
    }
    

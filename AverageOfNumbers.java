/*
 Created by: Adam Schlagenhauf
 Date: 7/29/14
 Virsion: 2.0
 Perpose: Give the avrage of as many numbers as you like
 */

package avrage.of.pkg5.numbers.v2;
import java.util.*;
/**
 *
 * @author schlag
 */
public class AvrageOf5NumbersV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many numbers there are:");
        double run  = scan.nextInt();
        
        double v1=0;
        for (double i = 0; i<run; i++){
            System.out.println("Enter number:");
            double num1 = scan.nextDouble();
            v1 = v1 + num1;

        }
        
        System.out.println("The average is: "+v1/run);
        
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rootfinder;
import java.util.*;
/**
 *
 * @author 44496
 */
public class Rootfinder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        //grab A, B, and C
        System.out.println("Enter A:");
        double A = scan.nextInt();
        System.out.println("Enter B:");
        double B = scan.nextInt();
        System.out.println("Enter C:");
        double C = scan.nextInt();
        
        double first = ((B*-1)/(A*2));
        System.out.println(first);
        
        double second = (B*B)-(4*A*C);
        System.out.println(second);
        
        double third = (second/(A*2));
        System.out.println(third);
        
        double aws1 = (first-third);
        double aws2 = (first+third);
        
        System.out.println("X="+aws1+","+aws2);
    }
    
}

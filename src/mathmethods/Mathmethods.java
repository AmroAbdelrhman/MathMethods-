/*
 * Amro Abdelrhman
 * Math Methods
 * 20/02/2020
 */
package mathmethods;
import java.util.Scanner;
/**
 *
 * @author Amro
 */
public class Mathmethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("please enter your first number here");
        double num1 = input.nextDouble();
        System.out.println("please enter your second number here");
        double num2 = input.nextDouble();
        System.out.println(Math.pow(num1,num2));
    }
    
}
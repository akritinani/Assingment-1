/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gameintro;

/**
 *
 * @author avash
 */
import java.util.Random;
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static int guess, number, maxValue;
    public static Scanner scan;
    public static Random rand;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        rand = new Random();
        System.out.println("Please enter a max range :");
        maxValue = scan.nextInt();
        number = rand.nextInt(maxValue);
        System.out.println("Please enter guess:");
        while (guess != number) {
            guess = scan.nextInt();
            if (guess > number) {
                System.out.println("your guess is too high: ");
            }
            if (guess < number) {
                System.out.println("your guess is too low: ");
            }
        }
        System.out.println("You win");

        // TODO code application logic here
    }

}

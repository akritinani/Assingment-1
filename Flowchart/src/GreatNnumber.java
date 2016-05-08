/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowchart;

import java.util.Scanner;

/**
 *
 * @author avash
 */
public class GreatNnumber {

    public static void main(String[] args) {
        int max, num;
        System.out.println("Enter the number you want to compare:: ");
        Scanner sc = new Scanner(System.in);
        max = sc.nextInt();
        for (int i = 0; i < max; i++) {
            System.out.println("Enter the number you want to :");
            num = sc.nextInt();
            if (num > max) {
                System.out.println(num + " is greater than nth number");
            } else {
                System.out.println("is not");
            }
        }
    }

}

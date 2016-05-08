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
public class ThreeNumber {

    public static void main(String[] args) {
        System.out.println("Enter three numbers ::");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if (x > y) {
            System.out.println(x + "is greater");
        } else if (y > z) {
            System.out.println(y + "is greater");
        } else {
            System.out.println(z);
        }
    }
}

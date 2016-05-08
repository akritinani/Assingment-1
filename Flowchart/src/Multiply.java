
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author avash
 */
public class Multiply {
    
    public static void main(String[] args) {
        int i;
        System.out.println("Enter the number you want to see table : ");
        Scanner sc = new Scanner(System.in);
        i =sc.nextInt();
        for (int k = 0; k <= 10; k++) {
            int mul =i*k;
            System.out.printf("%d x %d = %d \n",i,k,mul);
        }
    }
}

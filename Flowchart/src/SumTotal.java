
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
public class SumTotal {
    public static void main(String[] args) {
        int sum=0;
        System.out.println("Enter the number you want to add upto :: ");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for (int i = 0; i < n; i++) {
            sum=sum+i;
        }
        System.out.println("total sum of the nth number is  " +sum);
    }
}

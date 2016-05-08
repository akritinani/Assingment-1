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
public class Flowchart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  int x;
  int y;
  System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
  x=sc.nextInt();
  y=sc.nextInt();
  if(x>y){
        System.out.println(x +"+ is greater");
    }
        else
 System.out.println(y+" is greater");
        
    
  
  
  
       
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounttransaction;
import java.util.*;
/**
 *
 * @author avash
 */
public class AccountTransaction {

    private static final String idA="A01";
    private static final String nameA="Akriti poudel";
    private static final String idB="B02";
    private static final String nameB="Avash poudel";
    
    private static double balanceA =10000;
    private static double balanceB=10000;
    public static void main(String[] args) {
        System.out.println("Enter Your Id to proceed Further : \n");
        Scanner sc = new Scanner(System.in);
        String stId =sc.nextLine();
        getValidation(stId);
    }
   public static void getValidation(String id){
       if (id.equalsIgnoreCase(idA)) {
           System.out.println("Hello " +nameA);
           System.out.println("Now Your Account Has Rs " +balanceA );
           getTransation(id);
       }
       else if (id.equalsIgnoreCase(idB)) {
           System.out.println("Hello " +nameB);
           System.out.println("Now Your Account Has Rs " +balanceB );
           getTransation(id);
       }
       else{
           System.out.println("Wrong ID");
       } 
   }
   public static void getTransation(String id){
       System.out.println("Enter The Trasaction You Want to Perform :");
       System.out.println("\n\n Press D for Deposit");
       System.out.println("\n Press W for Deposit");
    
       try {
           Scanner sc = new Scanner(System.in);
           String dataInput =sc.nextLine();
           if (dataInput.equalsIgnoreCase("D")) {
               System.out.println("Enter the ID You want to deposit : \n");
               sc= new Scanner(System.in);
               String idTo =sc.nextLine();
               System.out.println("Enter The money you want to transfer : \n");
               sc = new Scanner(System.in);
               int money=sc.nextInt();
               getDeposit(money,idTo);
           }
           else if (dataInput.equalsIgnoreCase("W")) {
               System.out.println("Enter The Money You want to Withdrawn : ");
               sc =new Scanner(System.in);
               double money = sc.nextDouble();
               if (id.equalsIgnoreCase(idA)) {
                   if (money>=balanceA) {
                       System.out.println("Sorry Paisa Thorai Voo");
                       System.exit(0);
                   }
                   else if (money>100000) {
                       System.out.println("Sorry You cant Withdraw More Than 1 lakh");
                   }
                   else{
                       balanceA=balanceA-money;
                       System.out.println("Rs : " +money +"Has been deducted fromm ur account");
                   }

               }
               
               else if (id.equalsIgnoreCase(idB)) {
                   if (money>=balanceB) {
                       System.out.println("Sorry Paisa Thorai Voo");
                       System.exit(0);
                   }
                   else if (money>100000) {
                       System.out.println("Sorry You cant Withdraw More Than 1 lakh");
                   }
                   else{
                       balanceB=balanceB-money;
                       System.out.println("Rs : " +money +"Has been deducted fromm ur account");
                   }
               }
               
           }
           

       } catch (Exception e) {
           System.out.println("Please Press valid Data \n");
           
       }
       finally{
           getTransation(id);
       }
       
       
   }
   public static void getDeposit(int money,String idTo){
       if (idTo.equals(idA)) {
           if (money>=balanceA) {
               System.out.println("Not Suficient FUnd"); 
           }
           else{
           balanceA =balanceA+money;
           balanceB=balanceB-money;
           System.out.println("Now Your Account Has Rs " +balanceA);
           }
       }
       else if(idTo.equals(idB)){
           if (money>=balanceA) {
               System.out.println("Not Suficient FUnd"); 
           }
           else{
                balanceB =balanceB+money;
                balanceA=balanceA-money;
                System.out.println("Now Your Account Has Rs " +balanceB );
                
           }
        }
   }
   
}


    
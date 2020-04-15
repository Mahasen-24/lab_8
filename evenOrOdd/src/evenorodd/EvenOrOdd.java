/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evenorodd;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class EvenOrOdd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int again=1;
        while(again==1)
        {
            Scanner myObj = new Scanner(System.in);
           System.out.println("Hello in my app :)");
           System.out.println("Enter the number :");
           int num=myObj.nextInt();
           if(num%2==0)
           {
               System.out.println("The number you entered is even ..");
           }
           else
           {
               System.out.println("The number you entered is odd ..");
           }
           System.out.println("Do you want to continue ?? Enter 1 to continue ,0 to stop");
           again=myObj.nextInt();
        }
    System.out.println("Thank you for using my app :)");
}
}

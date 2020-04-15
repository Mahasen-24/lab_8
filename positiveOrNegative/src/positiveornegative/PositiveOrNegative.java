/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package positiveornegative;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class PositiveOrNegative {

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
           if(num>=0)
           {
               System.out.println("The number you entered is positive ..");
           }
           else
           {
               System.out.println("The number you entered is negative ..");
           }
           System.out.println("Do you want to continue ?? Enter 1 to continue ,0 to stop");
           again=myObj.nextInt();
        }
    System.out.println("Thank you for using my app :)");
    }
    
}

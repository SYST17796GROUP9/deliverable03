/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.Scanner;

/**
 *
 * @author jinze
 */
public class betValidator {
    public static int bet;
    public static int accountBalance = 100;
    
    public static void main(String[] args){
         System.out.println("enter bet amount: ");
          Scanner sc = new Scanner(System.in);
           bet = sc.nextInt();
            if (checkBet(bet)==true){
                System.out.println("Your bet for this round is:" + bet);
            }else{
                System.out.println("You don't have enough stacks for bet");
            }
           
    }
    
    public static boolean checkBet(String bet){
        if(bet<=accountBalance){
            return true;
        }else{
            return false;
        }
    }
}

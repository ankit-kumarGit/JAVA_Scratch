/*
Counting Monetary Units
A program that changes a given amount of money into smaller monetary units.
THis program let the user enter an amount as a double value representing a
total in dollar and cents, and output a report listing the monetary equivalent in the maximum
number of dollars, quarters, dimes, nickles, and pennies, in this order, to result in the
minimum number of coins.
 */
import java.util.Scanner;
public class ComputeChange {
    public static void main(String[] args){
        // Create a Scanner object
        Scanner sc= new Scanner(System.in);

        // Receive the amount
        System.out.print("Enter an amount in double, for example 11.56: ");
        double amount= sc.nextDouble();
        int remainingAmount= (int)(amount*100);

        //Find the number of one dollar
        int numberOfOneDollar= remainingAmount/100;
        remainingAmount= remainingAmount%100;

        //FInd the number of quarters in the remaining amount
        int numberOfQuarters= remainingAmount/25;
        remainingAmount= remainingAmount%25;

        //Find the number of dimes in the remaining amount
        int numberOfDimes= remainingAmount/10;
        remainingAmount= remainingAmount%10;

        //Find the number of nickels in the remaining amount
        int numberOfNickels= remainingAmount/5;
        remainingAmount= remainingAmount%5;

        //Find the number of pennies in the remaining amount
        int numberOfPennies= remainingAmount;

        //Displaying result
        System.out.println("Your amount "+amount+" consists of");
        System.out.println("    "+numberOfOneDollar+" dollars");
        System.out.println("    "+numberOfQuarters+" quarters");
        System.out.println("    "+numberOfDimes+" dimes");
        System.out.println("    "+numberOfNickels+" nickels");
        System.out.println("    "+numberOfPennies+" pennies");
    }
}

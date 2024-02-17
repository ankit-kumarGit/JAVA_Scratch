/*
The lottery programs involve generating random numbers, comparing digits using Boolean operators.

The program randomly generates a lottery of two-digit number, prompts the user to enter two-digit number,
and declare whether the user wins according to the following rules:
 1. If the user input matches the lottery number in the exact order, the award is $10,000
 2. If all digits in the user input matches all digits in the lottery number, the award is $3,000
 3. If one digit in the user inout matches a digit in the lottery number, the award is $1,000

 Note that the digits of a two-digit number may be 0. If a number is less than 10, we assume the
 nuber is preceeded by a 0 to form a two-digit number. For example, number 8 is treated as 08 and
 0 is treated is 00 in the program.
 */
import java.util.Scanner;
public class Lottery {
    public static void main(String[]args) {
        int lottery, guess;
        int lotteryDigit1, lotteryDigit2;
        int guessDigit1, guessDigit2;
        //Generate a lottery number
        lottery=(int)(Math.random() * 100);

        //Prompt the user to enter a guess
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your lottery pick (two digits): ");
        guess= sc.nextInt();

        //Get digits from lottery
        lotteryDigit1= lottery/10;
        lotteryDigit2= lottery%10;

        //Get digits from guess
        guessDigit1= guess/10;
        guessDigit2= guess%10;

        System.out.println("The lottery number is "+lottery);

        //Check the guess
        if(guess == lottery)
            System.out.println("Exact match: you win $10,000");
        else if (guessDigit1 == guessDigit2 && guessDigit2 == guessDigit1)
            System.out.println("Match all digits: you win $3,000");
        else if(guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2)
            System.out.println("Match one digit: you win $1,000");
        else
            System.out.println("Sorry, no MATCH :(");
    }
}

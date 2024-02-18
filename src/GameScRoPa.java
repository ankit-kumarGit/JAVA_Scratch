/*
A program that plays the popular scissor-rock-paper game.
The program randomly generates a number 0,1 or 2 representing scissor, rock and paper.
The program prompt the user to enter a number 0,1 or 2 and display a message indicating whether
the user to enter or the computer wins, loses, or draws,
Sample output:
scissor(0), rock(1), paper(2) : 1
The computer is scissor. You are rock. You won

scissor(0), rock(1), paper(2) : 2
The computer is paper. You are paper too. It is a draw.
 */
import java.util.Scanner;
import java.lang.Math;
public class GameScRoPa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int randomNum;
        int inputUser;

        int min = 0, max = 3;
        //Generating random number 0,1 or 2
        randomNum = (int) (Math.random() * (max - min) + min);

        //Prompt the user to enter a number
        System.out.print("scissor(0), rock(1), paper(2) : ");
        inputUser = sc.nextInt();

        // If user Input number another than 0, 1 or 2...........

        if (inputUser != 0 && inputUser != 1 && inputUser != 2)
            System.out.println("PLEASE! Input CORRECT Number.");

        else {

            System.out.print("The computer is ");
            switch (randomNum) {
                case 0:
                    System.out.print("scissor.");
                    break;
                case 1:
                    System.out.print("rock.");
                    break;
                case 2:
                    System.out.print("paper");
            }
            System.out.print(" You are ");
            switch (inputUser) {
                case 0:
                    System.out.print("scissor");
                    break;
                case 1:
                    System.out.print("rock");
                    break;
                case 2:
                    System.out.print("paper");
            }

            // Display result
            if (randomNum == inputUser)
                System.out.println(" too. It is a DRAW :|");
            else {
                boolean win = (inputUser == 0 && randomNum == 2 || inputUser == 1 && randomNum == 0 || inputUser == 2 && randomNum == 1);
                if (win)
                    System.out.println(". You WON :)");
                else
                    System.out.println(". You LOSE :(");
            }

        }
    }
}

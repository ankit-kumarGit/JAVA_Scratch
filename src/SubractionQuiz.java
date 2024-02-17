/*
Program works as follows:
1. Generate two single digit integer into number1 and number 2 using (int)(Math.random()*10)
2. If number1 < number 2, swap number1 with number2
3. Prompt the user/student to answer, "What is number1 - number2?"
4. Check the user/student answer and Display whether the answer is correct or not.
 */
import java.util.Scanner;
import java.lang.Math;
public class SubractionQuiz {
    public static void main(String[]args) {
        Scanner sc= new Scanner(System.in);
        int number1, number2;
        int answer;
        // 1. Generate two random single digit integer
        number1= (int)(Math.random()*10);
        number2= (int)(Math.random()*10);
         // 2. If number1 < number2, swap number1 with number 2
        if(number1<number2) {
            int temp= number1;
            number1=number2;
            number2= temp;
        }

        // 3. Prompt the student to answer "What is number1 - number2?"
        System.out.print("What is "+number1+" - "+number2+" ? ");
        answer= sc.nextInt();

        // 4. Grade the answer and display the result
        if((number1-number2) == answer)
            System.out.println("You are correct!");
        else {
            System.out.println("Your answer is wrong!");
            System.out.println(number1+" - "+number2+" should be "+(number1-number2));
        }
    }
}

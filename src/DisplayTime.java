/*
Displaying integer seconds into Hours minutes and seconds format.
 */
import java.util.Scanner;
public class DisplayTime {
    public static void main(String [] args) {
        int sec;

        // Scanner object Declaration
        Scanner sc= new Scanner(System.in);
        // Prompt the user for input
        System.out.print("Enter an integer for seconds : ");
        sec= sc.nextInt();
        // Converting seconds into hours minutes and seconds format
        int h= sec/3600;
        int m = (sec%3600)/60;
        int s= sec%60;
        // Printing the result
        System.out.println(h+" hours "+m+" minutes and "+s+" seconds.");
    }
}

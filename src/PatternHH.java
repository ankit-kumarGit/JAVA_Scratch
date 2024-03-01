/*
Print pattern

1
2 4
3 5 7
6 8 10 12
9 11 13 15 17


 */

public class PatternHH {
    public static void main(String [] args){
        int oddnum=1;
        int evennum=2;


        for (int i=1; i<=5; i++) {
            for(int j=1; j<=i; j++) {

                if(i%2==1)
                {
                    System.out.print(oddnum+" ");
                    oddnum+=2;
                }
                else
                {
                    System.out.print(evennum + " ");
                    evennum += 2;
                }

            }
            System.out.println();
        }
    }
}

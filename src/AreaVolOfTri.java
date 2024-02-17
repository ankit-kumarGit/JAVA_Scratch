/*
Compute the volume of a triangle; Reads length of the sides of an equilateral triangle
and computes the area and volume using the formula:

area= (root3/4)* (length of side)^2
volume= area*length

 */
import java.util.Scanner;
import java.lang.Math;
public class AreaVolOfTri {
    public static void main(String[] args) {
        // Scanner object
        Scanner sc= new Scanner(System.in);
        double l;
        double area=0.0, volume= 0.0;
        System.out.print("Enter length of the sides of the Equilateral Triangle : ");
        l= sc.nextDouble();
        // Compute area
        area= (Math.sqrt(3)/4)*(Math.pow(l,2));
        volume= area*l;
        //Displaying
        System.out.println("The Area is "+area);
        System.out.println("The Volume of the Triangular Prism is "+volume);
    }
}

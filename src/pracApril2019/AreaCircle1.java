package pracApril2019;

import java.awt.geom.Area;
import java.util.Scanner;

public class AreaCircle1 {
    public static void main(String[]args){
        System.out.println("Enter the radius of the cirlce:");
        Scanner scan = new Scanner(System.in);
        double R= scan.nextDouble();
        int radius= 10;
        double AreaOfCircle=Math.PI *radius*radius;
        System.out.println(AreaOfCircle);

        double circumfuranceOfCirle= Math.PI*2*R;
        System.out.println(circumfuranceOfCirle);
    }
}

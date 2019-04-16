import java.util.Scanner;

public class AreaTriangle {

    public static void main(String[] args) {

        System.out.println("Enter the base:");
        Scanner scan = new Scanner(System.in);
        double B=scan.nextDouble();
        System.out.println("Enter the height:");
        double H= scan.nextDouble();

        double area = (B*H)/2;
        System.out.println("The area is:"+area);

    }
}

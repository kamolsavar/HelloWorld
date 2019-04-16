import java.util.Scanner;

public class AreaCircle {

    public static void main(String[] args) {

        System.out.println("Enter the radius of the circle:");
        Scanner scan = new Scanner(System.in);
        double R=scan.nextDouble();


        double area = Math.PI*R*R;
        System.out.println("The area is:"+area);

        double circumferance = Math.PI*R;
        System.out.println("The circumferance is :"+circumferance);

    }
}

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class SumOfNaturalNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first number:");
        int num1=scan.nextInt();
        System.out.println("Enter your second number:");
        int num2=scan.nextInt();
        System.out.println("Enter your Final number:");
        int num3=scan. nextInt();

        int sum= num1+ num2 + num3;
        System.out.println("The sum of the numbers is:"+sum);
    }
}

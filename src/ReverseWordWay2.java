import java.util.Scanner;

public class ReverseWordWay2 {

    public static void main(String[]args){

        System.out.println("Enter your word:");

        Scanner sc = new Scanner(System.in);
        String origianal = sc.nextLine();
        String reverse = "";
        int len=origianal.length();

        for(int i=len-1;i>=0; i--){
            reverse = reverse+ origianal.charAt(i);

        }

        System.out.print(reverse);
    }
}

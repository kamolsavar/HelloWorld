import java.util.Scanner;

public class IsPrimeNumber {

    public static void main(String[] args) {
        System.out.println("enter your number:");
        Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();

        boolean isPrime= true;

        for(int i=2; i<num; i++){
            if(num%i==0){
                isPrime=false;
                break;
            }
        }
        if (isPrime){
            System.out.println(num +"is a prime number");
        }
        else{
            System.out.println(num+"is not a prime number");
        }
    }
}

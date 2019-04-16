import java.util.Scanner;

public class SumofAllFactor {
    public static void main(String[] args) {
        System.out.println("Enter your number:");
        Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();
        int sum=0;

        for(int i=1; i<=num; i++){
            if(num%i==0){
                sum= sum+i;
            }
        }
        System.out.println(" The sum of the factors:"+sum);
    }
}

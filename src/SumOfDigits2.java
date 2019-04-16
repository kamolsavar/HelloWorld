public class SumOfDigits2 {


    public static void main(String[] args) {
        int num=1456;
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum=sum+rem;
            num=num/10;
        }

        System.out.println("The sum of all digits is:"+sum);
    }
}





public class ReverseNumber {

    public static void main(String[] args) {

            int num = 456;
            int num_rev = 0;
            int r;

            while (num != 0) {
                r = num % 10;
                num_rev = num_rev * 10 + r;
                num=num/10;
            }
            System.out.println("reverse number is:" + num_rev);



    }
}

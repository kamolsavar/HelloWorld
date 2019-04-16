import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class SumCountMethold {

    public static void main(String[] args) {

        int num, count, total=0;

        System.out.println("Enter your number for the natural number:");

        Scanner scan = new Scanner(System.in);
        num=scan.nextInt();
        scan.close();


        for(count=1; count<=num; count++){
            total= total + count;
        }
        System.out.println("The sum is:"+total);
    }
}

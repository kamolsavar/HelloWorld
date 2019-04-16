import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ip {

    public static void main(String[] args) {
        int num= 12345;
        int numRev=0;


        while (num!=0){
            int remainder= num%10;
            numRev=numRev *10+remainder;
            num/=10;

        }

        System.out.println(
                numRev
        );
    }
}

import org.omg.CORBA.SetOverrideType;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPaddress {

    public static void main(String[] args) throws UnknownHostException {
        InetAddress myIP=InetAddress.getLocalHost();

        System.out.println("My IP address is:"+myIP);
    }
}

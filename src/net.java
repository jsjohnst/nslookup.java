import java.applet.Applet; 
import java.util.ArrayList;
import java.net.*;
import java.io.*;
 
//The applet code
public class net extends Applet {
    public ArrayList<String> nslookup(String hostname) {
        try {
            ArrayList<String> result = new ArrayList<String>();

            InetAddress[] hosts = InetAddress.getAllByName(hostname);

            if(hosts.length < 1) return null;

            for(int i=0;i<hosts.length;i++) {
                result.add(hosts[i].getHostAddress());
            } 
            
            return result;
        } catch(UnknownHostException ex) {
            return null; 
        }
    }

    public static void main(String[] args) {
        System.out.println(new net().nslookup("www.tumblr.com"));
    }
}

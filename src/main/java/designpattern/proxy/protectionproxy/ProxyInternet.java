package designpattern.proxy.protectionproxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet  implements Internet{

    Internet internet = new RealInternet();
    private  static List<String> bannedSite ;

    static {
        bannedSite =new ArrayList<>();
        bannedSite.add("1");
        bannedSite.add("2");
        bannedSite.add("3");

    }

    @Override
    public void connectTo(String serverHost) throws Exception {
        System.out.println("Connecting to: "+serverHost);
        if (bannedSite.contains(serverHost.toLowerCase())){
            throw new Exception("Access Denied");
        }

        internet.connectTo(serverHost);
    }
}

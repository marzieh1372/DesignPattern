package designpattern.proxy.protectionproxy;

public class RealInternet implements Internet {
    @Override
    public void connectTo(String serverHost) throws Exception {
        System.out.println("Connecting To : "+serverHost);
    }
}

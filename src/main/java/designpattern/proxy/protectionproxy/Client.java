package designpattern.proxy.protectionproxy;

public class Client {

    public static void main(String[] args) {
        Internet internet = new ProxyInternet();
        try {
            internet.connectTo("test");
            internet.connectTo("5");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

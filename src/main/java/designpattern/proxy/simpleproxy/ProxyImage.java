package designpattern.proxy.simpleproxy;

public class ProxyImage  implements Image{

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        System.out.println("Display in proxy");
        if (realImage ==null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}

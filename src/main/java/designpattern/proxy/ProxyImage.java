package designpattern.proxy;

public class ProxyImage implements Image{

    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    ImageImpl image ;

    public void display() {

        if (image == null){
            image = new ImageImpl(fileName);
        }
        image.display();
    }

}

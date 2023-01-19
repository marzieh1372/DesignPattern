package designpattern.proxy.simpleproxy;

public class RealImage implements Image{

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisc(fileName);
    }

    public  void loadFromDisc(String fileName){
        System.out.println("FileName: "+fileName);
    }

    @Override
    public void display() {
        System.out.println("Display in real image class............");
    }


}

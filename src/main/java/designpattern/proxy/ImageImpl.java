package designpattern.proxy;

public class ImageImpl implements Image {

    private String fileName;

    public ImageImpl(String fileName) {
        this.fileName = fileName;
        loadFromDisc(fileName);
    }

    public  void loadFromDisc(String fileName){
        System.out.println("FileName: "+fileName);
    }

    public void display() {
        System.out.println("Display");
        //Show Image
    }
}

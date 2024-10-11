package designpattern.singleTon;

public class SingleTonCall {

  public static void testingSingleTon() {
    SingleTone singleTone = SingleTone.getInstance(); // to get the instance of the class
    singleTone.sumOfTow(5, 6); // to call the method of the class
  }

  public static void main(String[] args) {
    testingSingleTon();
  }
}

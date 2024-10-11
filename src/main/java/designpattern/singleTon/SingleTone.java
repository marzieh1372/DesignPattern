package designpattern.singleTon;

public final class SingleTone {

  // create an instance
  private static SingleTone instance = null;

  // private constructor
  private SingleTone() {
    System.out.println("This is a SingleTon Class");;
  }

  // To create only one instance of the class
  public static SingleTone getInstance() {
    if (instance == null) {
      instance = new SingleTone();
    }
    return instance;
  }

  public void sumOfTow(double a, double b) {
    System.out.println("Sum of " + a + " and " + b + " is: " + (a + b));
  }

}

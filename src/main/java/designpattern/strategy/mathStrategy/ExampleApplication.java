package designpattern.strategy.mathStrategy;

public class ExampleApplication {

  public static void main(String[] args) {
    Context context = new Context(new ConcreteStrategyAdd());
    System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

    Context context1 = new Context(new ConcreteStrategySubtract());
    System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

    Context context2 = new Context();
    int a=13;
    int b=10;
    Operation operation = Operation.MULTIPLY;

    if (operation == Operation.ADD) {
      context2.setStrategy(new ConcreteStrategyAdd());
    } else if (operation == Operation.SUBTRACT) {
      context2.setStrategy(new ConcreteStrategySubtract());
    } else if (operation == Operation.MULTIPLY) {
      context2.setStrategy(new ConcreteStrategyMultiply());
    }
    System.out.println("The result is: " + context2.executeStrategy(a, b));

  }
}

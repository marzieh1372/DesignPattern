package designpattern.abstractFactory;

public class ColorFactory extends AbstractFactory {

    Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equals("RED")) {
            return new RedColor();
        } if (color.equals("BLUE")) {
            return new BlueColor();
        }
        return null;
    }
}

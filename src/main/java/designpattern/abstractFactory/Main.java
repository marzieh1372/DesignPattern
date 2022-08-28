package designpattern.abstractFactory;

public class Main {

    public static void main(String[] args) {

        AbstractFactory vehicleFactory = FactoryProducer.getFactory("VEHICLE");

        VehicleFactory car = (VehicleFactory) vehicleFactory;
        car.createVehicle("Motor");
      /*  Vehicle motorCycle = vehicleFactory.getVehicle("MotorCycle");
        motorCycle.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        Color redColor = colorFactory.getColor("RED");
        redColor.fill();
        Color blueColor = colorFactory.getColor("BLUE");
        blueColor.fill();*/
    }
}

package designpattern.abstractFactory;

public class VehicleFactory extends AbstractFactory {

    public Vehicle createVehicle(String vehicleType){
        if(vehicleType == null){
            return null;
        } else if(vehicleType.equals("Car")){
            return new Car();
        } else if(vehicleType.equals("Motor")){
            return new Motor();
        }
        return null;
    }



}

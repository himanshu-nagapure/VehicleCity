import java.util.ArrayList;

import src.main.io.sevenx.vehiclecity.data.Bike;
import src.main.io.sevenx.vehiclecity.data.Car;
import src.main.io.sevenx.vehiclecity.data.Vehicle;
import src.main.io.sevenx.vehiclecity.ui.VehicleDisplay;

public class VehicleCityMain {
    public static void main(String arg[])
    {
        Vehicle car1= new Car();
        car1.setRegistrationNumber("MH21P2321").setNumberOfGears(5)
            .setModel("Audi").setMileage(18).setFuelCapacity(20)
            .setColor("Red").setPrice(47.5);

        Vehicle bike1= new Bike();
        bike1.setRegistrationNumber("MH20C5421").setNumberOfGears(4)
            .setModel("Kawasaki Ninja").setMileage(15).setFuelCapacity(17)
            .setColor("Green").setPrice(3.2);

        ArrayList <Vehicle> vehicles = new ArrayList<>();
        vehicles.add(bike1);
        vehicles.add(car1);

        VehicleDisplay.display(vehicles);
    }
}
package io.sevenx.vehiclecity;
import java.util.ArrayList;
import java.util.List;

import io.sevenx.vehiclecity.data.Bike;
import io.sevenx.vehiclecity.data.Car;
import io.sevenx.vehiclecity.data.Vehicle;
import io.sevenx.vehiclecity.ui.VehicleDisplay;

public class VehicleCityMain {
    public static void main(String arg[])
    {
        Car car1= new Car();
        car1.setHasAirConditioner(true).setHasMusicSystem(true)
            .setNumberOfSeats(4).setFuelCapacity(25)
            .setRegistrationNumber("MH21P2321").setNumberOfGears(5)
            .setModel("Audi").setMileage(18).setFuelCapacity(20)
            .setColor("Red").setPrice(47.5);      
            
        Bike bike1= new Bike();
        bike1.setBreakType("Disc").setHasCrashGuard(true)
            .setRegistrationNumber("MH20C5421").setNumberOfGears(4)
            .setModel("Kawasaki Ninja").setMileage(15).setFuelCapacity(17)
            .setColor("Green").setPrice(3.2);
            
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(bike1);
        vehicles.add(car1);

        VehicleDisplay.display(vehicles);
            
            /*((Car)car1).setHasMusicSystem(true);
            ((Car)car1).setHasAirConditioner(true);
            ((Car)car1).setNumberOfSeats(4);*/
    
            /* I won't be able to do this : 
            car1.setFuelCapacity(25).setHasAirConditioner(true).setHasMusicSystem(true).setNumberOfSeats(4);
            Vehicle car1 would be wrong too.
            */
    }
}

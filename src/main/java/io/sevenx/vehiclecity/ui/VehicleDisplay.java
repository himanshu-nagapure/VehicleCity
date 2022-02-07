package io.sevenx.vehiclecity.ui;
import java.util.List;
import io.sevenx.vehiclecity.data.Bike;
import io.sevenx.vehiclecity.data.Car;
import io.sevenx.vehiclecity.data.Vehicle;

public class VehicleDisplay {
    public static void display(List<Vehicle> vehicles) {
		for(Vehicle vehicle : vehicles) {
			if(vehicle instanceof Bike) {
				Bike bike = (Bike)vehicle;
                bike.getInfo();				
			} 
			else if (vehicle instanceof Car){
				Car car = (Car)vehicle;
                car.getInfo();
			}
			System.out.println("\n----------------------\n");
		}
	}
}

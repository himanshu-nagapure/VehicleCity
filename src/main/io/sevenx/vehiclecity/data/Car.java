package src.main.io.sevenx.vehiclecity.data;

public class Car extends Vehicle{
    // int numberOfSeats;
    // public Car setNumberOfSeats(int numberOfSeats){
    //     this.numberOfSeats = numberOfSeats;  
    //     return this;  
    // }
    public void getInfo()
    {
        System.out.println(getVehicleModel()+" - ₹ "+getPrice() + " Lakh");
        // System.out.println("Number of seats: "+numberOfSeats);
        super.getInfo();
    }
}

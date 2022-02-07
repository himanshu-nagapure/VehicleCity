package io.sevenx.vehiclecity.data;

public class Car extends Vehicle{
    int numberOfSeats;
    boolean hasMusicSystem;
    boolean hasAirConditioner;
    boolean hasRearCamera;

    public Car setHasMusicSystem(boolean hasMusicSystem) {
        this.hasMusicSystem = hasMusicSystem;
        return this;
    }
    public Car setHasRearCamera(boolean hasRearCamera) {
        this.hasRearCamera = hasRearCamera;
        return this;
    }
    
    public Car setHasAirConditioner(boolean hasAirConditioner) {
        this.hasAirConditioner = hasAirConditioner;
        return this;
    }
    
    public Car setNumberOfSeats(int numberOfSeats){
        this.numberOfSeats = numberOfSeats;   
        return this;
    }

    public void getInfo()
    {
        System.out.println(getVehicleModel()+" - Rs "+getPrice() + " Lakh");
        super.getInfo();
        System.out.println("Number of seats: "+numberOfSeats);
        System.out.println("Music System : "+ (hasMusicSystem ? "Yes" : "No"));
        System.out.println("Air Conditioner : "+(hasAirConditioner ? "Yes" : "No"));
        System.out.println("Rear Camera : "+ (hasRearCamera ? "Yes" : "No"));
    }
}

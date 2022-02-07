package io.sevenx.vehiclecity.data;

public class Bike extends Vehicle{
    
    public void getInfo()
    {
        System.out.println(getVehicleModel()+" : ₹ "+getPrice() + " Lakh");
        super.getInfo();
    }
}

package io.sevenx.vehiclecity.data;

public class Bike extends Vehicle{
    boolean hasCrashGuard;
    String breakType;

    public Bike setBreakType(String breakType) {
        this.breakType = breakType;
        return this;
    }

    public Bike setHasCrashGuard(boolean hasCrashGuard) {
        this.hasCrashGuard = hasCrashGuard;
        return this;
    }

    public void getInfo()
    {
        System.out.println(getVehicleModel()+" - Rs "+getPrice() + " Lakh");
        super.getInfo();
        System.out.println("Crash Guard Protection : "+ (hasCrashGuard ? "Yes" : "No"));
        System.out.println("Break Type : "+ breakType);
    }
}

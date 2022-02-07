package io.sevenx.vehiclecity.data;

public class Vehicle {

        private String registrationNumber = "";
        private String model = "";
        private double mileage = 0.0;
        private double price;
        private int fuelCapacity;
        private int numberOfGears;
        private String color="";
    
        public Vehicle(){}
        // public Vehicle(String registrationNumber, String model,double price, double mileage) {
        //     this.registrationNumber = registrationNumber;
        //     this.model = model;
        //     this.price = price;
        //     this.mileage = mileage;
        // }
        public String getVehicleModel()
        {
            return model;
        }
        public double getPrice(){
            return price;
        }
        public Vehicle setColor(String color){
            this.color = color;
            return this;
        }
        public Vehicle setModel(String model){
            this.model = model;  
            return this;  
        }
        public Vehicle setFuelCapacity(int fuelCapacity){
            this.fuelCapacity = fuelCapacity;  
            return this;  
        }public Vehicle setNumberOfGears(int numberOfGears){
            this.numberOfGears = numberOfGears;  
            return this;  
        }
        public Vehicle setRegistrationNumber(String registrationNumber){
            this.registrationNumber = registrationNumber;  
            return this;  
        }
        public Vehicle setPrice(double price){
            this.price = price;  
            return this;  
        }
        public Vehicle setMileage(double mileage){
            this.mileage = mileage;  
            return this;  
        }
        public void getInfo()
        {
            System.out.println("\tKey specs");
            System.out.println("Registration number: "+registrationNumber);
            System.out.println("Model : "+model);
            System.out.println("Mileage: "+mileage +" ");
            if(this.color != "")
                System.out.println("Colours Available: " + color);
            System.out.println("Fuel Capacity: "+fuelCapacity);
            System.out.println("Number of Gears: "+numberOfGears);
            System.out.println();
        }
    }


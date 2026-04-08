class Bike {
    
    String brand;
    String model;
    int year;
    String color;
    double price;
    boolean isElectric;
    int engineCC;           
    String fuelType;
    double mileage;
    String ownerName;

    // Static Variables
    static String country = "India";
    static String vehicleType = "Two Wheeler";

    // Methods
    public String startEngine(String mode) {
        System.out.println("Bike started using " + mode + " (Kick/Self)");
        return mode;
    }

    public String stopEngine(String reason) {
        System.out.println("Engine killed: " + reason);
        return reason;
    }

    public double accelerate(double speed) {
        System.out.println("Twisting throttle. Current speed: " + speed + " km/h");
        return speed;
    }

    public double applyBrakes(double pressure) {
        System.out.println("Brakes applied. Speed reduced.");
        return pressure;
    }

    public String blowHorn(String sound) {
        System.out.println("Horn sound: " + sound);
        return sound;
    }

    public boolean toggleHeadlight(boolean status) {
        System.out.println("High Beam Status: " + status);
        return status;
    }

    public double refuel(double amount) {
        System.out.println("Fuel Tank filled with: " + amount + " liters");
        return amount;
    }

    public int showOdometer(int km) {
        System.out.println("Total distance covered: " + km);
        return km;
    }

    public boolean engageSideStand(boolean status) {
        System.out.println("Side Stand engaged: " + status);
        return status;
    }

    public String setRideMode(String mode) {
        System.out.println("Ride mode switched to: " + mode);
        return mode;
    }
}
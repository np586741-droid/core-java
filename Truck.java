class Truck {
    String brand;
    String model;
    int year;
    String color;
    double price;
    boolean isElectric;
    double payloadCapacity;
    String fuelType;        
    double mileage;
    String ownerName;

    // Static Variables
    static String country = "India";
    static String vehicleType = "Heavy Commercial Vehicle";

    // Methods
    public String startEngine(String mode) {
        System.out.println("Heavy Duty Engine idling in " + mode + " mode");
        return mode;
    }

    public String stopEngine(String reason) {
        System.out.println("Engine cooling down. Shutdown: " + reason);
        return reason;
    }

    public double accelerate(double speed) {
        System.out.println("Maintaining torque. Speed: " + speed + " km/h");
        return speed;
    }

    public double applyAirBrakes(double pressure) {
        System.out.println("Air Brakes engaged. Pressure: " + pressure);
        return pressure;
    }

    public String useHorn(String type) {
        System.out.println("Air Horn Type: " + type);
        return type;
    }

    public boolean toggleCargoLights(boolean status) {
        System.out.println("Cargo Bay Lights: " + status);
        return status;
    }

    public double refuel(double amount) {
        System.out.println("Large Tank Refill: " + amount + " liters");
        return amount;
    }

    public int showOdometer(int km) {
        System.out.println("Fleet Distance: " + km);
        return km;
    }

    public boolean lockTrailer(boolean status) {
        System.out.println("Trailer Coupling Locked: " + status);
        return status;
    }

    public String setRoute(String destination) {
        System.out.println("Logistics Route set to: " + destination);
        return destination;
    }
}
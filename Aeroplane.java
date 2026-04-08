class Aeroplane {
    String brand;           
    String model;
    int year;
    String color;
    double price;
    boolean isElectric;     
    int passengerCount;  
    String fuelType;        
    double flightHours;     
    String ownerName;       

    // Static Variables
    static String country = "India";
    static String vehicleType = "Aircraft";

    // Methods
    public String startEngines(String mode) {
        System.out.println("Turbofans spooling up in " + mode + " mode");
        return mode;
    }

    public String stopEngines(String reason) {
        System.out.println("Engines shutdown at gate: " + reason);
        return reason;
    }

    public double setThrottle(double percentage) {
        System.out.println("Thrust set to: " + percentage + "%");
        return percentage;
    }

    public double deployFlaps(double angle) {
        System.out.println("Flaps set to: " + angle + " degrees");
        return angle;
    }

    public String communicateATC(String message) {
        System.out.println("Radio to ATC: " + message);
        return message;
    }

    public boolean toggleCabinLights(boolean status) {
        System.out.println("Cabin Lighting: " + status);
        return status;
    }

    public double refuel(double weight) {
        System.out.println("Fuel Load: " + weight + " kg");
        return weight;
    }

    public int showAltimeter(int feet) {
        System.out.println("Current Altitude: " + feet + " ft");
        return feet;
    }

    public boolean toggleLandingGear(boolean status) {
        System.out.println("Landing Gear Extended: " + status);
        return status;
    }

    public String setFlightPlan(String destination) {
        System.out.println("Flight Path locked to: " + destination);
        return destination;
    }
}
class JCB {
    String brand;
    String model;
    int year;
    String color;           
    double price;
    boolean isElectric;     
    int bucketCapacity;   
    String fuelType;       
    double engineHours;     
    String operatorName;    

    // Static Variables
    static String country = "India";
    static String machineType = "Earthmover / Construction Equipment";

    // Methods
    public String startEngine(String mode) {
        System.out.println("JCB Engine idling in " + mode + " mode");
        return mode;
    }

    public String stopEngine(String reason) {
        System.out.println("Machine Shutdown: " + reason);
        return reason;
    }

    public double moveMachine(double speed) {
        System.out.println("Tramming at: " + speed + " km/h");
        return speed;
    }

    public double applyHydraulicBrakes(double pressure) {
        System.out.println("Hydraulic Brakes engaged at: " + pressure + " bar");
        return pressure;
    }

    public String operateBucket(String action) {
        System.out.println("Bucket Action: " + action + " (Digging/Loading)");
        return action;
    }

    public boolean toggleWorkLights(boolean status) {
        System.out.println("High-Intensity Work Lights: " + status);
        return status;
    }

    public double refuel(double amount) {
        System.out.println("Diesel Refilled: " + amount + " liters");
        return amount;
    }

    public int showHourMeter(int hours) {
        System.out.println("Total Operating Hours: " + hours);
        return hours;
    }

    public boolean deployStabilizers(boolean status) {
        System.out.println("Stabilizer Legs Deployed: " + status);
        return status;
    }

    public String navigateToSite(String siteLocation) {
        System.out.println("Moving to Construction Site: " + siteLocation);
        return siteLocation;
    }
}
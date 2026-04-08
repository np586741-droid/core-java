class Car {
    String brand;
    String model;
    int year;
    String color;
    double price;
    boolean isElectric;
    int seatingCapacity;
    String fuelType;
    double mileage;
    String ownerName;

    static String country = "Dubai";
    static String vehicleType = "Two Wheeler";

    public String startEngine(String mode) {
        System.out.println("Engine Started in " + mode + " mode");
        return mode;
    }

    public String stopEngine(String reason) {
        System.out.println("Engine Stopped: " + reason);
        return reason;
    }

    public double accelerate(double speed) {
        System.out.println("Accelerating to: " + speed);
        return speed;
    }

    public double applyBrakes(double speed) {
        System.out.println("Speed Reduced to: " + speed);
        return speed;
    }

    public String playMusic(String song) {
        System.out.println("Playing: " + song);
        return song;
    }

    public boolean turnAC(boolean status) {
        System.out.println("AC Status: " + status);
        return status;
    }

    public double refuel(double amount) {
        System.out.println("Fuel Added: " + amount);
        return amount;
    }

    public int showOdometer(int km) {
        System.out.println("Distance: " + km);
        return km;
    }

    public boolean lockDoors(boolean status) {
        System.out.println("Doors Locked: " + status);
        return status;
    }

    public String navigate(String destination) {
        System.out.println("Navigating to: " + destination);
        return destination;
    }
}
class Helicopter {
    String brand;          
    String model;
    int year;
    String color;
    double price;
    boolean isElectric;     
    int passengerCount;     
    String engineType;      
    double flightHours;     
    String ownerName;

    // Static Variables
    static String country = "India";
    static String vehicleType = "Rotary Wing Aircraft";

    // Methods
    public String startRotors(String mode) {
        System.out.println("Rotor blades engaging in " + mode + " mode");
        return mode;
    }

    public String stopRotors(String reason) {
        System.out.println("Rotors braking. Shutdown reason: " + reason);
        return reason;
    }

    public double adjustCollective(double pitch) {
        System.out.println("Adjusting Collective pitch to: " + pitch);
        return pitch;
    }

    public double adjustCyclic(double tilt) {
        System.out.println("Cyclic control tilt: " + tilt + " degrees");
        return tilt;
    }

    public String transmitRadio(String signal) {
        System.out.println("Radio Transmission: " + signal);
        return signal;
    }

    public boolean toggle
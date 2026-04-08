class Speaker {
    String brand;
    String model;
    int year;
    String color;
    double price;
    boolean isBatteryPowered; 
    int driverCount;          
    String connectionType;    
    double batteryLife;      
    String profileName;       

    // Static Variables
    static String country = "India";
    static String deviceType = "Audio Output Device";

    // Methods
    public String powerOn(String mode) {
        System.out.println("Speaker initialized in " + mode + " mode");
        return mode;
    }

    public String powerOff(String reason) {
        System.out.println("Speaker shutting down: " + reason);
        return reason;
    }

    public double adjustVolume(double level) {
        System.out.println("Volume level set to: " + level + "%");
        return level;
    }

    public double setBass(double level) {
        System.out.println("Subwoofer intensity set to: " + level);
        return level;
    }

    public String playAudio(String source) {
        System.out.println("Streaming audio from: " + source);
        return source;
    }

    public boolean toggleRgbLights(boolean status) {
        System.out.println("Party Lights Status: " + status);
        return status;
    }

    public double charge(double percentage) {
        System.out.println("Battery charged to: " + percentage + "%");
        return percentage;
    }

    public int showUptime(int hours) {
        System.out.println("Total playback time: " + hours + " hours");
        return hours;
    }

    public boolean toggleMute(boolean status) {
        System.out.println("Speaker Muted: " + status);
        return status;
    }

    public String pairBluetooth(String device) {
        System.out.println("Linked to: " + device);
        return device;
    }
}
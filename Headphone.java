class Headphone {
    String brand;
    String model;
    int year;
    String color;
    double price;
    boolean isWireless;      
    int driverSize;         
    String connectionType;  
    double batteryLife;    
    String profileName;    

    // Static Variables
    static String country = "India";
    static String deviceType = "Audio Peripheral";

    // Methods
    public String powerOn(String mode) {
        System.out.println("Headphones connected in " + mode + " mode");
        return mode;
    }

    public String powerOff(String reason) {
        System.out.println("Powering down: " + reason);
        return reason;
    }

    public double adjustVolume(double level) {
        System.out.println("Volume level set to: " + level + "%");
        return level;
    }

    public double setEqualizer(double bassLevel) {
        System.out.println("Bass boosted to: " + bassLevel + " dB");
        return bassLevel;
    }

    public String playAudio(String track) {
        System.out.println("Streaming: " + track);
        return track;
    }

    public boolean toggleANC(boolean status) {
        System.out.println("Active Noise Cancellation: " + status);
        return status;
    }

    public double chargeBattery(double percentage) {
        System.out.println("Battery level now at: " + percentage + "%");
        return percentage;
    }

    public int showTotalPlayTime(int hours) {
        System.out.println("Total lifetime listening: " + hours + " hours");
        return hours;
    }

    public boolean toggleMute(boolean status) {
        System.out.println("Microphone Muted: " + status);
        return status;
    }

    public String pairDevice(String deviceName) {
        System.out.println("Pairing with: " + deviceName);
        return deviceName;
    }
}
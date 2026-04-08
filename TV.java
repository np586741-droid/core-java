class TV {
    
    String brand;
    String model;
    int year;
    String color;
    double price;
    boolean isSmartTV;     
    int screenSize;         
    String displayType;     
    double energyRating;  
    String ownerName;

    // Static Variables (Shared across all instances)
    static String country = "India";
    static String applianceType = "Entertainment Electronics";

    // Methods (Behaviors)
    public String powerOn(String mode) {
        System.out.println("TV Powered On in " + mode + " mode");
        return mode;
    }

    public String powerOff(String reason) {
        System.out.println("TV Powered Off: " + reason);
        return reason;
    }

    public int changeVolume(int level) {
        System.out.println("Volume Adjusted to: " + level);
        return level;
    }

    public int changeChannel(int channelNumber) {
        System.out.println("Channel Switched to: " + channelNumber);
        return channelNumber;
    }

    public String playMedia(String content) {
        System.out.println("Playing: " + content);
        return content;
    }

    public boolean toggleGameMode(boolean status) {
        System.out.println("Game Mode Status: " + status);
        return status;
    }

    public double updateFirmware(double version) {
        System.out.println("Firmware Updated to version: " + version);
        return version;
    }

    public int setSleepTimer(int minutes) {
        System.out.println("Sleep Timer set for: " + minutes + " minutes");
        return minutes;
    }

    public boolean lockParentalControls(boolean status) {
        System.out.println("Parental Lock: " + status);
        return status;
    }

    public String openApp(String appName) {
        System.out.println("Launching App: " + appName);
        return appName;
    }
}
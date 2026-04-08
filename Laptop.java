class Laptop{
    String brand;
    String model;
    int year;
    String color;
    double price;
    boolean isTouchscreen;   
    int ramSize;             
    String processorType;  
    double batteryHealth;    
    String userName;        

    // Static Variables
    static String country = "India";
    static String deviceType = "Portable Computer";

    // Methods
    public String bootOS(String mode) {
        System.out.println("System booting in " + mode + " mode (Safe/Normal)");
        return mode;
    }

    public String shutDown(String reason) {
        System.out.println("System shutting down: " + reason);
        return reason;
    }

    public double overclock(double clockSpeed) {
        System.out.println("Processor frequency boosted to: " + clockSpeed + " GHz");
        return clockSpeed;
    }

    public double adjustBrightness(double level) {
        System.out.println("Screen brightness set to: " + level + "%");
        return level;
    }

    public String openApplication(String appName) {
        System.out.println("Launching: " + appName);
        return appName;
    }

    public boolean toggleKeyboardBacklight(boolean status) {
        System.out.println("Keyboard Backlight: " + (status ? "ON" : "OFF"));
        return status;
    }

    public double charge(double amount) {
        System.out.println("Power adapter connected. Charging: " + amount + " Watts");
        return amount;
    }

    public int showStorageUsage(int gbUsed) {
        System.out.println("Disk space occupied: " + gbUsed + " GB");
        return gbUsed;
    }

    public boolean lockSession(boolean status) {
        System.out.println("User Session Locked: " + status);
        return status;
    }

    public String connectToWiFi(String ssid) {
        System.out.println("Connected to network: " + ssid);
        return ssid;
    }
}
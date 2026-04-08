class Tab {
    String brand;
    String model;
    int year;
    String color;
    double price;
    boolean isCellularSupported; 
    int storageCapacity;         
    String displayType;          
    double batteryHealth;        
    String ownerName;

    // Static Variables
    static String country = "India";
    static String deviceType = "Mobile Computing Device";

    // Methods
    public String wakeUp(String method) {
        System.out.println("Tab woke up via " + method);
        return method;
    }

    public String sleep(String reason) {
        System.out.println("Entering sleep mode: " + reason);
        return reason;
    }

    public double setVolume(double level) {
        System.out.println("Media volume: " + level + "%");
        return level;
    }

    public double setBrightness(double level) {
        System.out.println("Screen brightness adjusted to: " + level);
        return level;
    }

    public String playVideo(String videoTitle) {
        System.out.println("Streaming: " + videoTitle);
        return videoTitle;
    }

    public boolean toggleReadingMode(boolean status) {
        System.out.println("Eye Comfort/Reading Mode: " + status);
        return status;
    }

    public double charge(double percentage) {
        System.out.println("Battery level: " + percentage + "%");
        return percentage;
    }

    public int showStorage(int mb) {
        System.out.println("Used Storage: " + mb + " MB");
        return mb;
    }

    public boolean lockScreen(boolean status) {
        System.out.println("Screen Locked: " + status);
        return status;
    }

    public String searchWeb(String query) {
        System.out.println("Searching for: " + query);
        return query;
    }
}
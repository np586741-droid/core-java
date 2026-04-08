class Phone {
    String brand;
    String model;
    int year;
    String color;
    double price;
    boolean is5GEnabled;     
    int ramSize;             
    String chipset;          
    double batteryHealth;    
    String ownerName;

    // Static Variables
    static String country = "India";
    static String deviceType = "Smartphone";

    // Methods
    public String bootSystem(String mode) {
        System.out.println("Phone starting in " + mode + " mode");
        return mode;
    }

    public String powerOff(String reason) {
        System.out.println("Shutting down: " + reason);
        return reason;
    }

    public double setVolume(double level) {
        System.out.println("Media volume set to: " + level + "%");
        return level;
    }

    public double setBrightness(double level) {
        System.out.println("Display brightness: " + level + " nits");
        return level;
    }

    public String playMedia(String content) {
        System.out.println("Streaming: " + content);
        return content;
    }

    public boolean toggleFlashlight(boolean status) {
        System.out.println("Flashlight Status: " + status);
        return status;
    }

    public double charge(double mah) {
        System.out.println("Charging... Current intake: " + mah + " mAh");
        return mah;
    }

    public int showScreenTime(int minutes) {
        System.out.println("Today's Screen Time: " + minutes + " mins");
        return minutes;
    }

    public boolean toggleBiometrics(boolean status) {
        System.out.println("FaceID/Fingerprint Lock: " + status);
        return status;
    }

    public String makeCall(String contact) {
        System.out.println("Dialing: " + contact);
        return contact;
    }
}
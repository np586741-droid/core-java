class Mobile {
    String brand;
    String model;
    int storage;
    int ram;
    double price;
    String color;
    boolean has5G;
    String os;
    int batteryCapacity;
    String ownerName;

    static String category = "Electronics";
    static String type = "Smart Device";

    public boolean powerOn(boolean status) {
        System.out.println("Mobile Power On: " + status);
        return status;
    }

    public boolean powerOff(boolean status) {
        System.out.println("Mobile Power Off: " + status);
        return status;
    }

    public String makeCall(String number) {
        System.out.println("Calling: " + number);
        return number;
    }

    public String sendMessage(String msg) {
        System.out.println("Message Sent: " + msg);
        return msg;
    }

    public boolean connectInternet(boolean status) {
        System.out.println("Internet Connected: " + status);
        return status;
    }

    public int checkBattery(int percent) {
        System.out.println("Battery: " + percent + "%");
        return percent;
    }

    public String openApp(String app) {
        System.out.println("App Opened: " + app);
        return app;
    }

    public boolean takePhoto(boolean status) {
        System.out.println("Photo Taken: " + status);
        return status;
    }

    public String playMusic(String song) {
        System.out.println("Playing Song: " + song);
        return song;
    }

    public boolean lockPhone(boolean status) {
        System.out.println("Phone Locked: " + status);
        return status;
    }
}
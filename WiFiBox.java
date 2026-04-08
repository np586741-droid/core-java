class WiFiBox {
    String brand;
    String model;
    int year;
    String color;
    double price;
    boolean is5GSupported;  
    int deviceLimit;        
    String frequencyBand;   
    double uptime;          
    String networkName;     

    // Static Variables
    static String country = "India";
    static String hardwareType = "Networking Equipment";

    // Methods
    public String bootSystem(String mode) {
        System.out.println("Router booting in " + mode + " mode (Standard/Bridge)");
        return mode;
    }

    public String shutdown(String reason) {
        System.out.println("Network going offline: " + reason);
        return reason;
    }

    public double transmitData(double mbps) {
        System.out.println("Current download speed: " + mbps + " Mbps");
        return mbps;
    }

    public double limitBandwidth(double limit) {
        System.out.println("Speed throttled to: " + limit + " Mbps");
        return limit;
    }

    public String broadcastSSID(String name) {
        System.out.println("Now broadcasting as: " + name);
        return name;
    }

    public boolean toggleGuestNetwork(boolean status) {
        System.out.println("Guest WiFi Status: " + status);
        return status;
    }

    public double checkPing(double ms) {
        System.out.println("Current Latency: " + ms + " ms");
        return ms;
    }

    public int showDataUsage(int gb) {
        System.out.println("Monthly Data Consumed: " + gb + " GB");
        return gb;
    }

    public boolean toggleFirewall(boolean status) {
        System.out.println("Firewall Protection Active: " + status);
        return status;
    }

    public String updateDNS(String server) {
        System.out.println("DNS Server set to: " + server);
        return server;
    }
}
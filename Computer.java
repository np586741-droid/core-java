class Computer {
    String brand;
    String model;
    int year;
    String color;
    double price;
    boolean isLiquidCooled;  
    int ramSlots;            
    String cpuType;          
    double ssdHealth;       
    String adminName;        

    // Static Variables
    static String country = "India";
    static String hardwareCategory = "Personal Computer (Desktop)";

    // Methods
    public String powerOn(String bootType) {
        System.out.println("System Posting: " + bootType + " boot");
        return bootType;
    }

    public String shutDown(String signal) {
        System.out.println("Sending SIGTERM: " + signal);
        return signal;
    }

    public double setClockSpeed(double ghz) {
        System.out.println("Processor speed adjusted to: " + ghz + " GHz");
        return ghz;
    }

    public double setFanSpeed(double rpm) {
        System.out.println("System cooling fans set to: " + rpm + " RPM");
        return rpm;
    }

    public String runProcess(String task) {
        System.out.println("Executing process: " + task);
        return task;
    }

    public boolean togglePowerSaving(boolean status) {
        System.out.println("Eco-Mode Active: " + status);
        return status;
    }

    public double upgradeStorage(double extraGb) {
        System.out.println("Storage expanded by: " + extraGb + " GB");
        return extraGb;
    }

    public int checkResourceUsage(int loadPercentage) {
        System.out.println("Current CPU Load: " + loadPercentage + "%");
        return loadPercentage;
    }

    public boolean toggleFirewall(boolean status) {
        System.out.println("System Security Shield: " + status);
        return status;
    }

    public String connectToNetwork(String ipAddress) {
        System.out.println("Assigned IP: " + ipAddress);
        return ipAddress;
    }
}
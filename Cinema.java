class Cinema {
    String cinemaName;
    String location;
    int numberOfScreens;
    int seatingCapacity;
    String managerName;
    boolean has3D;
    boolean hasFoodCourt;
    double ticketPrice;
    int establishedYear;
    String cinemaType;

    static String country = "India";
    static String type = "Entertainment";

    public String bookTicket(String movieName) {
        System.out.println("Ticket Booked for: " + movieName);
        return movieName;
    }

    public String cancelTicket(String movieName) {
        System.out.println("Ticket Cancelled for: " + movieName);
        return movieName;
    }

    public String showMovie(String movieName) {
        System.out.println("Now Showing: " + movieName);
        return movieName;
    }

    public double collectPayment(double amount) {
        System.out.println("Payment Collected: " + amount);
        return amount;
    }

    public boolean startShow(boolean status) {
        System.out.println("Show Started: " + status);
        return status;
    }

    public boolean stopShow(boolean status) {
        System.out.println("Show Stopped: " + status);
        return status;
    }

    public int countAudience(int total) {
        System.out.println("Total Audience: " + total);
        return total;
    }

    public boolean provideSnacks(boolean status) {
        System.out.println("Snacks Available: " + status);
        return status;
    }

    public String assignScreen(String screenNo) {
        System.out.println("Screen Assigned: " + screenNo);
        return screenNo;
    }

    public boolean maintainCleanliness(boolean status) {
        System.out.println("Cleanliness Maintained: " + status);
        return status;
    }
}
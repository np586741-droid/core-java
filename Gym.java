class Gym {
    String gymName;
    String location;
    int numberOfMembers;
    int numberOfTrainers;
    String managerName;
    boolean hasSwimmingPool;
    boolean hasSauna;
    int establishedYear;
    double membershipFee;
    String gymType;

    static String country = "India";
    static String serviceType = "Fitness";

    public String enrollMember(String memberName) {
        System.out.println("Member Enrolled: " + memberName);
        return memberName;
    }

    public String assignTrainer(String trainerName) {
        System.out.println("Trainer Assigned: " + trainerName);
        return trainerName;
    }

    public boolean conductWorkout(boolean status) {
        System.out.println("Workout Conducted: " + status);
        return status;
    }

    public double collectFee(double amount) {
        System.out.println("Fee Collected: " + amount);
        return amount;
    }

    public boolean maintainEquipment(boolean status) {
        System.out.println("Equipment Maintained: " + status);
        return status;
    }

    public String organizeEvent(String eventName) {
        System.out.println("Event Organized: " + eventName);
        return eventName;
    }

    public boolean openGym(boolean status) {
        System.out.println("Gym Open: " + status);
        return status;
    }

    public int calculateTotalMembers(int total) {
        System.out.println("Total Members: " + total);
        return total;
    }

    public boolean maintainDiscipline(boolean status) {
        System.out.println("Discipline Maintained: " + status);
        return status;
    }

    public String announceOffer(String offerName) {
        System.out.println("Offer Announced: " + offerName);
        return offerName;
    }
}
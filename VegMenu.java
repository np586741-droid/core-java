class VegMenu {
    public void getMenuDetails() {
        System.out.println("getMenuDetails");
    }

    public void checkFoodByFoodName(String foodName) {
                 if (foodName == "Idli") {
            System.out.println("Available");
        } else if (foodName == "Dosa") {
            System.out.println("Available");
        } else if (foodName == "Poha") {
            System.out.println("Available");
        } else if (foodName == "Chapati") {
            System.out.println("Available");
        } else if (foodName == "Paneer Butter Masala") {
            System.out.println("Available");
        } else if (foodName == "Veg Biryani") {
            System.out.println("Available");
        } else if (foodName == "kara bath") {
            System.out.println("Available");
        } else if (foodName == "Pakora") {
            System.out.println("Available");
        } else if (foodName == "figure rice") {
            System.out.println("Available");
        } else if (foodName == "vangi bath") {
            System.out.println("Available");
        } else {
            System.out.println("Not Available");
        }
    }
}
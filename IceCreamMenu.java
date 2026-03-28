class IceCreamMenu {
    public void getMenuDetails() {
        System.out.println("getMenuDetails");
    }

    public void checkFoodByFoodName(String foodName) {
        if (foodName == "Vanilla") {
            System.out.println("Available");
        } else if (foodName == "Chocolate") {
            System.out.println("Available");
        } else if (foodName == "Strawberry") {
            System.out.println("Available");
        } else if (foodName == "Butterscotch") {
            System.out.println("Available");
        } else if (foodName == "Mango") {
            System.out.println("Available");
        } else if (foodName == "Pista") {
            System.out.println("Available");
        } else if (foodName == "Black Currant") {
            System.out.println("Available");
        } else if (foodName == "Coffee") {
            System.out.println("Available");
        } else if (foodName == "Butter Pecan") {
            System.out.println("Available");
        } else if (foodName == "Kulfi") {
            System.out.println("Available");
        } else {
            System.out.println("Not Available");
        }
    }
}
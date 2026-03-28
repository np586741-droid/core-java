class JuiceMenu {
    public void getMenuDetails() {
        System.out.println("getMenuDetails");
    }

    public void checkFoodByFoodName(String foodName) {
        if (foodName == "Orange Juice") {
            System.out.println("Available");
        } else if (foodName == "Apple Juice") {
            System.out.println("Available");
        } else if (foodName == "Mango Juice") {
            System.out.println("Available");
        } else if (foodName == "Pineapple Juice") {
            System.out.println("Available");
        } else if (foodName == "Grape Juice") {
            System.out.println("Available");
        } else if (foodName == "Watermelon Juice") {
            System.out.println("Available");
        } else if (foodName == "Carrot Juice") {
            System.out.println("Available");
        } else if (foodName == "Lemon Juice") {
            System.out.println("Available");
        } else if (foodName == "Tomato Juice") {
            System.out.println("Available");
        } else if (foodName == "Pomegranate Juice") {
            System.out.println("Available");
        } else {
            System.out.println("Not Available");
        }
    }
}
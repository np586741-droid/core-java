class JuiceMenuRunner {
    public static void main(String[] args) {

        JuiceMenu citrusMenu = new JuiceMenu();
        citrusMenu.getMenuDetails();
        citrusMenu.checkFoodByFoodName("Orange Juice");
        citrusMenu.checkFoodByFoodName("Lemon Juice");
        citrusMenu.checkFoodByFoodName("watermellon Juice");
        citrusMenu.checkFoodByFoodName("Grape Juice");
        System.out.println("------------------");

        JuiceMenu tropicalMenu = new JuiceMenu();
        tropicalMenu.getMenuDetails();
        tropicalMenu.checkFoodByFoodName("Mango Juice");
        tropicalMenu.checkFoodByFoodName("Carrot Juice");
        tropicalMenu.checkFoodByFoodName("apple Juice");
        tropicalMenu.checkFoodByFoodName("Orange Juice");
        System.out.println("------------------");

        JuiceMenu healthyMenu = new JuiceMenu();
        healthyMenu.getMenuDetails();
        healthyMenu.checkFoodByFoodName("Carrot Juice");
        healthyMenu.checkFoodByFoodName("Tomato Juice");
        healthyMenu.checkFoodByFoodName("grapes Juice");
        healthyMenu.checkFoodByFoodName("Pomegranate Juice");
        System.out.println("------------------");

        JuiceMenu fruitMenu = new JuiceMenu();
        fruitMenu.getMenuDetails();
        fruitMenu.checkFoodByFoodName("Apple Juice");
        fruitMenu.checkFoodByFoodName("Grape Juice");
        fruitMenu.checkFoodByFoodName("Watermelon Juice");
        fruitMenu.checkFoodByFoodName("pinapple Juice");
        System.out.println("------------------");

        JuiceMenu specialMenu = new JuiceMenu();
        specialMenu.getMenuDetails();
        specialMenu.checkFoodByFoodName("Pomegranate Juice");
        specialMenu.checkFoodByFoodName("Orange Juice");
        specialMenu.checkFoodByFoodName("pinapple Juice");
        specialMenu.checkFoodByFoodName("Tomato Juice");
        System.out.println("------------------");
    }
}
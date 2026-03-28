class IceCreamMenuRunner {
    public static void main(String[] args) {

        IceCreamMenu fruityMenu = new IceCreamMenu();
        fruityMenu.getMenuDetails();
        fruityMenu.checkFoodByFoodName("Mango");
        fruityMenu.checkFoodByFoodName("butter choch");
        fruityMenu.checkFoodByFoodName("Vanilla");
        fruityMenu.checkFoodByFoodName("Chocolate");
        System.out.println("------------------");

        IceCreamMenu nuttyMenu = new IceCreamMenu();
        nuttyMenu.getMenuDetails();
        nuttyMenu.checkFoodByFoodName("Pista");
        nuttyMenu.checkFoodByFoodName("Butter ");
        nuttyMenu.checkFoodByFoodName("Kulfi");
        nuttyMenu.checkFoodByFoodName("butter choch");
        System.out.println("------------------");

        IceCreamMenu classicMenu = new IceCreamMenu();
        classicMenu.getMenuDetails();
        classicMenu.checkFoodByFoodName("butter choch");
        classicMenu.checkFoodByFoodName("Chocolate");
        classicMenu.checkFoodByFoodName("Butterscotch");
        classicMenu.checkFoodByFoodName("vanila");
        System.out.println("------------------");

        IceCreamMenu premiumMenu = new IceCreamMenu();
        premiumMenu.getMenuDetails();
        premiumMenu.checkFoodByFoodName("Black Currant");
        premiumMenu.checkFoodByFoodName("Pista");
        premiumMenu.checkFoodByFoodName("Mango");
        premiumMenu.checkFoodByFoodName("kulfi");
        System.out.println("------------------");

        IceCreamMenu specialMenu = new IceCreamMenu();
        specialMenu.getMenuDetails();
        specialMenu.checkFoodByFoodName("cofee bite");
        specialMenu.checkFoodByFoodName("Coffee");
        specialMenu.checkFoodByFoodName("Vanilla");
        specialMenu.checkFoodByFoodName("pista");
        System.out.println("------------------");
    }
}
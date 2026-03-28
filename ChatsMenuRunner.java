class ChatsMenuRunner {
    public static void main(String[] args) {

        ChatsMenu streetMenu = new ChatsMenu();
        streetMenu.getMenuDetails();
        streetMenu.checkFoodByFoodName("Pani Puri");
        streetMenu.checkFoodByFoodName("Bhel Puri");
        streetMenu.checkFoodByFoodName("Sev Puri");
        streetMenu.checkFoodByFoodName("Dahi Puri");
        System.out.println("------------------");

        ChatsMenu spicyMenu = new ChatsMenu();
        spicyMenu.getMenuDetails();
        spicyMenu.checkFoodByFoodName("Aloo Tikki");
        spicyMenu.checkFoodByFoodName("Samosa Chaat");
        spicyMenu.checkFoodByFoodName("Papdi Chaat");
        spicyMenu.checkFoodByFoodName("Ragda Patties");
        System.out.println("------------------");

        ChatsMenu cornMenu = new ChatsMenu();
        cornMenu.getMenuDetails();
        cornMenu.checkFoodByFoodName("Corn Chaat");
        cornMenu.checkFoodByFoodName("Dahi Vada");
        cornMenu.checkFoodByFoodName("Sev Puri");
        cornMenu.checkFoodByFoodName("Bhel Puri");
        System.out.println("------------------");

        ChatsMenu mixedMenu = new ChatsMenu();
        mixedMenu.getMenuDetails();
        mixedMenu.checkFoodByFoodName("Pani Puri");
        mixedMenu.checkFoodByFoodName("Papdi Chaat");
        mixedMenu.checkFoodByFoodName("Dahi Vada");
        mixedMenu.checkFoodByFoodName("Aloo Tikki");
        System.out.println("------------------");

        ChatsMenu specialMenu = new ChatsMenu();
        specialMenu.getMenuDetails();
        specialMenu.checkFoodByFoodName("Samosa Chaat");
        specialMenu.checkFoodByFoodName("Corn Chaat");
        specialMenu.checkFoodByFoodName("Dahi Puri");
        specialMenu.checkFoodByFoodName("Ragda Patties");
        System.out.println("------------------");
    }
}
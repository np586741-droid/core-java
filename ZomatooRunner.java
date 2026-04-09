public class ZomatooRunner 
{
    public static void main(String[] args) 
    {

        Zomatoo zomatoo = new Zomato();


        String item = "Fried Rice";
        int quantity = 2;

        System.out.println("--- Starting Zomatoo Order System ---");


        double pricePerItem = zomato.getPriceByFoodName(item);

        if (pricePerItem > 0) 
        {
            double totalAmount = zomatoo.getTotalAmountByPriceAndQuantity(pricePerItem, quantity);
            System.out.println("Total for " + quantity + " " + item + "(s): " + totalAmount);

            
            double finalPrice = zomato.getDiscount(totalAmount);
            
            System.out.println("------------------------------------");
            System.out.println("Final Bill (After 10% Discount): " + finalPrice);
            System.out.println("------------------------------------");
        } 
        else 
        {
            System.out.println("Sorry, " + item + " is not available on our menu.");
        }
    }
}
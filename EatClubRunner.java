public class EatClubRunner 
{
    public static void main(String[] args) 
    {
        EatClub eatClub = new EatClub();

        String myFood = "Biriyani";
        int myQuantity = 3;

        System.out.println("=== Welcome to EatClub ===");

        double price = eatClub.getPriceByFoodName(myFood);

        if (price > 0) 
        {
            double total = eatClub.getTotalAmountByPriceAndQuantity(price, myQuantity);
            double finalBill = eatClub.getDiscount(total);

            System.out.println("Item: " + myFood);
            System.out.println("Quantity: " + myQuantity);
            System.out.println("Total Amount: " + total);
            System.out.println("Final Bill after Discount: " + finalBill);
        } 
        else 
        {
            System.out.println("Item not found in EatClub menu.");
        }
    }
}
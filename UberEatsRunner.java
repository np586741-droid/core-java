public class UberEatsRunner 
{
    public static void main(String[] args) 
    {
        UberEats app = new UberEats();


        String selectedFood = "Aloo Paratha";
        int qty = 2;

        System.out.println("--- Welcome to UberEats ---");

        double unitPrice = app.getPriceByFoodName(selectedFood);

        if (unitPrice > 0) 
        {
            double subTotal = app.getTotalAmountByPriceAndQuantity(unitPrice, qty);
            double finalBill = app.getDiscount(subTotal);

          
            System.out.println("***************************");
            System.out.println("Item: " + selectedFood);
            System.out.println("Price: " + unitPrice);
            System.out.println("Quantity: " + qty);
            System.out.println("Subtotal: " + subTotal);
            System.out.println("Final Bill (Discounted): " + finalBill);
            System.out.println("***************************");
        } 
        else 
        {
            System.out.println("Sorry, " + selectedFood + " is not available on UberEats.");
        }
    }
}
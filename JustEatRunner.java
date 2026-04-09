public class JustEatRunner 
{
    public static void main(String[] args) 
    {
        
        JustEat app = new JustEat();

        String item = "Boti Gojju";
        int qty = 1;

        System.out.println("--- Welcome to JustEat ---");

        double price = app.getPriceByFoodName(item);

        if (price > 0) 
        {
            double total = app.getTotalAmountByPriceAndQuantity(price, qty);
            double finalBill = app.getDiscount(total);

            System.out.println("--------------------------");
            System.out.println("Order: " + item);
            System.out.println("Total: " + total);
            System.out.println("Final Bill: " + finalBill);
            System.out.println("--------------------------");
        } 
        else
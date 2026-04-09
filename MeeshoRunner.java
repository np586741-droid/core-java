class MeeshoRunner 
{
    public static void main(String[] args) 
    {
        // Create an instance of the Meesho class
        Meesho meesho = new Meesho();

        String myProduct = "Mobile";
        int quantity = 2;

        System.out.println("--- Welcome to Meesho Shopping ---");

        
        double unitPrice = meesho.getPriceByProduct(myProduct);

        if (unitPrice > 0) 
        {
            double totalAmount = meesho.getTotal(unitPrice, quantity);
            
            double finalPrice = meesho.getDiscount(totalAmount);

            System.out.println("Product: " + myProduct);
            System.out.println("Quantity: " + quantity);
            System.out.println("Total Amount: " + totalAmount);
            System.out.println("Final Price (after 10% discount): " + finalPrice);
        } 
        else 
        {
            System.out.println("Product not found in Meesho inventory.");
        }
    }
}
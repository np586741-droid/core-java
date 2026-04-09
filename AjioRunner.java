public class AjioRunner 
{
    public static void main(String[] args) 
    {
        // 1. Instantiate the Ajio object
        Ajio ajioApp = new Ajio();

        // 2. Define user input
        String selectedItem = "Shoes";
        int quantity = 2;

        System.out.println("--- Welcome to AJIO: Trends at Your Doorstep ---");

        // 3. Process the order sequence
        double unitPrice = ajioApp.getPriceByProduct(selectedItem);

        if (unitPrice > 0.0) 
        {
            // Calculate total based on quantity
            double subtotal = ajioApp.getTotal(unitPrice, quantity);
            
            // Apply the brand discount
            double finalBill = ajioApp.getDiscount(subtotal);

            // 4. Print the final invoice
            System.out.println("------------------------------------------");
            System.out.println("Product     : " + selectedItem);
            System.out.println("Unit Price  : " + unitPrice);
            System.out.println("Quantity    : " + quantity);
            System.out.println("Subtotal    : " + subtotal);
            System.out.println("Final Bill  : " + finalBill + " (Discounted)");
            System.out.println("------------------------------------------");
        } 
        else 
        {
            System.out.println("Error: The product '" + selectedItem + "' is not available in Ajio trends.");
        }
    }
}
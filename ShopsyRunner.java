public class ShopsyRunner 
{
	public static void main(String[] args) 
	{
		// Initialize the Shopsy object
		Shopsy shopsyApp = new Shopsy();

		String myProduct = "Laptop";
		int myQty = 1;

		System.out.println("Welcome to Shopsy - Your Shopping Destination");

		// 1. Get the price
		double price = shopsyApp.getPriceByProduct(myProduct);

		if (price > 0) 
		{
			// 2. Calculate the total
			double totalAmount = shopsyApp.getTotal(price, myQty);
			
			// 3. Apply the discount
			double finalBill = shopsyApp.getDiscount(totalAmount);

			// Print final receipt
			System.out.println("--------------------------------");
			System.out.println("Product:  " + myProduct);
			System
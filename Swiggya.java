class Swiggya
{
	public double getPriceByFoodName(String FoodName)
	{
		System.out.println("invoking getPriceByFoodName: " + FoodName);
		double Price = 0.0;

		if("Egg Rice"==FoodName)
		{
			Price = 65;
		}
		else if("Fried Rice"==FoodName)
		{
			Price = 90.99;
		}
		else if("Aloo Paratha"==FoodName)
		{
			Price = 80.21;
		}
		else if("Biriyani"==FoodName)
		{
			Price = 120;
		}
		else if("Boti Gojju"==FoodName)
		{
			Price = 100;
		}
		else
		{
			Price = 0.0;
		}

		System.out.println("end of getPriceByFoodName");
		return Price;
	}

	public double getTotalAmountByPriceAndQuantity(double Price, int Quantity)
	{
		System.out.println("invoking getTotalAmountByPriceAndQuantity");

		double TotalPrice = Price * Quantity;

		System.out.println("end of getTotalAmountByPriceAndQuantity");
		return TotalPrice;
	}

	public double getDiscount(double TotalPrice)
	{
		System.out.println("invoking getDiscount");

		double Discount = TotalPrice - (TotalPrice * 0.10); 

		System.out.println("end of getDiscount");
		return Discount;
	}
}
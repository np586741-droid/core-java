class Menu
{
	public void getMenuDetails()
	{
		System.out.println("Invoking menu details");
	}
	public void checkFoodByFoodName(String foodName)
	{
		System.out.println("Checking  food by food names");
		if(foodName=="Idly")
		{
			System.out.println("Available");
		}
		else if(foodName=="Dosa")
		{
			System.out.println("available");
		}
		else if(foodName=="Chapathi")
		{
			System.out.println("available");
		}
		else if(foodName=="Poori")
		{
			System.out.println("available");
		}
		else
		{
			System.out.println("Not available");
		}
	}
	public double CheckFoodPriceByFoodName(String foodName)
	{
		System.out.println ("Invoking CheckFoodPriceByFoodName:"+foodName);
		
		double foodPrice=0.0;
		if(foodName=="Idly")
		{
			foodPrice=40.1;
		}
		else if(foodName=="Dosa")
		{
			foodPrice=50.3;
		}
		else if(foodName=="Chapathi")
		{
			foodPrice=30.2;
		}
		else if(foodName=="Poori")
		{
			foodPrice=55.3;
		}
		else
		{
			System.out.println(foodName + " is not available");
		}
		return foodPrice;
	}
}
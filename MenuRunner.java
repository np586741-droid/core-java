class MenuRunner
{
	public static void main(String [] food)
	{
		Menu invoke=new Menu();
	    invoke.getMenuDetails();
		Menu amaravathi= new Menu();
		amaravathi.checkFoodByFoodName("Idly");
		amaravathi.checkFoodByFoodName("Dosa");
		amaravathi.checkFoodByFoodName("Poori");
		amaravathi.checkFoodByFoodName("Chapathi");
		amaravathi.checkFoodByFoodName("Rice Bath");
		
		double price=amaravathi.CheckFoodPriceByFoodName("Idly");
		System.out.println("The price is:"+price);
		double price1=amaravathi.CheckFoodPriceByFoodName("Dosa");
		System.out.println("The price is:"+price1);
		double price2=amaravathi.CheckFoodPriceByFoodName("Poori");
		System.out.println("The price is:"+price2);
		double price3=amaravathi.CheckFoodPriceByFoodName("Pongal");
		System.out.println("The price is:"+price3);
		
		
	}
}
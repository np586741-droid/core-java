class Swiggye
{
	public void search(String foodName)
	{
		System.out.println("Invoking food by foodName:"+foodName);
	}
	public void search(String foodName,String restuarantName)
	{
		System.out.println("Invoking food by food name:" +foodName+ "and restuarant name:" +restuarantName);
	}
	public void search(String foodName,double foodPrice)
	{
		System.out.println("Invoking food by food name:" +foodName+ " and price by food price:"+foodPrice);
	}
	
}
class Zomato
{
	String foodName="Masala Dosa";
	String restuarantName="Udupi Vaibhav Restuarant";
	double foodPrice=70.6;
	float foodRatings=4.5f;
	
	Zomato()
	{
		this("Masala Dosa");
		System.out.println("I am Zomato Constructor 1");
	}
	
	Zomato(String foodName)
	{
		this("Masala Dosa","Amaravathi Restuarant");
		System.out.println("I am Zomato Constructor 2");
		System.out.println("Food Name:"+foodName);
	}
	Zomato(String foodName,String restuarantName)
	{
		this("Masala Dosa",70.6);
		System.out.println("I am Zomato Constructor 3");
		System.out.println("Food Name:"+foodName);
		System.out.println("Restuarant Name:"+restuarantName);
	}
	Zomato(String foodName,double foodPrice)
	{
		this("Masala Dosa",4.5f);
		System.out.println("I am Zomato Constructor 4");
		System.out.println("Food Name:"+foodName);
		System.out.println("Food Price:"+foodPrice);
	}
	Zomato(String foodName,float foodRatings)
	{
		System.out.println("I am Zomato Constructor 5");
		System.out.println("Food Name:"+foodName);
		System.out.println("Food Ratings:"+foodRatings);
		
	}
	
}
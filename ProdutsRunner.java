class ProdutsRunner{
	
	public static void main(String []team){
		Produts p1=new Produts();
		p1.productName="Watch";
		p1.brandName="nothing";	
		p1.price=600;
		p1.Quality="super";		
		p1.rate=9.8f;

		
	p1.displayProdutsDetails();
   System.out.println("----------------------------------------");

	
	Produts p2=new Produts("Phone","redmi",800,"exallent",8.9f);
	p1.displayProdutsDetails();
	System.out.println("----------------------------------------");
	
   Produts p3 = new Produts("Laptop", "Dell", 55000, "Good", 9.2f);
  p3.displayProdutsDetails();
  System.out.println("----------------------------------------");

   Produts p4 = new Produts("Headphones", "Boat", 1200, "Very Good", 8.7f);
  p4.displayProdutsDetails();
  System.out.println("----------------------------------------");

   Produts p5 = new Produts("Camera", "Canon", 25000, "Excellent", 9.5f);
  p5.displayProdutsDetails();
  System.out.println("----------------------------------------");

  Produts p6 = new Produts("Smartwatch", "Apple", 18000, "Superb", 9.9f);
  p6.displayProdutsDetails();
  System.out.println("----------------------------------------");

   Produts p7 = new Produts("Shoes", "Nike", 5000, "Good", 8.8f);
   p7.displayProdutsDetails();
   System.out.println("----------------------------------------");

   Produts p8 = new Produts("Bag", "Adidas", 3000, "Very Good", 9.0f);
  p8.displayProdutsDetails();
  System.out.println("----------------------------------------");

   Produts p9 = new Produts("Tablet", "Samsung", 15000, "Excellent", 9.3f);
   p9.displayProdutsDetails();
    System.out.println("----------------------------------------");

    Produts p10 = new Produts("Monitor", "LG", 12000, "Good", 8.5f);
    p10.displayProdutsDetails();
    System.out.println("----------------------------------------");


    
	}






}
class Produts{
	
static String webSiteName="Flipkart";
 String productName;
 String brandName;
 int  price;
 String Quality;
 float rate;
 
 
 
 public Produts(){
	 
 }
 public Produts( String productName,String brandName,int  price ,String Quality, float rate){
    this.productName=productName;
    this.brandName=brandName;
    this.price=price;
    this.Quality=Quality;
    this.rate=rate;
	
 }
 
 

public void displayProdutsDetails(){
   System.out.println("webSite Name: " + webSiteName); 
	System.out.println("product Name: " + productName); 
	System.out.println("brand name:"+brandName);
	System.out.println("price :"+price);
	System.out.println("Quality :"+Quality);
	System.out.println("rate  :"+rate);

	
	
}



}
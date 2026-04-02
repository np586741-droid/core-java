class FlipkartRunner {

  public static void main(String[] arg) {

    Flipkart Flipkart = new Flipkart();

    boolean login = Flipkart.login("Nikhilniku@13", "Nikiniku@13");
    System.out.println(login);
    
	
	
    String result = Flipkart.login(7892749279L, 8964);
    System.out.println(result);
	
	
    
    String msg = Flipkart.search("HeadPhone");
    System.out.println(msg);
	
    msg = Flipkart.search("HeadPhone", "JBL");
    System.out.println(msg);
	
    
    msg = Flipkart.search("HeadPhone", "JBL", 2500);
    System.out.println(msg);


    msg = Flipkart.search("HeadPhone", "JBL", 2500, "DarkBlue");
    System.out.println(msg);

    msg = Flipkart.search("HeadPhone", "JBL", 2500, "DarkBlue", "32ohms");
    System.out.println(msg);
	
	
  }
}
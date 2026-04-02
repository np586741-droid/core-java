class SwiggyRunner {

  public static void main(String[] arg) {

    Swiggy Swiggy = new Swiggy();

    boolean login = Swiggy.login("Nikhilniku@13", "Nikiniku@13");
    System.out.println(login);
    
	
	
    String result = Swiggy.login(7892749279L, 1308);
    System.out.println(result);
	
	
    
    String msg = Swiggy.search("Biriyani");
    System.out.println(msg);
	
    msg = Swiggy.search("Biriyani", "Mutton biriyani");
    System.out.println(msg);
	
    
    msg = Swiggy.search("Biriyani", "Mutton biriyani", 150);
    System.out.println(msg);


    msg = Swiggy.search("Biriyani", "Mutton biriyani", 150, "MandyaStyle");
    System.out.println(msg);

    msg = Swiggy.search("Biriyani", "Mutton biriyani", 150, "MandyaStyle", 2);
    System.out.println(msg);
	
	
  }
}
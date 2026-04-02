class AmazonRunner {

  public static void main(String[] arg) {

    Amazon amazon = new Amazon();

    boolean login = amazon.login("Nikhilniku@13", "Nikiniku@13");
    System.out.println(login);
    
    String result = amazon.login(7892749279L, 1308);
    System.out.println(result);
    
    String msg = amazon.search("Mobile");
    System.out.println(msg);
	
    msg = amazon.search("Mobile", "Nothing4a");
    System.out.println(msg);
    
    msg = amazon.search("Mobile", "Nothing4a", 35000);
    System.out.println(msg);

    msg = amazon.search("Mobile", "Nothing4a", 35000, "With");
    System.out.println(msg);

    msg = amazon.search("Mobile", "Nothing4a", 35000, "With", "5GB");
    System.out.println(msg);
  }
}
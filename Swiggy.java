class Swiggy {
	
 

 public boolean login(String userName, String psw) {
	 
    System.out.println("invoking login using userName:" + userName + " and psw:" + psw);

    String reguserName = "Nikhil@13";
    String regpsw = "Nikiniku@13";
    boolean isLogin = false;
	

    if (userName.equals(reguserName) && psw.equals(regpsw)) {
      isLogin = true;
	  
    }

    return isLogin;
	
  }

  public String login(long phnum, int otp) {
    System.out.println("invoking login using phone number:" + phnum + " otp:" + otp);
	
	

    long regphnum = 7892749279L;
    int regotp = 1308;
    String message;

    if (phnum == regphnum && otp == regotp) {
      message = "Login Successful";
    } else {
      message = "Login Failed";
    }

    return message;
  }
  
  public String search(String FoodName) {
    System.out.println("invoking search FoodName:" + FoodName);

    String message = "searched foood Name is available: " + FoodName;
    return message;
  }

  public String search(String FoodName, String FoodTypes) {
    System.out.println("invoking search FoodName:" + FoodName + " and FoodTypes:" + FoodTypes);

    String message = "searched Food Name:" + FoodName + " FoodTypes:" + FoodTypes + " is available";
    return message;
  }

  public String search(String FoodName, String FoodTypes, int price) {
    System.out.println("invoking search FoodName:" + FoodName + " FoodTypes:" + FoodTypes + " price:" + price);

    String message = "Food:" + FoodName + " FoodTypes:" + FoodTypes + " under price:" + price + " is available";
    return message;
  }

  public String search(String FoodName, String FoodTypes, int price, String systle) {
    System.out.println("invoking search FoodName:" + FoodName + " FoodTypes:" + FoodTypes + " price:" + price + " systle:" + systle);

    String message = "Food:" + FoodName + " " + systle + "  is available";
    return message;
  }

  public String search(String FoodName, String FoodTypes, int price, String systle, double quantity ) {
    System.out.println("invoking search productName:" + FoodName + " FoodTypes:" + FoodTypes + " price:" + price + " systle:" + systle + " quantity:" + quantity);

    String message = "Food:" + FoodName + " quantity:" + quantity + " is available";
    return message;
  }

}
class PassPortSeva{

 public static String registerUser(String registerToapplyAt,String fullName,String emailid,bollean sameLoginid,string psw){
	 System.out.println("registerUser is started");
	 
	 String registerstartionsStatus=null;
	 
	 
	 
	 System.out.println("registerUser is started");
	 return registerstartionsStatus;
	 
	 public static bollean validateRegisterFields(String registerToapplyAt,String fullName,String emailid,bolle sameLoginid,string psw){
		 
		 System.out.println("validateRegisterFields is started");
		 bollean isValidate=false;
		    //bengaluru !=null
		 
		 if(registerToapplyAt !=null){
			 
			 isValidate=ture;
			}
	       if(emailid !=null){
			   isValidate=true;
			   
		   }	 
		   
		   if(emailid !=null){
			   isValidate=true;
		   }
		   if(sameLoginid !=false){
			   isValidate=true;
		   }
		   
		   if(loginid !=null){
			   isValidate=true;
		   }
		   
		   if(psw){
			   isValidate=true;
		   }
		 
		 System.out.println("validateRegisterFields is started");
		 
		 return isValidate;
		 
		 
	 }
	 
 }




}
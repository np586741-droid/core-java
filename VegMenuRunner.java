class VegMenuRunner{        
   public static void main(String[] args) {
        
        VegMenu northIndian = new VegMenu();
	   northIndian.getMenuDetails();
	 northIndian.checkFoodByFoodName("Paneer Butter Masala");
	 northIndian.checkFoodByFoodName("pongal");
	 northIndian.checkFoodByFoodName("poha");
	 northIndian.checkFoodByFoodName("pokara");
            System.out.println("------------------");


    
	VegMenu southIndian = new VegMenu();
         southIndian.getMenuDetails();
		  southIndian.checkFoodByFoodName("Idli");
		  southIndian.checkFoodByFoodName("chapathi");
		  southIndian.checkFoodByFoodName("roti");
		  southIndian.checkFoodByFoodName("figure rice");
            System.out.println("------------------");


        VegMenu westernFood = new VegMenu();
		        westernFood.getMenuDetails();
				 westernFood.checkFoodByFoodName("noddels");
				 westernFood.checkFoodByFoodName("pulivagare");
				 westernFood.checkFoodByFoodName("veg biriyani");
				 westernFood.checkFoodByFoodName("samosa");
            System.out.println("------------------");


        VegMenu dessert = new VegMenu();
		dessert.getMenuDetails();
		 dessert.checkFoodByFoodName("Dosa");
		dessert.checkFoodByFoodName("poori");
		 dessert.checkFoodByFoodName("vangi bath");
		 dessert.checkFoodByFoodName("veg buriyani");


        VegMenu adigas = new VegMenu();
		adigas.getMenuDetails();
		adigas.checkFoodByFoodName("bath");    
		adigas.checkFoodByFoodName("kara bath");        
		adigas.checkFoodByFoodName("pav baji");        
		adigas.checkFoodByFoodName("avalalaki");        
		            System.out.println("------------------");

}

}
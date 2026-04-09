class JustEat
{
    public double getPriceByFoodName(String foodName)
    {
        System.out.println("invoking getPriceByFoodName in JustEat: " + foodName);
        double price = 0.0;

        if ("Egg Rice".equals(foodName))
        {
            price = 65.0;
        }
        else if ("Fried Rice".equals(foodName))
        {
            price = 90.99;
        }
        else if ("Aloo Paratha".equals(foodName))
        {
            price = 80.21;
        }
        else if ("Biriyani".equals(foodName))
        {
            price = 120.0;
        }
        else if ("Boti Gojju".equals(foodName))
        {
            price = 100.0;
        }
        else
        {
            price = 0.0;
        }

        System.out.println("end of getPriceByFoodName");
        return price;
    }

    public double getTotalAmountByPriceAndQuantity(double price, int quantity)
    {
        System.out.println("invoking getTotalAmountByPriceAndQuantity in JustEat");
        double totalAmount = price * quantity;
        System.out.println("end of getTotalAmountByPriceAndQuantity");
        return totalAmount;
    }

    public double getDiscount(double totalAmount)
    {
        System.out.println("invoking getDiscount in JustEat");
        // Applying the requested 10% discount
        double discountedPrice = totalAmount - (totalAmount * 0.10); 
        System.out.println("end of getDiscount");
        return discountedPrice;
    }
}
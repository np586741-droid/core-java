class Meesho 
{
    public double getPriceByProduct(String product) 
    {
        double price = 0.0;

        if ("Laptop".equals(product))
            price = 50000;
        else if ("Mobile".equals(product))
            price = 20000;
        else if ("Headphones".equals(product))
            price = 2000;

        return price;
    }

    public double getTotal(double price, int qty) 
    {
        return price * qty;
    }

    public double getDiscount(double total) 
    {
        // Applying a 10% discount
        return total - (total * 0.10);
    }
}
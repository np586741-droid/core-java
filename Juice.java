class Juice {

    
    public Juice() {
        this("Mango Juice");
        System.out.println("i am print 1 result");
    }

    
    public Juice(String juiceName) {
        this("Real", "Tropicana");
        System.out.println("i am print 2 result");
        System.out.println("Juice Name: " + juiceName);
    }

    
    public Juice(String brand1, String brand2) {
        this(250.5f, 500.0f, 1000.0f);
        System.out.println("i am print 3 result");
        System.out.println("Brand 1: " + brand1);
        System.out.println("Brand 2: " + brand2);
    }

   
    public Juice(float ml1, float ml2, float ml3) {
        this(30, 60, 90, 120);
        System.out.println("i am print 4 result");
        System.out.println("Quantity 1: " + ml1 + " ml");
        System.out.println("Quantity 2: " + ml2 + " ml");
        System.out.println("Quantity 3: " + ml3 + " ml");
    }

   
    public Juice(int price1, int price2, int price3, int price4) {
        this('X', 'Y', 'Z', 'X', 'Y');
        System.out.println("i am print 5 result");
        System.out.println("Price 1: ₹" + price1);
        System.out.println("Price 2: ₹" + price2);
        System.out.println("Price 3: ₹" + price3);
        System.out.println("Price 4: ₹" + price4);
    }

    
    public Juice(char grade1, char grade2, char grade3, char grade4, char grade5) {
        System.out.println("i am print 6 result");
        System.out.println("Quality Grade 1: " + grade1);
        System.out.println("Quality Grade 2: " + grade2);
        System.out.println("Quality Grade 3: " + grade3);
        System.out.println("Quality Grade 4: " + grade4);
        System.out.println("Quality Grade 5: " + grade5);
    }

    
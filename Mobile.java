class Mobile {

    String brand;
    int price;
    int battery;

    public Mobile() {
        this("Samsung", 15000);
        System.out.println("Default Constructor");
    }

    public Mobile(String brand) {
        this(brand, 20000);
        System.out.println("1 Param Constructor");
    }

    public Mobile(String brand, int price) {
        this(brand, price, 5000);
        System.out.println("2 Param Constructor");
    }

    public Mobile(String brand, int price, int battery) {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Battery: " + battery);
        System.out.println("3 Param Constructor");
    }
}
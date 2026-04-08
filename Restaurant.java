class Restaurant {
    String name;
    String location;
    int tables;
    int staff;
    String chef;
    double averageCost;
    boolean veg;
    boolean delivery;
    int establishedYear;
    String cuisine;

    static String country = "India";
    static String type = "Food";

    public String takeOrder(String order) {
        System.out.println("Order taken: " + order);
        return order;
    }

    public String serveFood(String food) {
        System.out.println("Serving: " + food);
        return food;
    }

    public double generateBill(double amount) {
        System.out.println("Bill: " + amount);
        return amount;
    }

    public boolean cookFood(boolean status) {
        System.out.println("Cooking: " + status);
        return status;
    }

    public boolean cleanTable(boolean status) {
        System.out.println("Table cleaned: " + status);
        return status;
    }

    public boolean openRestaurant(boolean status) {
        System.out.println("Open: " + status);
        return status;
    }

    public boolean closeRestaurant(boolean status) {
        System.out.println("Close: " + status);
        return status;
    }

    public int totalCustomers(int count) {
        System.out.println("Customers: " + count);
        return count;
    }

    public String reserveTable(String name) {
        System.out.println("Reserved for: " + name);
        return name;
    }

    public boolean deliverFood(boolean status) {
        System.out.println("Delivery: " + status);
        return status;
    }
}
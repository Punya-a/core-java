class Flipkart {

    public double getPrice(String item) {
        System.out.println("Invoking a getPrice:"+item);
        double price = 0.0;

        if ("TV" == item) {
            price = 30000;
        } else if ("Mobile" == item) {
            price = 20000;
        } else if ("Laptop" == item) {
            price = 50000;
        } else if ("Fridge" == item) {
            price = 25000;
        } else if ("Washing Machine" == item) {
            price = 18000;
        } else if ("AC" == item) {
            price = 35000;
        } else if ("Fan" == item) {
            price = 2000;
        } else if ("Cooler" == item) {
            price = 7000;
        } else if ("Tablet" == item) {
            price = 15000;
        } else if ("Speaker" == item) {
            price = 3000;
        } else {
            System.out.println("Item not found");
        }
        System.out.println("End of getPrice");

        return price;
    }

    public double getTotal(double price, int qty, float discount) {
        System.out.println("Invoking a getTotal");
        double total = price * qty;
        total = total - (total * discount / 100);
        System.out.println("End of getTotal");
        return total;

    }
}
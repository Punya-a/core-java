class Bakery {

    public double getPrice(String item) {
        System.out.println("Invoking a getPrice:"+item);
        double price = 0.0;

        if ("Cake" == item) {
            price = 300;
        } else if ("Bread" == item) {
            price = 40;
        } else if ("Bun" == item) {
            price = 20;
        } else if ("Cookie" == item) {
            price = 60;
        } else if ("Pastry" == item) {
            price = 90;
        } else if ("Donut" == item) {
            price = 80;
        } else if ("Muffin" == item) {
            price = 70;
        } else if ("Brownie" == item) {
            price = 100;
        } else if ("Roll" == item) {
            price = 50;
        } else if ("Puff" == item) {
            price = 45;
        }
        System.out.println("End of an getPrice");

        return price;
    }

    public double getTotal(double price, int qty, float discount) {
        System.out.println("Invoking a getTotal");
        double total = price * qty;
        total = total - (total * discount / 100);
        System.out.println("End of an getTotal");
        return total;
    }
}
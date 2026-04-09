class Juice {

    public double getPrice(String juice) {
        System.out.println("Invoking a getPrice:"+juice);
        double price = 0.0;

        if ("Orange" == juice) {
            price = 50;
        } else if ("Apple" == juice) {
            price = 60;
        } else if ("Mango" == juice) {
            price = 70;
        } else if ("Pineapple" == juice) {
            price = 65;
        } else if ("Watermelon" == juice) {
            price = 55;
        } else if ("Grape" == juice) {
            price = 75;
        } else if ("Banana" == juice) {
            price = 45;
        } else if ("Papaya" == juice) {
            price = 50;
        } else if ("Strawberry" == juice) {
            price = 80;
        } else if ("Mixed Fruit" == juice) {
            price = 90;
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
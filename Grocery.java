class Grocery {

    public double getPrice(String item) {
        System.out.println("Invokiing a getPrice:"+item);
        double price = 0.0;

        if ("Rice" == item) {
            price = 60;
        } else if ("Wheat" == item) {
            price = 40;
        } else if ("Sugar" == item) {
            price = 50;
        } else if ("Salt" == item) {
            price = 20;
        } else if ("Oil" == item) {
            price = 120;
        } else if ("Milk" == item) {
            price = 45;
        } else if ("Butter" == item) {
            price = 90;
        } else if ("Cheese" == item) {
            price = 100;
        } else if ("Eggs" == item) {
            price = 5;
        } else if ("Flour" == item) {
            price = 35;
        }

        System.out.println("End of an getPrice");

        return price;
    }

    public double getTotal(double price, int qty, float discount) {
        System.out.println("Invokiing a getTotal");
        double total = price * qty;
        total = total - (total * discount / 100);
        System.out.println("End of an getTotal");
        return total;
    }
}
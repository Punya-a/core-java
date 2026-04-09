class Hotell {

    public double getPrice(String room) {
        System.out.println("Invoking a getPrice:"+room);
        double price = 0.0;

        if ("Single" == room) {
            price = 1000;
        } else if ("Double" == room) {
            price = 2000;
        } else if ("Deluxe" == room) {
            price = 3000;
        } else if ("Suite" == room) {
            price = 5000;
        } else if ("AC" == room) {
            price = 2500;
        } else if ("Non AC" == room) {
            price = 1500;
        } else if ("Luxury" == room) {
            price = 6000;
        } else if ("Standard" == room) {
            price = 1200;
        } else if ("Premium" == room) {
            price = 4000;
        } else if ("Economy" == room) {
            price = 800;
        }
        System.out.println("End of an getPrice");

        return price;
    }

    public double getTotal(double price, int days, float discount) {
        System.out.println("Invoking a getTotal");
        double total = price * days;
        total = total - (total * discount / 100);
        System.out.println("End of an getTotal");
        return total;
    }
}
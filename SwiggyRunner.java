class SwiggyRunner {
    public static void main(String[] args) {

        Swiggy app = new Swiggy();

        double price1 = app.getPriceByFoodName("Pizza");
        System.out.println("Price: " + price1);
        double total1 = app.getTotal(price1, 2, 10);
        System.out.println("Total: " + total1);

        System.out.println("---------------");

        double price2 = app.getPriceByFoodName("Burger");
        System.out.println("Price: " + price2);
        double total2 = app.getTotal(price2, 3, 5);
        System.out.println("Total: " + total2);

        System.out.println("---------------");

        double price3 = app.getPriceByFoodName("Pasta");
        System.out.println("Price: " + price3);
        double total3 = app.getTotal(price3, 1, 8);
        System.out.println("Total: " + total3);

        System.out.println("---------------");

        double price4 = app.getPriceByFoodName("Noodles");
        System.out.println("Price: " + price4);
        double total4 = app.getTotal(price4, 4, 12);
        System.out.println("Total: " + total4);

        System.out.println("---------------");

        double price5 = app.getPriceByFoodName("Cake");
        System.out.println("Price: " + price5);
        double total5 = app.getTotal(price5, 1, 15);
        System.out.println("Total: " + total5);
    }
}
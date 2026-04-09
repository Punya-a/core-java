class HotellRunner {
    public static void main(String[] args) {

        Hotell hotelApp = new Hotell();

        double price1 = hotelApp.getPrice("Single");
        System.out.println("Food Price is: " + price1);
        double total1 = hotelApp.getTotal(price1, 2, 10);
        System.out.println("Total price is: " + total1);
        System.out.println("---------------");

        double price2 = hotelApp.getPrice("Double");
        System.out.println("Food Price is: " + price2);
        double total2 = hotelApp.getTotal(price2, 3, 5);
        System.out.println("Total price is: " + total2);
        System.out.println("---------------");

        double price3 = hotelApp.getPrice("Suite");
        System.out.println("Food Price is: " + price3);
        double total3 = hotelApp.getTotal(price3, 1, 8);
        System.out.println("Total price is: " + total3);
        System.out.println("---------------");

        double price4 = hotelApp.getPrice("Luxury");
        System.out.println("Food Price is: " + price4);
        double total4 = hotelApp.getTotal(price4, 2, 12);
        System.out.println("Total price is: " + total4);
        System.out.println("---------------");

        double price5 = hotelApp.getPrice("Economy");
        System.out.println("Food Price is: " + price5);
        double total5 = hotelApp.getTotal(price5, 4, 15);
        System.out.println("Total price is: " + total5);
        System.out.println("---------------");
    }
}
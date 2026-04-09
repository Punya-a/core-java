class BakeryRunner {
    public static void main(String[] args) {

        Bakery bakeryApp = new Bakery();

        double price1 = bakeryApp.getPrice("Cake");
        System.out.println("Food Price is: " + price1);
        double total1 = bakeryApp.getTotal(price1, 1, 10);
        System.out.println("Total price is: " + total1);
        System.out.println("---------------");

        double price2 = bakeryApp.getPrice("Bread");
        System.out.println("Food Price is: " + price2);
        double total2 = bakeryApp.getTotal(price2, 5, 5);
        System.out.println("Total price is: " + total2);
        System.out.println("---------------");

        double price3 = bakeryApp.getPrice("Cookie");
        System.out.println("Food Price is: " + price3);
        double total3 = bakeryApp.getTotal(price3, 3, 8);
        System.out.println("Total price is: " + total3);
        System.out.println("---------------");

        double price4 = bakeryApp.getPrice("Donut");
        System.out.println("Food Price is: " + price4);
        double total4 = bakeryApp.getTotal(price4, 2, 12);
        System.out.println("Total price is: " + total4);
        System.out.println("---------------");

        double price5 = bakeryApp.getPrice("Brownie");
        System.out.println("Food Price is: " + price5);
        double total5 = bakeryApp.getTotal(price5, 4, 15);
        System.out.println("Total price is: " + total5);
        System.out.println("---------------");
    }
}
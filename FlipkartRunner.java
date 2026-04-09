class FlipkartRunner {
    public static void main(String[] args) {

        Flipkart flipkartApp = new Flipkart();

        double price1 = flipkartApp.getPrice("TV");
        System.out.println("Food Price is: " + price1);
        double total1 = flipkartApp.getTotal(price1, 1, 10);
        System.out.println("Total price is: " + total1);
        System.out.println("---------------");

        double price2 = flipkartApp.getPrice("Mobile");
        System.out.println("Food Price is: " + price2);
        double total2 = flipkartApp.getTotal(price2, 2, 5);
        System.out.println("Total price is: " + total2);
        System.out.println("---------------");

        double price3 = flipkartApp.getPrice("Laptop");
        System.out.println("Food Price is: " + price3);
        double total3 = flipkartApp.getTotal(price3, 1, 8);
        System.out.println("Total price is: " + total3);
        System.out.println("---------------");

        double price4 = flipkartApp.getPrice("AC");
        System.out.println("Food Price is: " + price4);
        double total4 = flipkartApp.getTotal(price4, 1, 12);
        System.out.println("Total price is: " + total4);
        System.out.println("---------------");

        double price5 = flipkartApp.getPrice("Fan");
        System.out.println("Food Price is: " + price5);
        double total5 = flipkartApp.getTotal(price5, 3, 15);
        System.out.println("Total price is: " + total5);
        System.out.println("---------------");
    }
}
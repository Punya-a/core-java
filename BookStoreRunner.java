class BookStoreRunner {
    public static void main(String[] args) {

        BookStore bookApp = new BookStore();

        double price1 = bookApp.getPrice("Java");
        System.out.println("Food Price is: " + price1);
        double total1 = bookApp.getTotal(price1, 2, 10);
        System.out.println("Total price is: " + total1);
        System.out.println("---------------");

        double price2 = bookApp.getPrice("Python");
        System.out.println("Food Price is: " + price2);
        double total2 = bookApp.getTotal(price2, 1, 5);
        System.out.println("Total price is: " + total2);
        System.out.println("---------------");

        double price3 = bookApp.getPrice("C++");
        System.out.println("Food Price is: " + price3);
        double total3 = bookApp.getTotal(price3, 3, 8);
        System.out.println("Total price is: " + total3);
        System.out.println("---------------");

        double price4 = bookApp.getPrice("SQL");
        System.out.println("Food Price is: " + price4);
        double total4 = bookApp.getTotal(price4, 2, 12);
        System.out.println("Total price is: " + total4);
        System.out.println("---------------");

        double price5 = bookApp.getPrice("Spring");
        System.out.println("Food Price is: " + price5);
        double total5 = bookApp.getTotal(price5, 1, 15);
        System.out.println("Total price is: " + total5);
        System.out.println("---------------");
    }
}
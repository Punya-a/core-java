class StationeryRunner {
    public static void main(String[] args) {

        Stationery app = new Stationery();

        double price1 = app.getPrice("Pen");
        System.out.println("Food Price is: " + price1);
        double total1 = app.getTotal(price1, 10, 10);
        System.out.println("Total price is: " + total1);
        System.out.println("---------------");

        double price2 = app.getPrice("Notebook");
        System.out.println("Food Price is: " + price2);
        double total2 = app.getTotal(price2, 2, 5);
        System.out.println("Total price is: " + total2);
        System.out.println("---------------");

        double price3 = app.getPrice("Marker");
        System.out.println("Food Price is: " + price3);
        double total3 = app.getTotal(price3, 3, 8);
        System.out.println("Total price is: " + total3);
        System.out.println("---------------");

        double price4 = app.getPrice("Glue");
        System.out.println("Food Price is: " + price4);
        double total4 = app.getTotal(price4, 1, 12);
        System.out.println("Total price is: " + total4);
        System.out.println("---------------");

        double price5 = app.getPrice("File");
        System.out.println("Food Price is: " + price5);
        double total5 = app.getTotal(price5, 2, 15);
        System.out.println("Total price is: " + total5);
        System.out.println("---------------");
    }
}
class BlinkitRunner {
    public static void main(String[] args) {
        BlinkitApp app = new BlinkitApp();

        double price1 = app.getPriceByGroceryItem("Milk");
        System.out.println("Item Price is: " + price1);
        double total1 = app.getTotalAmountByPriceAndQuantity(price1, 2, 5); // 5% discount
        System.out.println("Total price: " + total1);
        System.out.println("---------------");

        double price2 = app.getPriceByGroceryItem("Eggs");
        System.out.println("Item Price is: " + price2);
        double total2 = app.getTotalAmountByPriceAndQuantity(price2, 12, 10); // 10% discount
        System.out.println("Total price: " + total2);
        System.out.println("---------------");

        double price3 = app.getPriceByGroceryItem("Rice");
        System.out.println("Item Price is: " + price3);
        double total3 = app.getTotalAmountByPriceAndQuantity(price3, 5, 8); // 8% discount
        System.out.println("Total price: " + total3);
        System.out.println("---------------");

        double price4 = app.getPriceByGroceryItem("Oil");
        System.out.println("Item Price is: " + price4);
        double total4 = app.getTotalAmountByPriceAndQuantity(price4, 2, 12); // 12% discount
        System.out.println("Total price: " + total4);
        System.out.println("---------------");

        double price5 = app.getPriceByGroceryItem("Cheese");
        System.out.println("Item Price is: " + price5);
        double total5 = app.getTotalAmountByPriceAndQuantity(price5, 1, 15); // 15% discount
        System.out.println("Total price: " + total5);
        System.out.println("---------------");
    }
}
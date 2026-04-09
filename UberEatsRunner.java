class UberEatsRunner {
    public static void main(String[] args) {
        UberEatsApp app = new UberEatsApp();

        double price1 = app.getPriceByFoodName("Burger");
        System.out.println("Food Price is: " + price1);
        double total1 = app.getTotalAmountByPriceAndQuantity(price1, 2, 10); // 10% discount
        System.out.println("Total price is: " + total1);
        System.out.println("---------------");

        double price2 = app.getPriceByFoodName("Pizza");
        System.out.println("Food Price is: " + price2);
        double total2 = app.getTotalAmountByPriceAndQuantity(price2, 1, 5); // 5% discount
        System.out.println("Total price is: " + total2);
        System.out.println("---------------");

        double price3 = app.getPriceByFoodName("Pasta");
        System.out.println("Food Price is: " + price3);
        double total3 = app.getTotalAmountByPriceAndQuantity(price3, 3, 15); // 15% discount
        System.out.println("Total price is: " + total3);
        System.out.println("---------------");

        double price4 = app.getPriceByFoodName("Sushi");
        System.out.println("Food Price is: " + price4);
        double total4 = app.getTotalAmountByPriceAndQuantity(price4, 1, 0); // no discount
        System.out.println("Total price is: " + total4);
        System.out.println("---------------");

        double price5 = app.getPriceByFoodName("Coffee");
        System.out.println("Food Price is: " + price5);
        double total5 = app.getTotalAmountByPriceAndQuantity(price5, 4, 20); // 20% discount
        System.out.println("Total price is: " + total5);
        System.out.println("---------------");
    }
}
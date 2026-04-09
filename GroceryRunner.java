class GroceryRunner {
    public static void main(String[] args) {

        Grocery groceryApp = new Grocery();

        double price1 = groceryApp.getPrice("Rice");
        System.out.println("Food Price is: " + price1);
        double total1 = groceryApp.getTotal(price1, 2, 10);
        System.out.println("Total price is: " + total1);
        System.out.println("---------------");

        double price2 = groceryApp.getPrice("Oil");
        System.out.println("Food Price is: " + price2);
        double total2 = groceryApp.getTotal(price2, 1, 5);
        System.out.println("Total price is: " + total2);
        System.out.println("---------------");

        double price3 = groceryApp.getPrice("Milk");
        System.out.println("Food Price is: " + price3);
        double total3 = groceryApp.getTotal(price3, 3, 8);
        System.out.println("Total price is: " + total3);
        System.out.println("---------------");

        double price4 = groceryApp.getPrice("Butter");
        System.out.println("Food Price is: " + price4);
        double total4 = groceryApp.getTotal(price4, 2, 12);
        System.out.println("Total price is: " + total4);
        System.out.println("---------------");

        double price5 = groceryApp.getPrice("Eggs");
        System.out.println("Food Price is: " + price5);
        double total5 = groceryApp.getTotal(price5, 12, 15);
        System.out.println("Total price is: " + total5);
        System.out.println("---------------");
    }
}
class BlinkitApp {

    public double getPriceByGroceryItem(String itemName) {
        System.out.println("Invoking a getPriceByGroceryItem:"+itemName);
        double price = 0.0;

        if ("Milk" == itemName) {
            price = 50;
        } else if ("Eggs" == itemName) {
            price = 10; 
        } else if ("Bread" == itemName) {
            price = 40;
        } else if ("Butter" == itemName) {
            price = 80;
        } else if ("Cheese" == itemName) {
            price = 120;
        } else if ("Rice" == itemName) {
            price = 60; 
        } else if ("Wheat Flour" == itemName) {
            price = 45; 
        } else if ("Sugar" == itemName) {
            price = 35; 
        } else if ("Oil" == itemName) {
            price = 150; 
        } else if ("Salt" == itemName) {
            price = 20; 
        }
        System.out.println("End of aan getPriceByGroceryItem");

        return price;
    }

    public double getTotalAmountByPriceAndQuantity(double price, int quantity, float discount) {
        System.out.println("Invoking a getTotalAmountByPriceAndQuantity");
        double total = price * quantity;
        double discountAmount = total * (discount / 100);
        total = total - discountAmount;
        System.out.println("End of an getTotalAmountByPriceAndQuantity");
        return total;
    }
}
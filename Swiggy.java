class Swiggy {

    public double getPriceByFoodName(String foodName) {
        System.out.println("Invoking a getPriceByFoodName:"+foodName);
        double price = 0.0;

        if ("Pizza"==foodName) {
            price = 200;
        } else if ("Burger"==foodName) {
            price = 120;
        } else if ("Fries"==foodName) {
            price = 90;
        } else if ("Pasta"==foodName) {
            price = 150;
        } else if ("Sandwich"==foodName) {
            price = 110;
        } else if ("Noodles"==foodName) {
            price = 130;
        }else if ("Manchorian"==foodName) {
            price = 110;
        } else if ("Roll"==foodName) {
            price = 100;
        } else if ("Ice Cream"==foodName) {
            price = 80;
        } else if ("Cake"==foodName) {
            price = 300;
        } else {
            price=0.0;
        }
        System.out.println("End of the getPriceByFoodName");

        return price;
    }

    public double getTotal(double price, int quantity, float discount) {
        System.out.println("Invoking a getTotal");
        double total = price * quantity;
        total = total - (total * discount / 100);
        System.out.println("End of getTotal");
        return total;
    }
}
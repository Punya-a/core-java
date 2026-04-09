class UberEatsApp {

    public double getPriceByFoodName(String foodName) {
        System.out.println("Invoking a getPriceByFoodName:"+foodName);
        double price = 0.0;

        if ("Burger" == foodName) {
            price = 150;
        } else if ("Pizza" == foodName) {
            price = 300;
        } else if ("Pasta" == foodName) {
            price = 200;
        } else if ("Sushi" == foodName) {
            price = 350;
        } else if ("Salad" == foodName) {
            price = 120;
        } else if ("Sandwich" == foodName) {
            price = 100;
        } else if ("Fries" == foodName) {
            price = 80;
        } else if ("Ice Cream" == foodName) {
            price = 70;
        } else if ("Coke" == foodName) {
            price = 50;
        } else if ("Coffee" == foodName) {
            price = 60;
        }
        System.out.println("End of an getPriceByFoodName");

        return price;
    }

    public double getTotalAmountByPriceAndQuantity(double price, int quantity, float discount) {
        System.out.println("Invoking a getTotalAmountByPriceAndQuantity");
        double total = price * quantity;
        double discountAmount = total * (discount / 100);
        total = total - discountAmount;
        System.out.println("end of an getTotalAmountByPriceAndQuantity");
        return total;
    }
}
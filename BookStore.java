class BookStore {

    public double getPrice(String book) {
        System.out.println("Invoking an getPrice:"+book);
        double price = 0.0;

        if ("Java" == book) {
            price = 500;
        } else if ("Python" == book) {
            price = 400;
        } else if ("C" == book) {
            price = 300;
        } else if ("C++" == book) {
            price = 350;
        } else if ("HTML" == book) {
            price = 200;
        } else if ("CSS" == book) {
            price = 250;
        } else if ("JS" == book) {
            price = 450;
        } else if ("SQL" == book) {
            price = 380;
        } else if ("Spring" == book) {
            price = 600;
        } else if ("Hibernate" == book) {
            price = 550;
        }
        System.out.println("End of an getPrice");

        return price;
    }

    public double getTotal(double price, int qty, float discount) {
        System.out.println("Invoking a getTotal");
        double total = price * qty;
        total = total - (total * discount / 100);
        System.out.println("End of an getTotal");
        return total;
    }
}
class Stationery {

    public double getPrice(String item) {
        System.out.println("Invoking a getPrice:"+item);
        double price = 0.0;

        if ("Pen" == item) {
            price = 10;
        } else if ("Pencil" == item) {
            price = 5;
        } else if ("Notebook" == item) {
            price = 50;
        } else if ("Eraser" == item) {
            price = 8;
        } else if ("Sharpener" == item) {
            price = 12;
        } else if ("Marker" == item) {
            price = 20;
        } else if ("Highlighter" == item) {
            price = 15;
        } else if ("Glue" == item) {
            price = 25;
        } else if ("Scale" == item) {
            price = 18;
        } else if ("File" == item) {
            price = 40;
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
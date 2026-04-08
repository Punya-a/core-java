class Printer {
    String brand;
    String model;
    String type;
    int speed;
    int pages;
    double price;
    boolean colorPrint;
    boolean wireless;
    int power;
    String size;

    static String category = "Electronics";
    static String country = "India";

    public boolean powerOn(boolean status) {
        System.out.println("Printer On: " + status);
        return status;
    }

    public boolean powerOff(boolean status) {
        System.out.println("Printer Off: " + status);
        return status;
    }

    public boolean printPage(boolean status) {
        System.out.println("Printing: " + status);
        return status;
    }

    public boolean scanDocument(boolean status) {
        System.out.println("Scanning: " + status);
        return status;
    }

    public boolean copyDocument(boolean status) {
        System.out.println("Copying: " + status);
        return status;
    }

    public boolean refillInk(boolean status) {
        System.out.println("Ink refilled: " + status);
        return status;
    }

    public int checkPages(int pages) {
        System.out.println("Pages: " + pages);
        return pages;
    }

    public boolean connectWifi(boolean status) {
        System.out.println("WiFi: " + status);
        return status;
    }

    public boolean cleanPrinter(boolean status) {
        System.out.println("Cleaned: " + status);
        return status;
    }

    public boolean cancelPrint(boolean status) {
        System.out.println("Print cancelled: " + status);
        return status;
    }
}
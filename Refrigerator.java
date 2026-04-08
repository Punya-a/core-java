class Refrigerator {
    String brand;
    String model;
    String type;
    int capacity;
    int shelves;
    double price;
    boolean inverter;
    boolean freezer;
    int power;
    String color;

    static String category = "Home Appliance";
    static String country = "India";

    public boolean powerOn(boolean status) {
        System.out.println("Power On: " + status);
        return status;
    }

    public boolean powerOff(boolean status) {
        System.out.println("Power Off: " + status);
        return status;
    }

    public boolean cool(boolean status) {
        System.out.println("Cooling: " + status);
        return status;
    }

    public boolean freeze(boolean status) {
        System.out.println("Freezing: " + status);
        return status;
    }

    public boolean storeFood(boolean status) {
        System.out.println("Food stored: " + status);
        return status;
    }

    public boolean adjustTemp(boolean status) {
        System.out.println("Temperature adjusted: " + status);
        return status;
    }

    public boolean defrost(boolean status) {
        System.out.println("Defrost: " + status);
        return status;
    }

    public boolean cleanFridge(boolean status) {
        System.out.println("Cleaned: " + status);
        return status;
    }

    public int checkCapacity(int cap) {
        System.out.println("Capacity: " + cap);
        return cap;
    }

    public boolean closeDoor(boolean status) {
        System.out.println("Door closed: " + status);
        return status;
    }
}
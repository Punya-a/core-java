class AirConditioner {
    String brand;
    String model;
    String type;
    int capacity;
    int temperature;
    double price;
    boolean inverter;
    boolean cooling;
    int power;
    String color;

    static String category = "Appliance";
    static String country = "India";

    public boolean powerOn(boolean status) {
        System.out.println("AC On: " + status);
        return status;
    }

    public boolean powerOff(boolean status) {
        System.out.println("AC Off: " + status);
        return status;
    }

    public int setTemperature(int temp) {
        System.out.println("Temperature: " + temp);
        return temp;
    }

    public boolean startCooling(boolean status) {
        System.out.println("Cooling: " + status);
        return status;
    }

    public boolean stopCooling(boolean status) {
        System.out.println("Cooling stopped: " + status);
        return status;
    }

    public boolean swingAir(boolean status) {
        System.out.println("Swing: " + status);
        return status;
    }

    public boolean changeMode(boolean status) {
        System.out.println("Mode changed: " + status);
        return status;
    }

    public boolean cleanFilter(boolean status) {
        System.out.println("Filter cleaned: " + status);
        return status;
    }

    public int checkPower(int p) {
        System.out.println("Power: " + p);
        return p;
    }

    public boolean timer(boolean status) {
        System.out.println("Timer: " + status);
        return status;
    }
}
class Watch {
    String brand;
    String model;
    String type;
    int battery;
    int warranty;
    double price;
    boolean waterproof;
    boolean digital;
    int size;
    String color;

    static String category = "Accessory";
    static String country = "India";

    public boolean startWatch(boolean status) {
        System.out.println("Watch started: " + status);
        return status;
    }

    public boolean stopWatch(boolean status) {
        System.out.println("Watch stopped: " + status);
        return status;
    }

    public int showTime(int time) {
        System.out.println("Time: " + time);
        return time;
    }

    public boolean setAlarm(boolean status) {
        System.out.println("Alarm set: " + status);
        return status;
    }

    public boolean startTimer(boolean status) {
        System.out.println("Timer started: " + status);
        return status;
    }

    public boolean stopTimer(boolean status) {
        System.out.println("Timer stopped: " + status);
        return status;
    }

    public boolean chargeWatch(boolean status) {
        System.out.println("Charging: " + status);
        return status;
    }

    public boolean connectBluetooth(boolean status) {
        System.out.println("Bluetooth: " + status);
        return status;
    }

    public boolean trackSteps(boolean status) {
        System.out.println("Tracking steps: " + status);
        return status;
    }

    public boolean resetWatch(boolean status) {
        System.out.println("Reset: " + status);
        return status;
    }
}
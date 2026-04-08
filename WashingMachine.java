class WashingMachine {
    String brand;
    String model;
    String type;
    int capacity;
    int programs;
    double price;
    boolean automatic;
    boolean dryer;
    int power;
    String color;

    static String category = "Home Appliance";
    static String country = "India";

    public boolean startMachine(boolean status) {
        System.out.println("Machine started: " + status);
        return status;
    }

    public boolean stopMachine(boolean status) {
        System.out.println("Machine stopped: " + status);
        return status;
    }

    public String selectProgram(String program) {
        System.out.println("Program: " + program);
        return program;
    }

    public boolean addDetergent(boolean status) {
        System.out.println("Detergent added: " + status);
        return status;
    }

    public boolean washClothes(boolean status) {
        System.out.println("Washing: " + status);
        return status;
    }

    public boolean rinse(boolean status) {
        System.out.println("Rinse: " + status);
        return status;
    }

    public boolean dryClothes(boolean status) {
        System.out.println("Drying: " + status);
        return status;
    }

    public boolean cleanMachine(boolean status) {
        System.out.println("Cleaning: " + status);
        return status;
    }

    public int setTimer(int time) {
        System.out.println("Timer: " + time);
        return time;
    }

    public boolean powerOff(boolean status) {
        System.out.println("Power Off: " + status);
        return status;
    }
}
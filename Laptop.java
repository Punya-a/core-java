class Laptop {
    String brand;
    String model;
    String processor;
    String os;
    int ram;
    int storage;
    double price;
    boolean touchscreen;
    boolean gaming;
    int battery;

    static String category = "Electronics";
    static String country = "India";

    public boolean powerOn(boolean status) {
        System.out.println("Power On: " + status);
        return status;
    }

    public boolean powerOff(boolean status) {
        System.out.println("Power Off: " + status);
        return status;
    }

    public String runProgram(String program) {
        System.out.println("Running: " + program);
        return program;
    }

    public boolean charge(boolean status) {
        System.out.println("Charging: " + status);
        return status;
    }

    public String browse(String site) {
        System.out.println("Browsing: " + site);
        return site;
    }

    public boolean updateSystem(boolean status) {
        System.out.println("Update: " + status);
        return status;
    }

    public String installSoftware(String software) {
        System.out.println("Installed: " + software);
        return software;
    }

    public boolean playGame(boolean status) {
        System.out.println("Game: " + status);
        return status;
    }

    public boolean shutdown(boolean status) {
        System.out.println("Shutdown: " + status);
        return status;
    }

    public boolean restart(boolean status) {
        System.out.println("Restart: " + status);
        return status;
    }
}
class Smartphone {
    String brand;
    String model;
    String color;
    String processor;
    int storage;
    int ram;
    double price;
    boolean has5G;
    boolean dualSim;
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

    public String makeCall(String number) {
        System.out.println("Calling: " + number);
        return number;
    }

    public String sendMessage(String msg) {
        System.out.println("Message: " + msg);
        return msg;
    }

    public boolean chargePhone(boolean status) {
        System.out.println("Charging: " + status);
        return status;
    }

    public String installApp(String app) {
        System.out.println("App installed: " + app);
        return app;
    }

    public boolean connectInternet(boolean status) {
        System.out.println("Internet: " + status);
        return status;
    }

    public String takePhoto(String mode) {
        System.out.println("Photo mode: " + mode);
        return mode;
    }

    public boolean playMusic(boolean status) {
        System.out.println("Music: " + status);
        return status;
    }

    public boolean lockPhone(boolean status) {
        System.out.println("Lock: " + status);
        return status;
    }
}
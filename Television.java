class Television {
    String brand;
    String model;
    String type;
    int size;
    int channels;
    double price;
    boolean smartTV;
    boolean wifi;
    int power;
    String resolution;

    static String category = "Electronics";
    static String country = "India";

    public boolean powerOn(boolean status) {
        System.out.println("TV On: " + status);
        return status;
    }

    public boolean powerOff(boolean status) {
        System.out.println("TV Off: " + status);
        return status;
        }

    public int changeChannel(int ch) {
        System.out.println("Channel: " + ch);
        return ch;
    }

    public int increaseVolume(int vol) {
        System.out.println("Volume: " + vol);
        return vol;
    }

    public boolean connectWifi(boolean status) {
        System.out.println("WiFi: " + status);
        return status;
    }

    public String openApp(String app) {
        System.out.println("App: " + app);
        return app;
    }

    public boolean playVideo(boolean status) {
        System.out.println("Playing video: " + status);
        return status;
    }

    public boolean mute(boolean status) {
        System.out.println("Mute: " + status);
        return status;
    }

    public boolean adjustBrightness(boolean status) {
        System.out.println("Brightness adjusted: " + status);
        return status;
    }

    public boolean switchInput(boolean status) {
        System.out.println("Input switched: " + status);
        return status;
    }
}
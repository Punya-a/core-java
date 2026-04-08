class Headphones {
    String brand;
    String model;
    String type;
    int battery;
    int range;
    double price;
    boolean wireless;
    boolean noiseCancel;
    int volume;
    String color;

    static String category = "Electronics";
    static String country = "India";

    public boolean powerOn(boolean status) {
        System.out.println("Headphones On: " + status);
        return status;
    }

    public boolean powerOff(boolean status) {
        System.out.println("Headphones Off: " + status);
        return status;
    }

    public boolean playMusic(boolean status) {
        System.out.println("Music playing: " + status);
        return status;
    }

    public boolean pauseMusic(boolean status) {
        System.out.println("Music paused: " + status);
        return status;
    }

    public int increaseVolume(int vol) {
        System.out.println("Volume: " + vol);
        return vol;
    }

    public boolean connectBluetooth(boolean status) {
        System.out.println("Bluetooth: " + status);
        return status;
    }

    public boolean charge(boolean status) {
        System.out.println("Charging: " + status);
        return status;
    }

    public boolean noiseCancellation(boolean status) {
        System.out.println("Noise cancellation: " + status);
        return status;
    }

    public boolean answerCall(boolean status) {
        System.out.println("Call answered: " + status);
        return status;
    }

    public boolean disconnect(boolean status) {
        System.out.println("Disconnected: " + status);
        return status;
    }
}
class Camera {
    String brand;
    String model;
    String type;
    int megapixels;
    int zoom;
    double price;
    boolean flash;
    boolean video;
    int battery;
    String color;

    static String category = "Electronics";
    static String country = "India";

    public boolean powerOn(boolean status) {
        System.out.println("Camera On: " + status);
        return status;
    }

    public boolean powerOff(boolean status) {
        System.out.println("Camera Off: " + status);
        return status;
    }

    public String capturePhoto(String mode) {
        System.out.println("Photo mode: " + mode);
        return mode;
    }

    public boolean recordVideo(boolean status) {
        System.out.println("Recording: " + status);
        return status;
    }

    public boolean zoomIn(boolean status) {
        System.out.println("Zoom In: " + status);
        return status;
    }

    public boolean zoomOut(boolean status) {
        System.out.println("Zoom Out: " + status);
        return status;
    }

    public boolean useFlash(boolean status) {
        System.out.println("Flash: " + status);
        return status;
    }

    public boolean chargeBattery(boolean status) {
        System.out.println("Charging: " + status);
        return status;
    }

    public String savePhoto(String name) {
        System.out.println("Saved: " + name);
        return name;
    }

    public boolean deletePhoto(boolean status) {
        System.out.println("Deleted: " + status);
        return status;
    }
}
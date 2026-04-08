class Car {
    String brand;
    String model;
    int seats;
    int speed;
    String owner;
    double price;
    boolean engineStatus;
    boolean ac;
    int year;
    String fuelType;

    static String country = "India";
    static String type = "Vehicle";

    public boolean startCar(boolean status) {
        System.out.println("Car started: " + status);
        return status;
    }

    public boolean stopCar(boolean status) {
        System.out.println("Car stopped: " + status);
        return status;
    }

    public int accelerate(int speed) {
        System.out.println("Speed: " + speed);
        return speed;
    }

    public boolean applyBrake(boolean status) {
        System.out.println("Brake applied: " + status);
        return status;
    }

    public boolean turnAC(boolean status) {
        System.out.println("AC: " + status);
        return status;
    }

    public double refuel(double amount) {
        System.out.println("Fuel added: " + amount);
        return amount;
    }

    public String playMusic(String song) {
        System.out.println("Playing: " + song);
        return song;
    }

    public boolean openDoor(boolean status) {
        System.out.println("Door opened: " + status);
        return status;
    }

    public boolean closeDoor(boolean status) {
        System.out.println("Door closed: " + status);
        return status;
    }

    public boolean parkCar(boolean status) {
        System.out.println("Car parked: " + status);
        return status;
    }
}
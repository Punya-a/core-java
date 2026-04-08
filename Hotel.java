class Hotel {
    String name;
    String location;
    int rooms;
    int staff;
    String manager;
    double roomPrice;
    boolean wifi;
    boolean restaurant;
    int establishedYear;
    String rating;

    static String country = "India";
    static String type = "Hospitality";

    public int bookRoom(int count) {
        System.out.println("Rooms booked: " + count);
        return count;
    }

    public boolean cancelBooking(boolean status) {
        System.out.println("Booking cancelled: " + status);
        return status;
    }

    public String assignRoom(String room) {
        System.out.println("Room assigned: " + room);
        return room;
    }

    public double collectPayment(double amount) {
        System.out.println("Payment collected: " + amount);
        return amount;
    }

    public boolean provideWifi(boolean status) {
        System.out.println("WiFi available: " + status);
        return status;
    }

    public boolean serveFood(boolean status) {
        System.out.println("Food served: " + status);
        return status;
    }

    public int totalGuests(int count) {
        System.out.println("Total guests: " + count);
        return count;
    }

    public String organizeEvent(String event) {
        System.out.println("Event: " + event);
        return event;
    }

    public boolean cleanRoom(boolean status) {
        System.out.println("Room cleaned: " + status);
        return status;
    }

    public boolean maintainSecurity(boolean status) {
        System.out.println("Security: " + status);
        return status;
    }
}
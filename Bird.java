class Bird {
    String name;
    String species;
    String color;
    String habitat;
    int age;
    int wingspan;
    int weight;
    double speed;
    boolean canFly;
    boolean migratory;

    static String category = "Animal";
    static String type = "Aerial";

    public boolean fly(boolean status) {
        System.out.println("Flying: " + status);
        return status;
    }

    public boolean eat(boolean status) {
        System.out.println("Eating: " + status);
        return status;
    }

    public boolean chirp(boolean status) {
        System.out.println("Chirping: " + status);
        return status;
    }

    public boolean buildNest(boolean status) {
        System.out.println("Building nest: " + status);
        return status;
    }

    public boolean layEggs(boolean status) {
        System.out.println("Laying eggs: " + status);
        return status;
    }

    public boolean migrate(boolean status) {
        System.out.println("Migrating: " + status);
        return status;
    }

    public boolean drinkWater(boolean status) {
        System.out.println("Drinking water: " + status);
        return status;
    }

    public boolean rest(boolean status) {
        System.out.println("Resting: " + status);
        return status;
    }

    public boolean protect(boolean status) {
        System.out.println("Protecting: " + status);
        return status;
    }

    public boolean hunt(boolean status) {
        System.out.println("Hunting: " + status);
        return status;
    }
}
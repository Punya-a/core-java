class Animal {
    // Properties
    String name;
    String species;
    String color;
    int age;
    double weight;
    double height;
    boolean isWild;
    boolean isCarnivore;
    boolean isDomestic;
    String habitat;

    // Static properties
    static String kingdom = "Animalia";
    static String planet = "Earth";

    // Methods
    public boolean eat(boolean status) {
        System.out.println(name + " is eating: " + status);
        return status;
    }

    public boolean sleep(boolean status) {
        System.out.println(name + " is sleeping: " + status);
        return status;
    }

    public boolean run(boolean status) {
        System.out.println(name + " is running: " + status);
        return status;
    }

    public boolean walk(boolean status) {
        System.out.println(name + " is walking: " + status);
        return status;
    }

    public boolean makeSound(String sound) {
        System.out.println(name + " is making sound: " + sound);
        return true;
    }

    public boolean hunt(boolean status) {
        System.out.println(name + " is hunting: " + status);
        return status;
    }

    public boolean play(boolean status) {
        System.out.println(name + " is playing: " + status);
        return status;
    }

    public boolean swim(boolean status) {
        System.out.println(name + " is swimming: " + status);
        return status;
    }

    public boolean reproduce(boolean status) {
        System.out.println(name + " is reproducing: " + status);
        return status;
    }

    public boolean rest(boolean status) {
        System.out.println(name + " is resting: " + status);
        return status;
    }
}
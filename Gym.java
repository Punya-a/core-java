class Gym {
    String name;
    String location;
    int trainers;
    int members;
    String owner;
    double membershipFee;
    boolean cardio;
    boolean weights;
    int establishedYear;
    String timing;

    static String country = "India";
    static String type = "Fitness";

    public boolean openGym(boolean status) {
        System.out.println("Gym open: " + status);
        return status;
    }

    public int addMember(int count) {
        System.out.println("Members added: " + count);
        return count;
    }

    public String assignTrainer(String trainer) {
        System.out.println("Trainer: " + trainer);
        return trainer;
    }

    public double collectFee(double fee) {
        System.out.println("Fee: " + fee);
        return fee;
    }

    public boolean startWorkout(boolean status) {
        System.out.println("Workout started: " + status);
        return status;
    }

    public boolean provideEquipment(boolean status) {
        System.out.println("Equipment available: " + status);
        return status;
    }

    public int totalMembers(int count) {
        System.out.println("Total members: " + count);
        return count;
    }

    public String scheduleSession(String session) {
        System.out.println("Session: " + session);
        return session;
    }

    public boolean maintainCleanliness(boolean status) {
        System.out.println("Cleanliness: " + status);
        return status;
    }

    public boolean closeGym(boolean status) {
        System.out.println("Gym closed: " + status);
        return status;
    }
}
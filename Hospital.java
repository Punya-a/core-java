class Hospital {
    String name;
    String location;
    int beds;
    int doctors;
    int nurses;
    String chiefDoctor;
    double consultationFee;
    boolean emergency;
    boolean pharmacy;
    int establishedYear;

    static String country = "India";
    static String type = "Healthcare";

    public boolean admitPatient(boolean status) {
        System.out.println("Patient admitted: " + status);
        return status;
    }

    public String assignDoctor(String doctor) {
        System.out.println("Doctor assigned: " + doctor);
        return doctor;
    }

    public double collectFee(double fee) {
        System.out.println("Fee collected: " + fee);
        return fee;
    }

    public boolean startEmergency(boolean status) {
        System.out.println("Emergency started: " + status);
        return status;
    }

    public boolean provideMedicine(boolean status) {
        System.out.println("Medicine provided: " + status);
        return status;
    }

    public String dischargePatient(String name) {
        System.out.println("Patient discharged: " + name);
        return name;
    }

    public int totalPatients(int count) {
        System.out.println("Total patients: " + count);
        return count;
    }

    public boolean conductSurgery(boolean status) {
        System.out.println("Surgery: " + status);
        return status;
    }

    public String scheduleAppointment(String patient) {
        System.out.println("Appointment for: " + patient);
        return patient;
    }

    public boolean maintainCleanliness(boolean status) {
        System.out.println("Cleanliness: " + status);
        return status;
    }
}
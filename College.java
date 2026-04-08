class College {
    String name;
    String city;
    int students;
    int teachers;
    String principal;
    double fee;
    boolean hostel;
    boolean library;
    int establishedYear;
    String grade;

    static String country = "India";
    static String type = "Higher Education";

    public String startLecture(String subject) {
        System.out.println("Lecture started: " + subject);
        return subject;
    }

    public int admitStudent(int count) {
        System.out.println("Students admitted: " + count);
        return count;
    }

    public String assignProfessor(String name) {
        System.out.println("Professor assigned: " + name);
        return name;
    }

    public double collectFee(double amount) {
        System.out.println("Fee collected: " + amount);
        return amount;
    }

    public boolean openLibrary(boolean status) {
        System.out.println("Library open: " + status);
        return status;
    }

    public boolean conductExam(boolean status) {
        System.out.println("Exam conducted: " + status);
        return status;
    }

    public String announceHoliday(String holiday) {
        System.out.println("Holiday: " + holiday);
        return holiday;
    }

    public int totalStudents(int total) {
        System.out.println("Total students: " + total);
        return total;
    }

    public String organizeFest(String fest) {
        System.out.println("Fest: " + fest);
        return fest;
    }

    public boolean maintainDiscipline(boolean status) {
        System.out.println("Discipline: " + status);
        return status;
    }
}
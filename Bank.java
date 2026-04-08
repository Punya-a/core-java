class Bank {
    String name;
    String branch;
    int employees;
    int customers;
    String manager;
    double interestRate;
    boolean loanFacility;
    boolean onlineBanking;
    int establishedYear;
    String ifscCode;

    static String country = "India";
    static String type = "Finance";

    public double deposit(double amount) {
        System.out.println("Deposited: " + amount);
        return amount;
    }

    public double withdraw(double amount) {
        System.out.println("Withdrawn: " + amount);
        return amount;
    }

    public boolean openAccount(boolean status) {
        System.out.println("Account opened: " + status);
        return status;
    }

    public boolean closeAccount(boolean status) {
        System.out.println("Account closed: " + status);
        return status;
    }

    public double checkBalance(double balance) {
        System.out.println("Balance: " + balance);
        return balance;
    }

    public boolean provideLoan(boolean status) {
        System.out.println("Loan provided: " + status);
        return status;
    }

    public String assignManager(String name) {
        System.out.println("Manager: " + name);
        return name;
    }

    public int totalCustomers(int count) {
        System.out.println("Customers: " + count);
        return count;
    }

    public boolean enableOnlineBanking(boolean status) {
        System.out.println("Online banking: " + status);
        return status;
    }

    public double calculateInterest(double amount) {
        System.out.println("Interest: " + amount);
        return amount;
    }
}
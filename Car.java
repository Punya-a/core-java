class Car {
    String registrationNumber;
    String brand;
    String model;
    double price;
    String color;
    int mileage;
    static int noOfWheels =4;

    public Car(){

}

   public Car(String registrationNumber, String brand, String model, double price, String color, int mileage) {
        this. registrationNumber = registrationNumber;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.color = color;
        this.mileage = mileage;
    }

     public void displayDetails(){
           System.out.println("Invoking a displayDetails method");
           System.out.println("The registration number is:"+ registrationNumber);
           System.out.println("The brand name is:"+ brand);
           System.out.println("the model name is :"+ model);
           System.out.println("price is:"+ price);
           System.out.println("The color is :"+color);
           System.out.println("mileage:"+ mileage);
           System.out.println("The number of wheels:"+ noOfWheels);

    }
}
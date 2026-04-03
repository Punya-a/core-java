
class Laptop {
    String serialNumber;
    String brand;
    String processor;
    static String category ="Electronics";
    int ram;
    int storage;
    double price;

    Laptop(String serialNumber, String brand, String processor, int ram, int storage, double price) {
        this.serialNumber = serialNumber;
        this.brand = brand;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.price = price;
    }

     public void displayDetails(){
           System.out.println("Invoking a displayDetails method");
           System.out.println("The serial number is:"+ serialNumber);
           System.out.println("The brand name is:"+ brand);
           System.out.println("the processor is :"+ processor);
           System.out.println("the category :"+ category );
           System.out.println("The ram is :"+ram);
           System.out.println("The storage:"+storage);
           System.out.println("price is:"+ price);


    }
}

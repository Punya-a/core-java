class SmartPhone{

     String brandName;
     String modelName;
     double price;
     int storage;
     int battery;
     static String store="Amazon";
 
     public SmartPhone(){


}   

     public SmartPhone(String brandName, String modelName, double price, int storage, int battery ){
      this. brandName= brandName;        
      this. modelName= modelName;
      this. price= price;
      this. storage= storage;
      this. battery= battery;

}

     public void displayDetails(){
           System.out.println("Invoking a displayDetails method");
           System.out.println("The brand name is:"+ brandName);
           System.out.println("the model name is :"+ modelName);
           System.out.println("price is:"+ price);
           System.out.println("The storage :"+ storage);
           System.out.println("battery :"+ battery);
           System.out.println("Available in store:"+ store);

}

}
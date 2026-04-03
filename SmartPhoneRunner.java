class SmartPhoneRunner{

   public static void main (String []args){

   SmartPhone samsung =new SmartPhone("Samsung" , "S21" ,600000 , 128 ,4000);
   samsung.displayDetails();

    System.out.println("------------------");

   SmartPhone apple=new SmartPhone("Apple" , "iPhone13" , 80000 , 128 , 3500);
    apple .displayDetails();
    System.out.println("------------------");


   SmartPhone onePlus=new SmartPhone("onePlus","9",50000.8,256,4500);
     onePlus.displayDetails();
    System.out.println("------------------");


   SmartPhone realme=new SmartPhone("realme","narzo",15000,64,5000);
     realme.displayDetails();
    System.out.println("------------------");


   SmartPhone redmi=new SmartPhone("redmi","note10",15000.32,128,5000);
    redmi .displayDetails();
    System.out.println("------------------");


   SmartPhone vivo=new SmartPhone("vivo","v20",20000.38,128,4000);
     vivo.displayDetails();
    System.out.println("------------------");


   SmartPhone oppo=new SmartPhone("oppo","F19",18000.93,128,4500);
     oppo.displayDetails();
    System.out.println("------------------");


   SmartPhone motorola =new SmartPhone("Motorola ","G60",17000.65,128,6000);
    motorola .displayDetails();
    System.out.println("------------------");


   SmartPhone nokia=new SmartPhone("Nokia ","G20",13000.76,64,5000);
    nokia .displayDetails();
    System.out.println("------------------");


   SmartPhone asus=new SmartPhone("Asus ","ROG",70000.09,256,6000);
    asus .displayDetails();
    System.out.println("------------------");


}

}
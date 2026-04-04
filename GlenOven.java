class GlenOven{

     static boolean isCooking;
     static int highCapacity=35;
     static int lowCapacity;
     static int currentCapacity;


   public static boolean turnOnOrOff(){

        System.out.println("turnOnOrOff method started ");

        if(isCooking==false){
           isCooking=true;
           System.out.println("oven state is on:"+isCooking);
        }else if(isCooking==true){
           isCooking=false;
           System.out.println("oven state is on:"+isCooking);       
     
}
    System.out.println("turnOnOrOff method ended");

    return isCooking;

}
     

}
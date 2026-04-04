class LongwayHeater{

     static boolean isOn;
     static int highCapacity=15;
     static int lowCapacity;
     static int currentCapacity;


   public static boolean startOrStop(){

        System.out.println("onOrOff method started ");

        if(isOn==false){
           isOn=true;
           System.out.println("heater state is on:"+isOn);
        }else if(isOn==true){
           isOn=false;
           System.out.println("heater state is on:"+isOn);       
     
}
    System.out.println("onOrOff method ended");

    return isOn;

}
     

}
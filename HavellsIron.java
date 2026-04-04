class HavellsIron{

     static boolean isOn;
     static int highVoltage=250;
     static int lowVoltage;
     static int currentVoltage;


   public static boolean heatingOnOrOff(){

        System.out.println("heatingOnOrOff method started ");

        if(isOn==false){
           isOn=true;
           System.out.println("iron state is on:"+isOn);
        }else if(isOn==true){
           isOn=false;
           System.out.println("iron state is on:"+isOn);       
     
}
    System.out.println("heatingOnOrOff method ended");

    return isOn;

}
     

}
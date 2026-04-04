class CromptonFan{

     static boolean isOn;
     static int highSpeed=5;
     static int lowSpeed;
     static int currentSpeed;


   public static boolean onOrOff(){

        System.out.println("onOrOff method started ");

        if(isOn==false){
           isOn=true;
           System.out.println("Ac state is on:"+isOn);
        }else if(isOn==true){
           isOn=false;
           System.out.println("Ac state is on:"+isOn);       
     
}
    System.out.println("onOrOff method ended");

    return isOn;

}
     

}
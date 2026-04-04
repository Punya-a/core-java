class LextonLamp{

     static boolean isOn;
     

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
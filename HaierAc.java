class HaierAc{

     static boolean isSwitch;
     static int maxTemparature=30;
     static int minTemparature=0;
     static int currentTemparature;


   public static boolean onOrOff(){

        System.out.println("onOrOff method started ");

        if(isSwitch==false){
           isSwitch=true;
           System.out.println("Ac state is on:"+isSwitch);
        }else if(isSwitch==true){
           isSwitch=false;
           System.out.println("Ac state is on:"+isSwitch);       
     
}
    System.out.println("onOrOff method ended");

    return isSwitch;

}
     

}
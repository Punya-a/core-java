class LextonLampRunner{

   public static void main(String[]args){

   System.out.println("-----First Time Method Call----");
   boolean lampStatus= LextonLamp .onOrOff();
   System.out.println("main method lamp Status:"+lampStatus);

   System.out.println("-----Second Time Method Call----");
   LextonLamp .onOrOff();


   System.out.println("-----Third Time Method Call----");
   LextonLamp .onOrOff();


   System.out.println("-----Fourth Time Method Call----");
    LextonLamp.onOrOff();


   System.out.println("-----Five Time Method Call----");
    LextonLamp.onOrOff();

}


}
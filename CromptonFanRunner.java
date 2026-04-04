class CromptonFanRunner{

   public static void main(String[]args){

   System.out.println("-----First Time Method Call----");
   boolean fanStatus= CromptonFan.onOrOff();
   System.out.println("main method fan Status:"+fanStatus);

   System.out.println("-----Second Time Method Call----");
   CromptonFan.onOrOff();


   System.out.println("-----Third Time Method Call----");
   CromptonFan.onOrOff();


   System.out.println("-----Fourth Time Method Call----");
   CromptonFan.onOrOff();


   System.out.println("-----Five Time Method Call----");
   CromptonFan.onOrOff();

}


}
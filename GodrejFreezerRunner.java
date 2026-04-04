class GodrejFreezerRunner{

   public static void main(String[]args){

   System.out.println("-----First Time Method Call----");
   boolean freezerStatus= GodrejFreezer .onOrOff();
   System.out.println("main method fan Status:"+freezerStatus);

   System.out.println("-----Second Time Method Call----");
   GodrejFreezer. onOrOff();


   System.out.println("-----Third Time Method Call----");
   GodrejFreezer. onOrOff();


   System.out.println("-----Fourth Time Method Call----");
   GodrejFreezer .onOrOff();


   System.out.println("-----Five Time Method Call----");
   GodrejFreezer. onOrOff();

}


}
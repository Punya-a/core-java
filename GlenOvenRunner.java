class GlenOvenRunner{

   public static void main(String[]args){

   System.out.println("-----First Time Method Call----");
   boolean ovenStatus= GlenOven.turnOnOrOff();
   System.out.println("main method oven Status:"+ovenStatus);

   System.out.println("-----Second Time Method Call----");
   GlenOven.turnOnOrOff();


   System.out.println("-----Third Time Method Call----");
   GlenOven.turnOnOrOff();


   System.out.println("-----Fourth Time Method Call----");
   GlenOven.turnOnOrOff();


   System.out.println("-----Five Time Method Call----");
   GlenOven.turnOnOrOff();

}


}
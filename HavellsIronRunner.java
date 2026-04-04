class HavellsIronRunner{

   public static void main(String[]args){

   System.out.println("-----First Time Method Call----");
   boolean heatingStatus= HavellsIron.heatingOnOrOff();
   System.out.println("main method fan Status:"+heatingStatus);

   System.out.println("-----Second Time Method Call----");
   HavellsIron.heatingOnOrOff();


   System.out.println("-----Third Time Method Call----");
   HavellsIron.heatingOnOrOff();


   System.out.println("-----Fourth Time Method Call----");
   HavellsIron.heatingOnOrOff();


   System.out.println("-----Five Time Method Call----");
   HavellsIron.heatingOnOrOff();

}


}
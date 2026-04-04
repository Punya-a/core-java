class HaierAcRunner{

   public static void main(String[]args){

   System.out.println("-----First Time Method Call----");
   boolean acStatus=HaierAc.onOrOff();
   System.out.println("main method Ac Status:"+acStatus);

   System.out.println("-----Second Time Method Call----");
   HaierAc.onOrOff();


   System.out.println("-----Third Time Method Call----");
   HaierAc.onOrOff();


   System.out.println("-----Fourth Time Method Call----");
   HaierAc.onOrOff();


   System.out.println("-----Five Time Method Call----");
   HaierAc.onOrOff();

}


}
class LongwayHeaterRunner{

   public static void main(String[]args){

   System.out.println("-----First Time Method Call----");
   boolean heaterStatus= LongwayHeater .startOrStop();
   System.out.println("main method heater Status:"+heaterStatus);

   System.out.println("-----Second Time Method Call----");
   LongwayHeater. startOrStop();


   System.out.println("-----Third Time Method Call----");
   LongwayHeater. startOrStop();


   System.out.println("-----Fourth Time Method Call----");
   LongwayHeater. startOrStop();


   System.out.println("-----Five Time Method Call----");
   LongwayHeater. startOrStop();

}


}
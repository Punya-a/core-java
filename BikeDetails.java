class BikeDetails{


   static String bikeNames[]={"Duke","Pulsar","Raider","Splendor","Suzuki","Royal enfield"};


    public static void main(String []args){

   int index;   
   for(index=0;index<= bikeNames.length-1;index++){
   
   if(index%2==0){

   System.out.println(bikeNames[index]);

}
} 

}


}
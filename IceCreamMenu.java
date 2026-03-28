class IceCreamMenu{

    public void getMenuDetails (){

     System.out.println("invoking  a method ");

}

//    System.out.println("invoking  a method ");


    public void checkIceCreamNameByMenu(String iceCreamName){

   System.out.println("invoking checkIceCreamNameByMenu ");



     if(iceCreamName =="kesar ice cream"){
        System.out.println("available ");

      } 

     else if(iceCreamName =="caramel ice cream"){
        System.out.println("available ");

      } 
     else if(iceCreamName =="coffee ice cream"){
        System.out.println("available ");

      } 
     else if(iceCreamName =="black currant ice cream"){
        System.out.println("available ");

      } 
     else if(iceCreamName =="pista ice cream"){
        System.out.println("available ");

      } 
     else if(iceCreamName =="mango ice cream"){
        System.out.println("available ");

      } 
     else if(iceCreamName =="butterscotch ice cream"){
        System.out.println("available ");

      } 

      else if(iceCreamName =="strawberry ice cream"){
        System.out.println("available ");

      } 

     else if(iceCreamName =="chocolate ice cream"){
        System.out.println("available ");

      } 

     else if(iceCreamName =="vanilla ice cream"){
        System.out.println("available ");

      } 
    
    else{
         System.out.println("not available");

}



}


    public double checkIceCreamPriceByMenu(String iceCreamName){

   System.out.println("invoking checkIceCreamPriceByMenu ");
    double iceCreamPrice=0.0;


     if(iceCreamName =="kesar ice cream"){
            iceCreamPrice=200.98;
      } 

     else if(iceCreamName =="caramel ice cream"){
            iceCreamPrice=250.76;

      } 
     else if(iceCreamName =="coffee ice cream"){
            iceCreamPrice=76.87;

      } 
     else if(iceCreamName =="black currant ice cream"){
            iceCreamPrice=88.98;

      } 
     else if(iceCreamName =="pista ice cream"){
            iceCreamPrice=56.98;

      } 
     else if(iceCreamName =="mango ice cream"){
            iceCreamPrice=180.98;

      } 
     else if(iceCreamName =="butterscotch ice cream"){
            iceCreamPrice=160.65;

      } 

      else if(iceCreamName =="strawberry ice cream"){
            iceCreamPrice=150.87;

      } 

     else if(iceCreamName =="chocolate ice cream"){
            iceCreamPrice=135.76;

      } 

     else if(iceCreamName =="vanilla ice cream"){
            iceCreamPrice=140.65;

      } 
    
    else{
         System.out.println("not available");

}

        return iceCreamPrice;

}

}
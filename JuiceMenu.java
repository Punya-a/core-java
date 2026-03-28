class JuiceMenu{

    public void getMenuDetails (){

     System.out.println("invoking  a method ");

}

//    System.out.println("invoking  a method ");


    public void cheackJuiceNameByMenu(String juiceName){

   System.out.println("invoking cheackJuiceNameByMenu ");



     if(juiceName =="orange juice"){
        System.out.println("available ");

      } 

     else if(juiceName =="mango juice"){
        System.out.println("available ");

      } 
     else if(juiceName =="pineapple juice"){
        System.out.println("available ");

      } 
     else if(juiceName =="watermelon juice"){
        System.out.println("available ");

      } 
     else if(juiceName =="apple juice"){
        System.out.println("available ");

      } 
     else if(juiceName =="grape juice"){
        System.out.println("available ");

      } 
     else if(juiceName =="papaya juice"){
        System.out.println("available ");

      } 

      else if(juiceName =="pomegranate juice"){
        System.out.println("available ");

      } 

     else if(juiceName =="fruit punch"){
        System.out.println("available ");

      } 

     else if(juiceName =="badam milk"){
        System.out.println("available ");

      } 
    
    else{
         System.out.println("not available");

}


}

    public double  cheackJuicePriceByMenu(String juiceName){

   System.out.println("invoking cheackJuicePriceByMenu and the name is"+ juiceName);
      double juiceprice=20.0;


     if(juiceName =="orange juice"){
          juiceprice=25.54;
      } 

     else if(juiceName =="mango juice"){
          juiceprice=30.65;

      } 
     else if(juiceName =="pineapple juice"){
          juiceprice=40.87;

      } 
     else if(juiceName =="watermelon juice"){
          juiceprice=50.76;

      } 
     else if(juiceName =="apple juice"){
          juiceprice=55.87;

      } 
     else if(juiceName =="grape juice"){
          juiceprice=60.76;

      } 
     else if(juiceName =="papaya juice"){
          juiceprice=70.76;

      } 

      else if(juiceName =="pomegranate juice"){
          juiceprice=87.87;

      } 

     else if(juiceName =="fruit punch"){
          juiceprice=90.88;

      } 

     else if(juiceName =="badam milk"){
          juiceprice=100.90;

      } 
    
    else{
         System.out.println("not available");

}
 return juiceprice;

}

}
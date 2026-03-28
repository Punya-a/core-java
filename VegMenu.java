class VegMenu{

    public void getMenuDetails (){

     System.out.println("invoking  a method ");

}

//    System.out.println("invoking  a method ");


    public String  chechFoodNameByMenu(String foodName){

   System.out.println("invoking  chechFoodNameByMenu");
        String vegName="null";


     if(foodName=="palak paneer"){
        vegName="availability ";

      } 

     else if(foodName=="veg Biriyani"){
        vegName="availability ";


      } 
     else if(foodName=="jeera rice"){
        vegName="availability ";

      } 
     else if(foodName=="rave dosa"){
        vegName="availability ";

      } 
     else if(foodName=="vegetable pulao"){
        vegName="availability ";

      } 
     else if(foodName=="plain dosa"){
        vegName="availability ";

      } 
     else if(foodName=="lemon rice"){
        vegName="availability ";

      } 

      else if(foodName=="upma"){
        vegName="availability ";

      } 

     else if(foodName=="pongal"){
        vegName="availability ";

      } 

     else if(foodName=="idli"){
        vegName="availability ";

      } 
    
    else{
         System.out.println("not available");

}
      return foodName;

}
public double  chechFoodPriceByMenu(String foodName){

   System.out.println("invoking  chechFoodPriceByMenu and the name is:"+ foodName);
        double foodPrice=0.0;


     if(foodName=="palak paneer"){
           foodPrice=350.54;
      } 

     else if(foodName=="veg Biriyani"){
           foodPrice=100.23;

      } 
     else if(foodName=="jeera rice"){
           foodPrice=50.32;

      } 
  
     else if(foodName=="rave dosa"){
           foodPrice=65.54;

      } 
     else if(foodName=="vegetable pulao"){
           foodPrice=80.56;

      } 
     else if(foodName=="plain dosa"){
           foodPrice=87.65;

      } 
     else if(foodName=="lemon rice"){
           foodPrice=40.45;

      } 

      else if(foodName=="upma"){
           foodPrice=32.45;

      } 

     else if(foodName=="pongal"){
           foodPrice=77.76;

      } 

     else if(foodName=="idli"){
           foodPrice=43.54;

      } 
    
    else{
         System.out.println("not available");

}

    return foodPrice;
}


}
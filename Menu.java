class Menu{

    public void getMenuDetails(){

     System.out.println("invoking  a method ");

}

//    System.out.println("invoking  a method ");


    public void checkFoodNameByFoodMenu(String FoodName){

   System.out.println("invoking checkFoodNameByFoodMenu ");



     if(FoodName=="pori"){
        System.out.println("available ");

      } 

     else if(FoodName=="masala dosa"){
        System.out.println("available ");

      } 
     else if(FoodName=="biriyani"){
        System.out.println("available ");

      } 
     else if(FoodName=="chapati"){
        System.out.println("available ");

      } 
     else if(FoodName=="alu parota"){
        System.out.println("available ");

      } 
     else if(FoodName=="kabab"){
        System.out.println("available ");

      } 
     else if(FoodName=="idli"){
        System.out.println("available ");

      } 
    
    else{
         System.out.println("not available");

}


}

public double checkFoodPriceByFoodName(String FoodName){

   System.out.println("invoking checkFoodPriceByFoodName and the food name is:"+ FoodName);
   double foodPrice=0.0;


     if(FoodName=="pori"){
         foodPrice=40.65;
      } 

     else if(FoodName=="masala dosa"){
         foodPrice=70.6;

      } 
     else if(FoodName=="biriyani"){
         foodPrice=100.66;

      } 
     else if(FoodName=="chapati"){
         foodPrice=60.87;

      } 
     else if(FoodName=="alu parota"){
         foodPrice=80.10;

      } 
     else if(FoodName=="kabab"){
         foodPrice=110.10;

      } 
     else if(FoodName=="idli"){
         foodPrice=30.54;

      } 
    
    else{
         System.out.println("not available");

}
    return foodPrice;



}


}
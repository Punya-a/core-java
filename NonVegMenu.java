class NonVegMenu{

    public void getMenuDetails (){

     System.out.println("invoking  a method ");

}

//    System.out.println("invoking  a method ");


    public void chechFoodNameByMenu(String FoodName){

   System.out.println("invoking  chechFoodNameByMenu");



     if(FoodName=="chicken biriyani"){
        System.out.println("available ");

      } 

     else if(FoodName=="mutton biriyani"){
        System.out.println("available ");

      } 
     else if(FoodName=="chicken curry"){
        System.out.println("available ");

      } 
     else if(FoodName=="fish fry"){
        System.out.println("available ");

      } 
     else if(FoodName=="egg curl"){
        System.out.println("available ");

      } 
     else if(FoodName=="chicken lollipop"){
        System.out.println("available ");

      } 
     else if(FoodName=="chilli chicken "){
        System.out.println("available ");

      } 

      else if(FoodName=="chicken kebab"){
        System.out.println("available ");

      } 

     else if(FoodName=="tandoori chicken "){
        System.out.println("available ");

      } 

     else if(FoodName=="butter chicken "){
        System.out.println("available ");

      } 
    
    else{
         System.out.println("not available");

}


}
 public double  chechFoodPriceByMenu(String foodName){

   System.out.println("invoking  chechFoodPriceByMenu and the name is:"+ foodName);
    double foodPrice=0.0;



     if(foodName =="chicken biriyani"){
            foodPrice=150.43;
      } 

     else if(foodName =="mutton biriyani"){
            foodPrice=200.32;

      } 
     else if(foodName=="chicken curry"){
            foodPrice=250.34;

      } 
     else if(foodName=="fish fry"){
            foodPrice=100.23;

      } 
     else if(foodName=="egg curl"){
            foodPrice=90.34;

      } 
     else if(foodName=="chicken lollipop"){
            foodPrice=320.32;

      } 
     else if(foodName=="chilli chicken "){
            foodPrice=220.34;

      } 

      else if(foodName=="chicken kebab"){
            foodPrice=110.23;

      } 

     else if(foodName=="tandoori chicken "){
            foodPrice=180.32;

      } 

     else if(foodName=="butter chicken "){
            foodPrice=230.32;

      } 
    
    else{
         System.out.println("not available");

}
     return foodPrice;

}


}
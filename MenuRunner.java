class MenuRunner{

     public static void main(String []args){

          Menu amaravathi=new Menu(); 

          amaravathi. checkFoodNameByFoodMenu("masala dosa");
          amaravathi. checkFoodNameByFoodMenu("biriyani");
          amaravathi. checkFoodNameByFoodMenu("idli");
          amaravathi. checkFoodNameByFoodMenu("chapati");
          amaravathi. checkFoodNameByFoodMenu("palav");

          System.out.println("-------------------------");

     double price= amaravathi. checkFoodPriceByFoodName("pori");  
      System.out.println("the price is:"+ price);

      price=amaravathi. checkFoodPriceByFoodName("idli");  
      System.out.println("the price is:"+ price);

      price=amaravathi. checkFoodPriceByFoodName("chapati");  
      System.out.println("the price is:"+ price);

     price=amaravathi. checkFoodPriceByFoodName("dosa");  
      System.out.println("the price is:"+ price);


}

}
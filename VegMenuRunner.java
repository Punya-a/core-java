class VegMenuRunner{

     public static void main(String []args){


         VegMenu udupiVegCorner=new VegMenu();
        udupiVegCorner. chechFoodNameByMenu("palak paneer");
        udupiVegCorner. chechFoodNameByMenu("upma");
        udupiVegCorner. chechFoodNameByMenu("chapati");
        udupiVegCorner. chechFoodNameByMenu("masala dosa");

         System.out.println("-----------------------");




         VegMenu pureVeg=new VegMenu();

        pureVeg. chechFoodNameByMenu("veg Biriyani");
        pureVeg. chechFoodNameByMenu("jeera rice");
        pureVeg. chechFoodNameByMenu("lemon rice");
        pureVeg. chechFoodNameByMenu("vegetable pulao");

         System.out.println("-----------------------");

         VegMenu veggieTreats=new VegMenu();

        veggieTreats. chechFoodNameByMenu("rave dosa");
        veggieTreats. chechFoodNameByMenu("curd rice");
        veggieTreats. chechFoodNameByMenu("palak paneer");
        veggieTreats. chechFoodNameByMenu("veg Biriyani");

         System.out.println("-----------------------");


         VegMenu sriSaiVeg=new VegMenu();

        sriSaiVeg. chechFoodNameByMenu("idli");
        sriSaiVeg. chechFoodNameByMenu("aloo gobi");
        sriSaiVeg. chechFoodNameByMenu("jeera rice");
        sriSaiVeg. chechFoodNameByMenu("rave dosa");

         System.out.println("-----------------------");


         VegMenu greenLeaf=new VegMenu();
        greenLeaf. chechFoodNameByMenu("jeera rice");
        greenLeaf. chechFoodNameByMenu("dal tadka");
        greenLeaf. chechFoodNameByMenu("pongal");
        greenLeaf. chechFoodNameByMenu("palak paneer");

         System.out.println("-----------------------");

         VegMenu greenLeafs=new VegMenu();
         double price=greenLeafs. chechFoodPriceByMenu("pongal");
          System.out.println("the price is:"+ price);
          greenLeafs. chechFoodPriceByMenu("palak paneer");
          System.out.println("the price is:"+ price);

          greenLeafs. chechFoodPriceByMenu("veg biriyani");
          System.out.println("the price is:"+ price);


          greenLeafs. chechFoodPriceByMenu("idli");
          System.out.println("the price is:"+ price);




}


}
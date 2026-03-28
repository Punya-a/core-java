class NonVegMenuRunner{

     public static void main(String []args){


         NonVegMenu meatHouse=new NonVegMenu();
        meatHouse. chechFoodNameByMenu("chicken biriyani");
        meatHouse. chechFoodNameByMenu("chicken 65");
        meatHouse. chechFoodNameByMenu("tandoori chicken");
        meatHouse. chechFoodNameByMenu("chilli chicken ");

         System.out.println("-----------------------");




         NonVegMenu grillPlace=new NonVegMenu();

        grillPlace. chechFoodNameByMenu("mutton biriyani");
        grillPlace. chechFoodNameByMenu("chicken lollipop");
        grillPlace. chechFoodNameByMenu("keema cury");
        grillPlace. chechFoodNameByMenu("chicken curry");

         System.out.println("-----------------------");

         NonVegMenu meatJunction=new NonVegMenu();

        meatJunction. chechFoodNameByMenu("chicken curry");
        meatJunction. chechFoodNameByMenu("chicken lollipop");
        meatJunction. chechFoodNameByMenu("mutton biriyani");
        meatJunction. chechFoodNameByMenu("frilled fish");

         System.out.println("-----------------------");


         NonVegMenu royalNonVeg=new NonVegMenu();

        royalNonVeg. chechFoodNameByMenu("fish fry");
        royalNonVeg. chechFoodNameByMenu("hicken fried rice");
        royalNonVeg. chechFoodNameByMenu("egg curl");
        royalNonVeg. chechFoodNameByMenu("rchicken biriyani");

         System.out.println("-----------------------");


         NonVegMenu chickenCorner=new NonVegMenu();
        chickenCorner. chechFoodNameByMenu("chicken kebab");
        chickenCorner. chechFoodNameByMenu("fish fry");
        chickenCorner. chechFoodNameByMenu("chicken tikka");
        chickenCorner. chechFoodNameByMenu("egg curl");

         System.out.println("-----------------------");

         NonVegMenu chickenCornerr=new NonVegMenu();
         double price=chickenCornerr. chechFoodPriceByMenu("egg curl");
         System.out.println("the price is:"+price);

         chickenCornerr. chechFoodPriceByMenu("chicken kebab");
         System.out.println("the price is:"+price);


         chickenCornerr. chechFoodPriceByMenu("fish fry");
         System.out.println("the price is:"+price);


         chickenCornerr. chechFoodPriceByMenu("chicken biriyani");
         System.out.println("the price is:"+price);





}


}
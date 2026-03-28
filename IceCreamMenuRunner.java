class IceCreamMenuRunner{

     public static void main(String []args){


        IceCreamMenu creamyDelight=new IceCreamMenu();
        creamyDelight. checkIceCreamNameByMenu("strawberry ice cream");
        creamyDelight. checkIceCreamNameByMenu("falooda ice cream");
        creamyDelight. checkIceCreamNameByMenu("pista ice cream");
        creamyDelight. checkIceCreamNameByMenu("rabdi ice cream");

         System.out.println("-----------------------");




        IceCreamMenu coolCraving=new IceCreamMenu();

        coolCraving. checkIceCreamNameByMenu("cookies ice cream");
        coolCraving. checkIceCreamNameByMenu("vanilla ice cream");
        coolCraving. checkIceCreamNameByMenu("black currant ice cream");
        coolCraving. checkIceCreamNameByMenu("mango ice cream");

         System.out.println("-----------------------");

        IceCreamMenu iceCreamHub=new IceCreamMenu();

        iceCreamHub. checkIceCreamNameByMenu("rocket road ice cream");
        iceCreamHub. checkIceCreamNameByMenu("butterscotch ice cream");
        iceCreamHub. checkIceCreamNameByMenu("bubblegum ice cream");
        iceCreamHub. checkIceCreamNameByMenu("kesar ice cream");

         System.out.println("-----------------------");


        IceCreamMenu frozenTreat=new IceCreamMenu();

        frozenTreat. checkIceCreamNameByMenu("pista ice cream ");
        frozenTreat. checkIceCreamNameByMenu("chocolate ice cream");
        frozenTreat. checkIceCreamNameByMenu(" mango ice cream");
        frozenTreat. checkIceCreamNameByMenu("mint chocolate ice cream");

         System.out.println("-----------------------");


        IceCreamMenu sweetScoops=new IceCreamMenu();
        sweetScoops. checkIceCreamNameByMenu("vanilla ice cream");
        sweetScoops. checkIceCreamNameByMenu("chocolate dip ice cream");
        sweetScoops. checkIceCreamNameByMenu("butterscotch ice cream");
        sweetScoops. checkIceCreamNameByMenu("strawberry ice cream");

         System.out.println("-----------------------");

        IceCreamMenu sweetScoop=new IceCreamMenu();
        double price = sweetScoop. checkIceCreamPriceByMenu("strawberry ice cream");
        System.out.println("the price is:"+price);
        sweetScoop. checkIceCreamPriceByMenu("vanilla ice cream");
        System.out.println("the price is:"+price);

        sweetScoop. checkIceCreamPriceByMenu("butterscotch ice cream");
        System.out.println("the price is:"+price);


        sweetScoop. checkIceCreamPriceByMenu("mango ice cream");
        System.out.println("the price is:"+price);






}


}
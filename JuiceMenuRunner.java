class JuiceMenuRunner{

     public static void main(String []args){


         JuiceMenu freshSqueeze=new JuiceMenu();
        freshSqueeze. cheackJuiceNameByMenu("buttermilk");
        freshSqueeze. cheackJuiceNameByMenu("orange juice ");
        freshSqueeze. cheackJuiceNameByMenu("apple juice");
        freshSqueeze. cheackJuiceNameByMenu("papaya juice ");

         System.out.println("-----------------------");




        JuiceMenu natureSip=new JuiceMenu();

        natureSip. cheackJuiceNameByMenu("mango juice");
        natureSip. cheackJuiceNameByMenu("lassi");
        natureSip. cheackJuiceNameByMenu("pineapple juice ");
        natureSip. cheackJuiceNameByMenu("grape juice ");

         System.out.println("-----------------------");

        JuiceMenu fruityTwist=new JuiceMenu();

        fruityTwist. cheackJuiceNameByMenu("chiknoo shake");
        fruityTwist. cheackJuiceNameByMenu("watermelon juice");
        fruityTwist. cheackJuiceNameByMenu("grape juice ");
        fruityTwist. cheackJuiceNameByMenu("lemon juice");

         System.out.println("-----------------------");


        JuiceMenu greenDrop=new JuiceMenu();

        greenDrop. cheackJuiceNameByMenu("badam milk");
        greenDrop. cheackJuiceNameByMenu("papaya juice ");
        greenDrop. cheackJuiceNameByMenu("apple juice");
        greenDrop. cheackJuiceNameByMenu("banana shake");

         System.out.println("-----------------------");


        JuiceMenu juiceJunction=new JuiceMenu();
        juiceJunction. cheackJuiceNameByMenu("pomegranate juice ");
        juiceJunction. cheackJuiceNameByMenu("rose milk");
        juiceJunction. cheackJuiceNameByMenu("fruit punch ");
        juiceJunction. cheackJuiceNameByMenu("buttermilk ");

         System.out.println("-----------------------");

        JuiceMenu juiceJunctions=new JuiceMenu();
        double price=juiceJunctions. cheackJuicePriceByMenu("buttermilk");
        System.out.println("the price is:"+price );

        juiceJunctions. cheackJuicePriceByMenu("fruit punch");
        System.out.println("the price is:"+price );

        juiceJunctions. cheackJuicePriceByMenu("banana shake");
        System.out.println("the price is:"+price );

        juiceJunctions. cheackJuicePriceByMenu("apple juice");
        System.out.println("the price is:"+price );





}


}
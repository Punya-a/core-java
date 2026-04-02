class FlipkartRunner{

    public static void main (String[]args){

   Amazon flipkartApp=new Amazon();

     boolean login= flipkartApp.login("punya A","punya@123");
     System.out.println(login);

     System.out.println("--------------------");

     String  verify= flipkartApp.login(9353261939l,354678);
     System.out.println(verify);

     System.out.println("--------------------");

     String find= flipkartApp.search("watch");
      System.out.println(find);

     System.out.println("--------------------");

     String reduction= flipkartApp.search("watch",32.32);
      System.out.println(reduction);


     System.out.println("--------------------");

     String result = flipkartApp.search("watch","boat","color");
      System.out.println(result);

     System.out.println("--------------------");


   String  lengh= flipkartApp.search("watch",30);
      System.out.println(lengh);


     System.out.println("--------------------");

   String  guarantee = flipkartApp.search("watch",2);
      System.out.println(guarantee);



}


}

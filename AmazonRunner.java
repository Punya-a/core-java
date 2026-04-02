class AmazonRunner{

    public static void main (String[]args){

   Amazon amazonApp=new Amazon();

     boolean login= amazonApp.login("Punya A","punya@123");
     System.out.println(login);

     System.out.println("--------------------");

     String verify= amazonApp.login(9353261939l,354678);
     System.out.println(verify);

     System.out.println("--------------------");

     String msg= amazonApp.search("smart phone");
     System.out.println(msg);

     System.out.println("--------------------");
      
     String result= amazonApp.search("AirPods","oppo");
     System.out.println(result);



     System.out.println("--------------------");
     String results= amazonApp.search("mobile","vivo","gold color");
     System.out.println(results);



     System.out.println("--------------------");
   String  value= amazonApp.search("headset",180000);
     System.out.println(value);



     System.out.println("--------------------");
    String  isRating= amazonApp.search("television ",4.5f);
     System.out.println(isRating);



}

}
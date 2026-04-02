class SwiggyRunner{

    public static void main (String[]args){

   Amazon swiggyApp=new Amazon();

     boolean login= swiggyApp.login("Punya A","punya@123");
     System.out.println(login);

     System.out.println("--------------------");

     String  verify= swiggyApp.login(9353261939l,354678);
     System.out.println(verify);

     System.out.println("--------------------");
 
     String name= swiggyApp.search("Dosa");
     System.out.println(name);
     System.out.println("--------------------");

     String order = swiggyApp.search("pizza","domino's ");
     System.out.println(order);
     System.out.println("--------------------");


     String variety = swiggyApp.search("pizza","domino","italics");
     System.out.println(variety );
     System.out.println("--------------------");


     String amount = swiggyApp.search("Dosa",200.0);
     System.out.println(amount);
     System.out.println("--------------------");


     String review = swiggyApp.search("Dosa",3.4f);
     System.out.println(review );
     System.out.println("--------------------");
}

}


     
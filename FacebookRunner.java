class FacebookRunner{

    public static void main(String []args){

   System.out.println("-----First Time Method Call----");
   String status= Facebook. Registered(20,"31-10-2005","abcd1234","Punya A","punya_A");
   System.out.println("main method Status:"+status);


   System.out.println("-----Second Time Method Call----");
   boolean result= Facebook. validateRegisterFields(20,"31-10-2005","abcd1234","Punya A","punya_A");
   System.out.println("main method Status:"+result);

  


}


}
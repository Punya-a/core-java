class LinkedInRunner{

    public static void main(String []args){

   System.out.println("-----First Time Method Call----");
   String status= LinkedIn. register("abcd1234","Punya A","punya_A","present");
   System.out.println("main method Status:"+status);

    System.out.println("-----Second Time Method Call----");
  boolean result= LinkedIn. validateRegisterFields ("abcd1234","Punya A","punya_A","present");
   System.out.println("main method result:"+result);
  


}


}
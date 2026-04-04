class SnapchatRunner{

    public static void main(String []args){

   System.out.println("-----First Time Method Call----");
   String status= Snapchat. createAccount (9353261939l,"abcd@gmail.com","abcd1234","Punya A");
   System.out.println("main method Status:"+status);

   System.out.println("-----First Time Method Call----");
   boolean result= Snapchat. validateRegisterFields (9353261939l,"abcd@gmail.com","abcd1234","Punya A");
   System.out.println("main method Status:"+result);
  


}


}
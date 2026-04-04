class TwitterRunner{

    public static void main(String []args){

   System.out.println("-----First Time Method Call----");
   String status= Twitter . createAccount(9353261939l,"31-10-2005","abcd1234","Punya A",20);
   System.out.println("main method Status:"+status);

    System.out.println("-----second Time Method Call----");
   boolean result= Twitter . validateRegisterFields (9353261939l,"31-10-2005","abcd1234","Punya A",20);
   System.out.println("main method Status:"+result);



}


}
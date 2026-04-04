class InstagramRunner{

    public static void main(String []args){

   System.out.println("-----First Time Method Call----");
   String status= Instagram . validateAndRegister(9353261939l,"31-10-2005","abcd1234","Punya A","punya_A");
   System.out.println("main method Status:"+status);

  
   System.out.println("-----First Time Method Call----");
   boolean result= Instagram . validateRegisterFields(9353261939l,"31-10-2005","abcd1234","Punya A","punya_A");
System.out.println("main method Status:"+result);


}


}
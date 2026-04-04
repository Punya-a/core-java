class YouTube{

    public static String createAccount(long phoneNumber,String birthday,String psw ,String fullName,String email ){
    System.out.println("createAccount method is started");

    String login=null;


   if(phoneNumber!=0 && birthday!=null && psw!=null && fullName!=null && email!=null){
          if (psw. length ()>6 && fullName. length ()>4 && email. length () >4) {
               login="Thank You "+fullName+" Registered successfully";
        }else{
               login="Please check the Length Of PSW , FullName , email";
}
   }else{
      login="Please enter the Valide Data ";
}
 
   System.out.println("createAccount method is Ended");  

   return login;

}

public static boolean validateRegisterFields (long phoneNumber,String birthday ,String psw ,String fullName,String email){
System.out.println("validateRegisterFields is started");
boolean isValidate=false;

if (phoneNumber!=0) {
isValidate=true;
}

if (birthday !=null){
isValidate=true;
}

if(psw!=null){
isValidate=true;
}

if (fullName!= null) {
isValidate=true;
}

if (email!= null) {
isValidate=true;
}


System. out.println("validateRegisterFields is ended");
return isValidate;


}


}
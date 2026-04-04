class Netflix {

    public static String registration (long phoneNumber,String email,String psw ,String fullName){
    System.out.println("registration  method is started");

    String login=null;


   if(phoneNumber!=0 && email!=null && psw!=null && fullName!=null ){
          if (psw. length ()>6 && fullName. length ()>4) {
               login="Thank You "+fullName+" login successfully";
        }else{
               login ="Please check the Length Of PSW , FullName";
}
   }else{
      login ="Please enter the Valide Data ";
}
 
   System.out.println("registration method is Ended");  

   return login;

}
public static boolean validateRegisterFields (long phoneNumber,String email,String psw ,String fullName,String address){
System.out.println("validateRegisterFields is started");
boolean isValidate=false;

if (phoneNumber!=0) {
isValidate=true;
}

if (email!=null){
isValidate=true;
}

if(psw!=null){
isValidate=true;
}

if (fullName!= null) {
isValidate=true;
}


System. out.println("validateRegisterFields is ended");
return isValidate;


}


}
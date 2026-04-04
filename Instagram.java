class Instagram{

    public static String validateAndRegister(long phoneNumber,String birthday,String psw ,String fullName,String userName){
    System.out.println("validateAndRegister method is started");

    String registration=null;


   if(phoneNumber!=0 && birthday!=null && psw!=null && fullName!=null && userName!=null){
          if (psw. length ()>6 && fullName. length ()>4 && userName. length () >4) {
               registration ="Thank You "+fullName+" Registered successfully";
        }else{
               registration ="Please check the Length Of PSW , FullName , User Name";
}
   }else{
      registration  ="Please enter the Valide Data ";
}
 
   System.out.println("validateAndRegister method is Ended");  

   return registration;

}


public static boolean validateRegisterFields (long phoneNumber,String birthday ,String psw ,String fullName,String userName){
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

if (userName!= null){
isValidate=true;
}

System. out.println("validateRegisterFields is ended");
return isValidate;
}




}
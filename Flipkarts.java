class Flipkarts{

    public static String registerUser (long phoneNumber,String email,String psw ,String fullName,String address){
    System.out.println("registerUser  method is started");

    String result=null;


   if(phoneNumber!=0 && email!=null && psw!=null && fullName!=null && address!=null){
          if (psw. length ()>6 && fullName. length ()>4) {
               result ="Thank You "+fullName+" login successfully";
        }else{
               result ="Please check the Length Of PSW , FullName";
}
   }else{
      result ="Please enter the Valide Data ";
}
 
   System.out.println("registerUser method is Ended");  

   return result;

}

public static boolean validateRegisterFields (long phoneNumber,String email, String psw ,String fullName,String address){
System.out.println("validateRegisterFields is started");
boolean isValidate=false;

if (phoneNumber!=0) {
isValidate=true;
}

if (email!=null){=
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
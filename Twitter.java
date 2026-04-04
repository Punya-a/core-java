class Twitter{

    public static String createAccount(long phoneNumber,String birthday,String psw ,String name,int verifCode){
    System.out.println("createAccount method is started");

    String registration=null;


   if(phoneNumber!=0 && birthday!=null && psw!=null && name!=null && verifCode!=0){
          if (psw. length ()>6 && name. length ()>4 ) {
               registration ="Thank You "+name+" Registered successfully";
        }else{
               registration ="Please check the Length Of PSW , name ";
}
   }else{
      registration  ="Please enter the Valid Data ";
}
 
   System.out.println("createAccount method is Ended");  

   return registration;

}


public static boolean validateRegisterFields (long phoneNumber,String birthday ,String psw ,String name, int verifCode){
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

if (name!= null) {
isValidate=true;
}

if (verifCode!= 0) {
isValidate=true;
}



System. out.println("validateRegisterFields is ended");
return isValidate;



}


}
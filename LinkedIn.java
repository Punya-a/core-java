class LinkedIn{

    public static String register(String psw ,String firstName,String lastName,String location){
    System.out.println("Register method is started");

    String result=null;


   if( psw!=null && firstName!=null && lastName!=null && location!=null){
          if (psw. length ()>6 && firstName. length ()>4 && lastName. length () >4) {
               result ="Thank You "+firstName+" Registered successfully";
        }else{
               result="Please check the Length Of PSW , FirstName , last Name";
}
   }else{
      result  ="Please enter the Valide Data ";
}
 
   System.out.println("register method is Ended");  

   return result;

}

public static boolean validateRegisterFields (String psw ,String firstName ,String lastName, String location){
System.out.println("validateRegisterFields is started");
boolean isValidate=false;

if (psw!=null) {
isValidate=true;
}

if (firstName !=null){
isValidate=true;
}

if(lastName!=null){
isValidate=true;
}

if (location!= null) {
isValidate=true;
}


System. out.println("validateRegisterFields is ended");
return isValidate;

}

}
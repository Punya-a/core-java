class Facebook{

    public static String Registered(int age,String email,String psw ,String fullName,String userName){
    System.out.println("Registered method is started");

    String result=null;


   if(age !=0 && email!=null && psw!=null && fullName!=null && userName!=null){
          if (psw. length ()>6 && fullName. length ()>4 && userName. length () >4) {
               result ="Thank You "+fullName+" Registered successfully";
        }else{
               result ="Please check the Length Of PSW , FullName , User Name";
}
   }else{
      result ="Please enter the Valid Data ";
}
 
   System.out.println("Registered method is Ended");  

   return result;

}

public static boolean validateRegisterFields (int age,String email,String psw ,String fullName,String userName){
System.out.println("validateRegisterFields is started");
boolean isValidate=false;

if (age!=0) {
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
if(userName!=null){
isValidate=true;
}


System. out.println("validateRegisterFields is ended");
return isValidate;


}



}
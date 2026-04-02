class Flipkart{

    public boolean login(String userName, String psw){
        System.out.println("Invoking login using userName:" + userName + " and psw:"+psw);
   
        String regUsername="Punya A"
        String regpsw="punya@123;"
       boolean isLogin=false;

       if(userName == regUsername && psw == regpsw){

          isLogin=true;
}else{

     isLogin=false;

}
    return isLogin;  

}

    public String  login(long phoneNumber, int otp){
        System.out.println("Invoking login using phoneNumber:" + phoneNumber + " and otp:"+otp);

       long regphoneNumber =9353261939l;
       int regOtp=354678;
       String  valid=null;

       if(phoneNumber == regphoneNumber && otp == regOtp){

          valid="login Successfully ";
}else{

     valid='login failure ";

}
    return valid;  

}

    
  public String search(String itemName){
        System.out.println("Invoking a search itemName:"+ itemName);

        String message=null;
        if(itemName!=null){

           message="Searched itemName:"+ itemName +" is available";
    }

      return message;

}
public String search(String itemName ,double  discount ){
        System.out.println("Invoking a search itemName:"+ itemName +" and discount:"+ discount);

        String message=null;

        if(itemName!=null && discount!=0.0){
           message="Searched itemName:"+ itemName +" and discount:"+ discount +" is available ";
}

      return message;

}
public String search(String productName,String brandName ,String color){
        System.out.println("Invoking a search productName:"+ productName +" and brandName:"+ brandName+" andcolor:"+color);

        String message=null;
           message="Searched productName:"+ productName +" and brandName:"+ brandName +" andcolor: "+color;

      return message;

}

public String   search(String productName,int size){
        System.out.println("Invoking a search productName:"+ productName +" and size:"+ size);

   String sizes=null;

        if(productName!=null && size!=0){
      sizes="Searched productName:"+ productName +" and size:"+size ;
}

      return sizes;

}

        public String  search(String itemName,short warranty ){
        System.out.println("Invoking a search itemName:"+ itemName +" and warranty:"+ warranty);

   String  assurance =null;

        if(productName!=null && warranty!=0){
            assurance= warranty;
         
}

      return assurance;

}





}
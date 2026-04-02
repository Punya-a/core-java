class Amazon{

   public boolean login(String userName, String psw){
        System.out.println("Invoking login using userName :" +userName+ " and psw:"+psw);

        String regUserName="Punya A";
        String regPsw="punya@123";
        boolean isLogin=false;

       if(userName == regUserName && psw == regPsw){

          isLogin=true;
}else{

     isLogin=false;

}
    return isLogin;  

}

public String login(long phoneNumber, int otp){
        System.out.println("Invoking login using phoneNumber:" + phoneNumber + " and otp:"+otp);

       long regphoneNumber =9353261939l;
       int regOtp=354678;
        String isLogin=null;

       if(phoneNumber == regphoneNumber && otp == regOtp){

          isLogin="Login successfully ";
}else{

     isLogin="Login Failure";

}
    return isLogin;  

}

  public String search(String productName){
        System.out.println("Invoking a search productName:"+ productName);

        String message=null;
        if(productName!=null){

           message="Searched movie name:"+ productName +" is available";
    }

      return message;

}
public String search(String productName,String brandName){
        System.out.println("Invoking a search productName:"+ productName +" and brandName:"+ brandName);

        String message=null;

        if(productName!=null && brandName!=null){
           message="Searched productName:"+ productName +" and brandName:"+ brandName +" is available ";
}

      return message;

}
public String search(String productName,String brandName,String color){
        System.out.println("Invoking a search productName:"+ productName +" and brandName:"+ brandName+" and color:"+color);

        String message=null;
           message="Searched productName:"+ productName +" and brandName:"+ brandName +" and color: "+color;

      return message;

}

public String  search(String productName,double price){
        System.out.println("Invoking a search productName:"+ productName +" and price:"+ price);

     String msg=null;

        if(productName!=null && price!=0.0){
          msg="Searched productName:"+ productName +" and price:"+price;
}

      return msg;

}

        public String  search(String productName,float rating  ){
        System.out.println("Invoking a search productName:"+ productName +" and rating:"+ rating);

     String  review=null;

        if(productName!=null && rating!=0.0f){
         review="Searched productName:"+ productName +" and rating :"+ rating ;

}

      return review;

}



}


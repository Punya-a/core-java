class Swiggy{

     public boolean login(String userName, String psw){
        System.out.println("Invoking login using userName:" + userName + " and psw:"+psw);
   
        String regUsername="punya"
        String regpsw="abc@123;"
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

    public String search(String foodName){
        System.out.println("Invoking a search foodName:"+ foodName);

        String message=null;
        if(foodName!=null){

           message="Searched foodName:"+ foodName +" is available";
    }

      return message;
}


   public String search(String foodName,String restaurantName ){
        System.out.println("Invoking a search foodName:"+ foodName +" and restaurantName:"+ restaurantName);

        String message=null;

        if(foodName!=null && restaurantName!=null){
           message="Searched foodName:"+ foodName +" and restaurantName:"+ restaurantName +" is available ";
}

      return message;
}


    public String search(String foodName,String restaurantName ,String category ){
        System.out.println("Invoking a search foodName:"+ foodName +" and restaurantName:"+ restaurantName +"and category:"+ category);

        String message=null;
           message="Searched foodName:"+ foodName +" and restaurantName:"+ restaurantName +"and category: "+ category;

      return message;

}

    public String search(String foodName,double  price ){
        System.out.println("Invoking a search foodName:"+ foodName +" and price:"+ price);

        String message=null;

        if(itemName!=null && price!=0.0f){
           message="Searched foodName:"+ foodName +" and price:"+ price +" is available ";
}

      return message;

}

    public String search(String foodName,float rating  ){
        System.out.println("Invoking a search foodName:"+ foodName +" and rating:"+rating );

        String message=null;

        if(itemName!=null && rating!=0.0f){
           message="Searched foodName:"+ foodName +" and rating :"+rating ;
}

      return message;

}

}
class ChatsMenu{

    public void getMenuDetails (){

     System.out.println("invoking  a method ");

}

//    System.out.println("invoking  a method ");


    public String  checkChatsNameByMenu(String chatName){

   System.out.println("invoking checkChatsNameByMenu ");

     String chatsName=null;

     if(chatName =="pani puri"){
         chatsName="Availability ";

      } 

     else if(chatName =="bhel puri"){
         chatsName="Availability ";


      } 
     else if(chatName =="aloo chat"){
         chatsName="Availability ";


      } 
     else if(chatName =="noodle "){
         chatsName="Availability ";


      } 
     else if(chatName =="gobi manchoori"){
         chatsName="Availability ";


      } 
     else if(chatName =="dahi vada"){
         chatsName="Availability ";

      } 
     else if(chatName =="masala puri"){
         chatsName="Availability ";

      } 

      else if(chatName =="paneer chat"){
         chatsName="Availability ";

      } 

     else if(chatName =="kachori"){
         chatsName="Availability ";

      } 

     else if(chatName =="vada pav"){
         chatsName="Availability ";

      } 
    
    else{
        System.out.println("not Availability ");


}
      return chatsName;

}

  public double checkChatsPriceByMenu(String chatName){

   System.out.println("invoking checkChatsNameByMenu and chats name:"+ chatName);
   double chatPrice=0.0;


     if(chatName =="pani puri"){
           chatPrice=20.3; 
      } 

     else if(chatName =="bhel puri"){
          chatPrice=60.3;
      } 
     else if(chatName =="aloo chat"){
          chatPrice=45.65;

      } 
     else if(chatName =="noodle "){
          chatPrice=99.56;

      } 
     else if(chatName =="gobi manchoori"){
          chatPrice=65.55;

      } 
     else if(chatName =="dahi vada"){
          chatPrice=55.45;

      } 
     else if(chatName =="masala puri"){
          chatPrice=27.54;

      } 

      else if(chatName =="paneer chat"){
          chatPrice=65.34;

      } 

     else if(chatName =="kachori"){
          chatPrice=80.34;

      } 

     else if(chatName =="vada pav"){
          chatPrice=50.43;

      } 
    
    else{
          System.out.println("not available ");

}
       return chatPrice;

}


}
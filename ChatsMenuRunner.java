class ChatsMenuRunner{

     public static void main(String []args){


        ChatsMenu chatSpot=new ChatsMenu();
        String name=chatSpot. checkChatsNameByMenu("egg roll");
       System.out.println("the food is :"+name);

        chatSpot. checkChatsNameByMenu("pani puri");
      System.out.println("the food is :"+name);

        chatSpot. checkChatsNameByMenu("masala puri");
        System.out.println("the food is :"+name);

        chatSpot. checkChatsNameByMenu("onion pakoda");
        System.out.println("the food is :"+name);


         System.out.println("-----------------------");




         ChatsMenu royalChat=new ChatsMenu();

        royalChat. checkChatsNameByMenu("kachori");
        royalChat. checkChatsNameByMenu("pani puri");
        royalChat. checkChatsNameByMenu("bread potato");
        royalChat. checkChatsNameByMenu("paneer chat");

         System.out.println("-----------------------");

         ChatsMenu chatJunction=new ChatsMenu();

       chatJunction. checkChatsNameByMenu("vada pav");
       chatJunction. checkChatsNameByMenu("jalebi");
       chatJunction. checkChatsNameByMenu("bhel puri");
       chatJunction. checkChatsNameByMenu("kachori");

         System.out.println("-----------------------");


         ChatsMenu chatFactory=new ChatsMenu();

        chatFactory. checkChatsNameByMenu("dahi vada");
        chatFactory. checkChatsNameByMenu("sev puri");
        chatFactory. checkChatsNameByMenu("gobi manchoori");
        chatFactory. checkChatsNameByMenu("momos");

         System.out.println("-----------------------");


         ChatsMenu chatHub=new ChatsMenu();
        chatHub. checkChatsNameByMenu("noodle");
        chatHub. checkChatsNameByMenu("pav bajji");
        chatHub. checkChatsNameByMenu("aloo chat");
        chatHub. checkChatsNameByMenu("vada pav");

         System.out.println("-----------------------");

         ChatsMenu chatsHub=new ChatsMenu();

        double price =chatsHub. checkChatsPriceByMenu("noodle");
        System.out.println("the price is:"+price);

        chatsHub. checkChatsPriceByMenu("dahi vada");
        System.out.println("the price is:"+price);      

        chatsHub. checkChatsPriceByMenu("aloo chat");
        System.out.println("the price is:"+price);

        chatsHub. checkChatsPriceByMenu("vada pav");
        System.out.println("the price is:"+price);



}


}
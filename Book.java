class Book{

   String isBn;
   String title;
   String author;
   double price;
   int pages;
   String genre;
   static String library ="city library ";

   public Book(){

}

  public Book(String isBn,String title,String author,double price,int pages,String genre){
  
      this. isBn= isBn;        
      this. title= title;
      this. author= author;
      this. price= price;
      this. pages= pages;
      this. genre= genre;

}

   public void displayDetails(){
           System.out.println("Invoking a displayDetails method");
           System.out.println("The isBn is:"+ isBn);
           System.out.println("the title is :"+ title);
           System.out.println("author name is:"+ author);
           System.out.println("The price :"+ price);
           System.out.println("The number of pages:"+ pages);
           System.out.println("The genre:"+ genre);
           System.out.println("Available in the library:"+ library);

}



}
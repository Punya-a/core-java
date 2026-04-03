class BookRunner{

   public static void main(String [] args){

   Book book1=new Book("ISBN1234","java","James",500,300,"programming ");
   book1.displayDetails();
   System.out.println("------------------");

   Book book2=new Book("ISBN187","pythons ","guido",400,250,"programming ");
   book2.displayDetails();
   System.out.println("------------------");

   Book book3=new Book("ISBN9786","C+","Bjarne",450,463,"programming ");
   book3.displayDetails();
   System.out.println("------------------");

   Book book4=new Book("ISBN3575","DBMS","navathe",550,450,"education ");
   book4.displayDetails();
   System.out.println("------------------");

   Book book5=new Book("ISBN1767","math","Rd Sharma",547,87,"education ");
   book5.displayDetails();
   System.out.println("------------------");

   Book book6=new Book("ISBN97564","OS","Galvin",600,450,"educational ");
   book6.displayDetails();
   System.out.println("------------------");

   Book book7=new Book("ISBN8523","English ","wren",250,150,"grammar");
   book7.displayDetails();
   System.out.println("------------------");

   Book book8=new Book("ISBN1765","physicas","hc versa",500,350,"science ");
   book8.displayDetails();
   System.out.println("------------------");

   Book book9=new Book("ISBN1254","chemistries ","op Tandon",450,654,"science ");
   book9.displayDetails();
   System.out.println("------------------");

   Book book10=new Book("ISBN1864","biology ","Truman",400,280,"science ");
   book10.displayDetails();
   System.out.println("------------------");



}

}
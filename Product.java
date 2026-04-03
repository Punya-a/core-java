class Product{

    String productCode;
    String name;
    double price;
    String category;
    int quantity;
    String brand;
    static String store= "Flipkart";

   public Product(){

}
 
    public Product(String productCode,String name,double price,String category,int quantity,String brand){

      this. productCode= productCode;         
      this. name= name;
      this. price= price;
      this. category= category;
      this. quantity= quantity;
      this. brand= brand;


}
  public void displayDetails(){

       System.out.println("invoking a method ");
       System.out.println("product Code:"+ productCode);
       System.out.println("name is:"+ name);
       System.out.println("the price is:"+ price);
       System.out.println("category:"+ category);
       System.out.println("quantity:"+ quantity);
       System.out.println("the  brand name is:"+ brand);
       System.out.println("store:"+ store);

 }
 
}
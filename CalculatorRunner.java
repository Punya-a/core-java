class CalculatorRunner{

   public static void main(String []args){

      Calculator addition =new Calculator();

      int result=addition.add(2,3);
       System.out.println(result);
      result=addition.add(8,6);
       System.out.println(result);

      result=addition.add(7,3,4);
       System.out.println(result);
      result=addition.add(8,6,3);
       System.out.println(result);

      result=addition.add(3,8,2,4);
       System.out.println(result);
      result=addition.add(8,4,6,4);
       System.out.println(result);

      result=addition.add(2,5,9,8,6);
       System.out.println(result);
      result=addition.add(8,7,9,3,6);
       System.out.println(result);

      result=addition.add(8,7,3,5,6,6);
       System.out.println(result);
      result=addition.add(2,4,7,5,8,6);
       System.out.println(result);

      result=addition.add(8,7,0,3,5,7,6);
       System.out.println(result);
      result=addition.add(8,6,8,3,4,5,7);
       System.out.println(result);


      result=addition.add(6,9,4,7,3,8,6,2);
       System.out.println(result);
      result=addition.add(8,7,9,5,3,1,6,5);
       System.out.println(result);

      result=addition.add(8,6,1,2,3,4,5,2,3);
       System.out.println(result);
      result=addition.add(8,1,9,2,7,5,7,8,6);
       System.out.println(result);

      result=addition.add(8,1,2,3,4,5,6,7,8,6);
       System.out.println(result);
      result=addition.add(8,9,8,7,6,9,7,3,4,6);
       System.out.println(result);

      result=addition.add(8,1,2,3,4,5,6,7,1,2,6);
       System.out.println(result);
      result=addition.add(8,9,8,7,6,5,6,7,8,9,6);
       System.out.println(result);

     System.out.println("----------------");

     Calculator subtraction =new Calculator();

    int results= subtraction.sub(8,5);
       System.out.println(results);
    results= subtraction.sub(9,7);
       System.out.println(results);

    results= subtraction.sub(9,6,4);
       System.out.println(results);  
    results= subtraction.sub(17,9,2);
       System.out.println(results);

    results= subtraction.sub(29,7,5,3);
       System.out.println(results);
    results= subtraction.sub(18,6,4,2);
       System.out.println(results);

    results= subtraction.sub(39,7,8,3,7);
       System.out.println(results);
    results= subtraction.sub(29,3,7,4,6);
       System.out.println(results);

    results= subtraction.sub(46,8,3,4,5,1);
       System.out.println(results);
    results= subtraction.sub(39,6,4,7,2,5);
       System.out.println(results);


    results= subtraction.sub(49,6,8,5,3,8,4);
       System.out.println(results);
    results= subtraction.sub(59,7,4,6,4,3,8);
       System.out.println(results);


    results= subtraction.sub(59,7,9,6,8,2,5,7);
       System.out.println(results);
    results= subtraction.sub(58,6,3,8,5,6,3,2);
       System.out.println(results);


    results= subtraction.sub(74,5,3,9,8,7,8,6,7);
       System.out.println(results);
    results= subtraction.sub(64,9,6,5,4,2,5,1,2);
       System.out.println(results);


    results= subtraction.sub(81,4,9,8,7,9,8,9,4,3);
       System.out.println(results);
    results= subtraction.sub(99,5,7,3,7,4,7,6,9,3);
       System.out.println(results);

    results= subtraction.sub(71,2,3,5,4,6,5,4,5,3,4);
       System.out.println(results);
    results= subtraction.sub(94,5,3,5,6,3,5,3,6,5,5);
       System.out.println(results);

     System.out.println("----------------");


     Calculator multiplication =new Calculator();

    int product= multiplication.mul(2,3);
       System.out.println(product);
     product=multiplication.mul(3,4);
       System.out.println(product);

    product= multiplication.mul(6,8,43);
       System.out.println(product);
     product=multiplication.mul(7,6,4);
       System.out.println(product);


    product= multiplication.mul(8,5,67,2);
       System.out.println(product);
    product= multiplication.mul(7,5,3,4);
       System.out.println(product);


    product= multiplication.mul(5,8,9,2,4);
       System.out.println(product);
     product=multiplication.mul(2,6,8,4,3);
       System.out.println(product);


    product= multiplication.mul(8,6,3,9,6,8);
       System.out.println(product);
     product=multiplication.mul(6,8,34,8,6,9);
       System.out.println(product);


    product= multiplication.mul(5,3,6,4,7,2,4);
       System.out.println(product);
    product= multiplication.mul(8,6,4,6,5,2,3);
       System.out.println(product);


    product= multiplication.mul(7,4,3,5,6,7,8,4);
       System.out.println(product);
    product= multiplication.mul(8,7,5,9,3,2,6,5);
       System.out.println(product);


    product= multiplication.mul(1,4,3,5,2,5,8,9,3);
       System.out.println(product);
     product=multiplication.mul(7,8,4,9,6,5,9,3,7);
       System.out.println(product);


    product= multiplication.mul(9,7,8,4,5,3,4,5,2,4);
       System.out.println(product);
     product=multiplication.mul(1,5,8,9,5,4,6,4,3,5);
       System.out.println(product);


    product= multiplication.mul(1,4,2,5,6,4,3,4,2,5,6);
       System.out.println(product);
    product= multiplication.mul(1,2,3,2,3,2,3,2,3,5,4);
       System.out.println(product);







  }

}
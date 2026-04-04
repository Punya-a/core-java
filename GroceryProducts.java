class GroceryProducts {

    static float productWeights[] = {
        0.5f, 1.0f, 2.0f, 0.75f, 1.25f,
        0.6f, 1.5f, 0.9f, 1.8f, 2.5f,
        1.1f, 0.8f, 1.3f, 2.2f, 1.6f
    };

    static double productPrices[] = {
        45.50, 120.75, 200.60, 85.40, 150.80,
        60.30, 180.25, 95.60, 220.40, 250.10,
        130.50, 70.20, 160.35, 240.80, 175.60
    };

    static char productQuality[] = {
        'A','B','C','A','B',
        'A','C','B','A','C',
        'B','A','B','C','A'
    };

    static String productNames[] = {
        "Rice","Sugar","Wheat","Salt","Oil",
        "Milk","Butter","Cheese","Spices","Tea",
        "Coffee","Flour","Pulses","Honey","Jam"
    };

    public static void main(String[] args) {

        System.out.println("Product Weights (kg):");
        for(int i = 0; i < 15; i++) {
          if(i%2!=0){
            System.out.println(productWeights[i]);
        }
}
      System.out.println();
       

        System.out.println("\nProduct Prices (INR):");
        for(int i = 0; i < 15; i++) {
          if(i%2!=0){
            System.out.println(productPrices[i]);
        }
}

        System.out.println("\nProduct Quality Grades:");
        for(int i = 0; i < 15; i++) {
          if(i%2!=0){
            System.out.println(productQuality[i]);
        }
}

        System.out.println("\nProduct Names:");
        for(int i = 0; i < 15; i++) {
          if(i%2!=0){
            System.out.println(productNames[i]);
        }
     }

    }
}
class LaptopDetails {

    static float laptopWeights[] = {
        1.2f,1.4f,1.5f,1.3f,1.6f,
        1.7f,1.8f,1.9f,1.1f,1.0f,
        2.0f,2.1f,1.25f,1.35f,1.45f
    };

    static double laptopPrices[] = {
        55000.50,60000.75,65000.90,70000.20,75000.40,
        80000.60,85000.80,90000.10,95000.30,100000.55,
        105000.65,110000.85,115000.95,120000.45,125000.35
    };

    static char laptopGrades[] = {
        'A','B','A','C','B',
        'A','B','A','C','B',
        'A','B','C','A','B'
    };

    static String laptopBrands[] = {
        "Dell","HP","Lenovo","Apple","Asus",
        "Acer","Samsung","MSI","LG","Sony",
        "Toshiba","Microsoft","Razer","Huawei","Google"
    };

    public static void main(String[] args) {

        for(int i = 0; i < 15; i++) {
            if(i%2!=0){

            System.out.println(laptopWeights[i]);
        }
}

        for(int i = 0; i < 15; i++) {
            if(i%2!=0){

            System.out.println(laptopPrices[i]);
        }
}

        for(int i = 0; i < 15; i++) {
            if(i%2!=0){

            System.out.println(laptopGrades[i]);
        }
}

        for(int i = 0; i < 15; i++) {
            if(i%2!=0){
            System.out.println(laptopBrands[i]);
        }
      }
    }
}
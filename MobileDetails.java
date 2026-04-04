class MobileDetails {

    static float mobileRating[] = {
        10.5f,15.3f,19.2f,5.4f,1.6f,
        65.7f,178.9f,18.1f,18.5f,12.8f,
        16.4f,11.6f,19.7f,14.2f,17.3f
    };

    static double mobilePrices[] = {
        15000.50,18000.75,20000.60,22000.40,25000.80,
        27000.35,30000.90,32000.45,35000.70,38000.55,
        40000.25,42000.85,45000.65,47000.95,50000.15
    };

    static char mobileGrades[] = {
        'A','B','A','C','B',
        'A','B','A','C','B',
        'A','B','C','A','B'
    };

    static String mobileBrands[] = {
        "Samsung","Apple","OnePlus","Vivo","Oppo",
        "Realme","Xiaomi","Motorola","Nokia","Google",
        "Sony","Asus","Lenovo","Honor","Huawei"
    };

    public static void main(String[] args) {

        for(int i = 0; i < 15; i++) {
            if(i%2==0){
            System.out.println(mobileRating[i]);
        }
}

        for(int i = 0; i < 15; i++) {
            if(i%2==0){
            System.out.println(mobilePrices[i]);

        }
}

        for(int i = 0; i < 15; i++) {
            if(i%2==0){
            System.out.println(mobileGrades[i]);
        }
}

        for(int i = 0; i < 15; i++) {
            if(i%2==0){
            System.out.println(mobileBrands[i]);

        }
      }
    }
}
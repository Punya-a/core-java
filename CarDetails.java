class CarDetails {

    static byte CarRatings[] = {4,5,3,4,5,4,3,5,4,3,4,5,4,3,5};

    static short CarMileage[] = {40,45,50,42,48,55,60,38,44,52,47,49,53,46,41};

    static int CarPrices[] = {
        800000,850000,90000,9500000,1000000,
        1050000,1100000,11500000,120000,1250000,
        1300000,1350000,1400000,1450000,1500000
    };

    static long CarRegistrationNumbers[] = {
        560001001L,560001002L,560001003L,560001004L,560001005L,
        560001006L,560001007L,560001008L,560001009L,560001010L,
        560001011L,560001012L,560001013L,560001014L,560001015L
    };

    public static void main(String[] args) {

        for(int i = 0; i < 15; i++) {
            System.out.println(CarRatings[i]);
        }

            System.out.println();


        for(int i = 0; i < 15; i++) {
            System.out.println(CarMileage[i]);

        }

            System.out.println();


        for(int i = 0; i < 15; i++) {
            System.out.println(CarPrices[i]);

        }
            System.out.println();



        for(int i = 0; i < 15; i++) {
            System.out.println(CarRegistrationNumbers[i]);

        }

            System.out.println();


    }
}
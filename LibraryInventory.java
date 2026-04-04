class LibraryInventory {

    static byte bookIds[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

    static short bookPages[] = {120,150,200,180,250,300,220,175,190,210,230,160,140,195,205};

    static int bookPrices[] = {
        250,300,450,400,500,350,380,420,480,550,600,320,370,390,410
    };

    static long bookISBN[] = {
        978123400001L,978123400002L,978123400003L,978123400004L,978123400005L,
        978123400006L,978123400007L,978123400008L,978123400009L,978123400010L,
        978123400011L,978123400012L,978123400013L,978123400014L,978123400015L
    };

    public static void main(String[] args) {

        System.out.println("Book IDs:");
        for(int i = 0; i < 15; i++) {
            if(i%2==0){
            System.out.println(bookIds[i]);
        }
}

            System.out.println();


        System.out.println("\nBook Pages:");
        for(int i = 0; i < 15; i++) {
            if(i%2==0){

            System.out.println(bookPages[i]);
        }
}

            System.out.println();


        System.out.println("\nBook Prices (INR):");
        for(int i = 0; i < 15; i++) {
            if(i%2==0){
            System.out.println(bookPrices[i]);
        }
}

            System.out.println();


        System.out.println("\nBook ISBN Numbers:");
        for(int i = 0; i < 15; i++) {
            if(i%2==0){
            System.out.println(bookISBN[i]);
        }
}

            System.out.println();


    }
}
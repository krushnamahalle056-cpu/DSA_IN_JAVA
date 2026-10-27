package Patern;

public class star_Printing {
    static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }



        // Print a right-angled triangle

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        // print inverted triangle

        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // print number triangle

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // print same number in each row
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        // print the right align triangle

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // table printig
        for(int i = 1 ; i<=20; i*=2){
            System.out.print(i + " ");
        }

        // table printig
        for(int i = 1 ; i<=20; i+=2){
            System.out.print(i + " ");
        }

        // table printig
        for(int i = 2 ; i<=20; i+=2){
            System.out.print(i+" ");
        }

        // negative table printig
        for(int i = 20 ; i>=2; i-=2){
            System.out.print(i + " ");
        }





    }
}





package MultiDimentionalArrays;

import java.util.Scanner;

public class Outputin2DArrays {
    static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][4];       // --- Initializing empty 2D array
        System.out.println("Enter 4 integers: ");
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){      // arr[0].length means first row madhlya elements chi length
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.println("The Output is ----> ");
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){      // arr[0].length means first row madhlya elements chi length
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("The Output of Initialized array is ----> ");
        System.out.println();
        int[][] brr = {{2,3,6,3},{4,5,6,6},{3,5,7,6},{3,2,1,6}};   // initialize the number 2D array
        for(int i = 0; i<brr.length; i++){
            for(int j = 0; j<brr[0].length; j++){      // arr[0].length means first row madhlya elements chi length
                System.out.print(brr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

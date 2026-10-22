package MultiDimentionalArrays;

public class Outputin2DArrays {
    static void main(String[] args) {
        // int[][] arr = new int[4][4];       // --- Initializing empty 2D array
        int[][] arr = {{2,3,6,3},{4,5,6,6},{3,5,7,6},{3,2,1,6}};   // initialize the number 2D array
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){      // arr[0].length means first row madhlya elements chi length
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

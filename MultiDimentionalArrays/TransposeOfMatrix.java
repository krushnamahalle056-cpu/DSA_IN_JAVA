package MultiDimentionalArrays;

public class TransposeOfMatrix {
    static void main(String[] args) {
        int[][] a = {{2,5,6,1},{4,6,7,8},{2,6,7,3},{5,9,8,3}};
        // Original Matrix
        System.out.println("Original Matrix");
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();

        // Transpose of matrix
        for(int i=0; i<a.length; i++){
            for(int j=0; j<i; j++){
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;

            }
        }

        System.out.println("Transposed Matrix");
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}

package MultiDimentionalArrays;
public class PrintMatrixInSnakePattern {
    static void main(String[] args) {
        int[][] arr = {{2,3,2,1},{2,1,6,4},{2,5,6,7},{2,5,6,9}};

        // print Matrix in Normal form
        for(int j =0 ; j<arr.length; j++){
            for(int k = 0 ; k<arr[j].length; k++){
                System.out.print(arr[j][k]+" ");
            }
            System.out.println();
        }

        // Matrix Printing in Snake Pattern
        for(int i=0; i<arr.length; i++){
            if(i%2 != 0){
                for(int j=arr[0].length-1;j>=0; j--){
                    System.out.print(arr[i][j] + " ");
                }
            }else{
                for(int j=0;j<arr[0].length; j++){
                    System.out.print(arr[i][j] +" ");
                }
            }
            System.out.println();
        }
    }
}

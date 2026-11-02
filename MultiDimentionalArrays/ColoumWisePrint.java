package MultiDimentionalArrays;

public class ColoumWisePrint {
    static void main(String[] args) {
        int[][] arr = {{2,3,2,1},{2,1,6,4},{2,5,6,7}};
        for(int j=0;j<arr[0].length;j++){
            for(int k=0;k<arr.length;k++){
                System.out.print(arr[k][j]+" ");
            }
            System.out.println();
        }
    }
}

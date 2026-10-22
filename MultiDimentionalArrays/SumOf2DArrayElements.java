package MultiDimentionalArrays;

public class SumOf2DArrayElements {
    static void main(String[] args) {
        int[][] arr = {{2,3,4},{3,1,5},{2,5,6}};
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                sum += arr[i][j];
            }
        }

        System.out.println(sum);
    }
}

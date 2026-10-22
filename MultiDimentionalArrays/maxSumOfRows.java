package MultiDimentionalArrays;

public class maxSumOfRows {
    static void main(String[] args) {

        int[][] arr = {{2,3,4,9},{2,5,6,1},{2,4,7,8}};
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            int sum = 0;
            for(int j = 0; j<arr[i].length; j++){
                sum += arr[i][j];
            }
            maxSum = Math.max(maxSum, sum);
        }
        System.out.println(maxSum);
    }
}

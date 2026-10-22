package MultiDimentionalArrays;

public class maxSumOfRows {
    static void main(String[] args) {

        int[][] arr = {{2,30,4,9},{2,5,6,1},{2,40,7,8}};
        int row = -1;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            int sum = 0;
            for(int j = 0; j<arr[i].length; j++){
                sum += arr[i][j];
            }
            if(sum > maxSum){
                maxSum = sum;
                row = i;
            }
        }
        System.out.println(row+" "+maxSum);
    }
}

package MultiDimentionalArrays;

public class ShalloAndDeepCopy {
    static void main(String[] args){
        int[][] arr ={{2,4,3},{2,1,3},{9,3,2}};
        int[][] brr = {{2,4,3},{2,1,3},{9,3,2}};
        brr[1][2] = 20;
        System.out.println(arr[1][2]);
        for(int i =0; i<arr.length; i++){
            for(int j = 0 ; j<arr[1].length; j++){
                System.out.println(arr[i][j]);
            }
        }

    }
}

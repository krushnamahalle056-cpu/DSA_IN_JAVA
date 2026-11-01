package MultiDimentionalArrays;

public class ShalloAndDeepCopy {
    static void main(String[] args){
        int[][] arr ={{2,4,3},{2,1,3},{9,3,2}};
        int[][] brr = {{2,4,3},{2,1,3},{9,3,2}};
        brr[1][2] = 20;
        System.out.println(arr[1][2]);

        // print the arr 2D array
        for(int i =0; i<arr.length; i++){
            for(int j = 0 ; j<arr[1].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // print the brr 2D array
        for(int i =0; i<brr.length; i++){
            for(int j = 0 ; j<brr[1].length; j++){
                System.out.print(brr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(brr[1][2]);

    }
}

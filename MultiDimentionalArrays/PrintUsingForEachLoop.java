package MultiDimentionalArrays;

public class PrintUsingForEachLoop {
    static void main(String[] args) {
        int[][] arr = {{2,3,2,1},{2,1,6,4},{2,5,6,7}};
        // First Method
        for(int i = 0; i<arr.length; i++){
            for(int ele : arr[i]){
                System.out.print(ele+" ");
            }
            System.out.println();
        }

        System.out.println();

        // second method
        for(int[] a : arr){
            for(int ele : a){
                System.out.print(ele+" ");
            }
        }

    }
}

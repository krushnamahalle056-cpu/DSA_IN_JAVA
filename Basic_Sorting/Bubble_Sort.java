package Basic_Sorting;

public class Bubble_Sort {
    static void main(String[] args) {
        int[] arr = {2,4,5,3,1,7,6};
        for(int i = 0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;

            }
        }

    }
}

package Basic_Sorting;

public class Kth_Smallest_Que {
    public static void print(int[] arr ){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
    static void main(String[] args) {
        int[] arr = {10, 5, 4, 3, 48, 6, 2, 33, 53, 10};
        print(arr);
        int k = 4;
        int n = arr.length;
        for(int i = 0; i<k ; i++){
            int minIndex = i;
            for(int j = i+1; j<n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;

                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex] ;
            arr[minIndex] = temp;
        }
        print(arr);

    }
}

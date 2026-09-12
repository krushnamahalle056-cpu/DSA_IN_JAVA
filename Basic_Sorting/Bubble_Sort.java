package Basic_Sorting;

public class Bubble_Sort {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
    static void main(String[] args) {
        int[] arr = {-2,4,0,5,-3,1,7,1,6};
        int n = arr.length;
        print(arr);

       for(int j =1; j<n-1; j++){
           for(int i = 0; i<n-1; i++){
               if(arr[i] > arr[i+1]){
                   int temp = arr[i];
                   arr[i] = arr[i+1];
                   arr[i+1] = temp;

               }
           }
       }
        System.out.println(" ");
       print(arr);

    }
}

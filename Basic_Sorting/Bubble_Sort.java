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

       for(int i =0; i<n-1; i++){
           for(int j = 0; j<n-1-i; j++){       // condition j<n-1-i becouse last ka element first round main hi  ---
               if(arr[j] > arr[j+1]){          // sort ho jayega to hame loop n-1 tak chalane ki jarurat nhi hai ---
                   int temp = arr[j];          // isse time complexity kam ho jayegi .
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;

               }
           }
       }
        System.out.println(" ");
       print(arr);

    }
}

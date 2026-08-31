package array;

public class ReverseArray {
    static void main(String[] args) {
//        int[] arr = {3,5,9,20,34,12};
//        int i = 0;
//        int j = arr.length-1;
//        while(i<j){
//            int temp = arr[j];
//            arr[j] = arr[i];
//            arr[i] = temp;
//            i++;
//            j--;
//        }
//        for(int ele : arr){
//            System.out.print(ele + " ");
//        }

        // Que: reverse the array at index 2 to 5 ( Called tow pointer technique

        int[] ar= {23,1,31,45,52,51,55,22,11};
        int i=2,j=5;
        while(i<j){
            int temp = ar[i];
            ar[i]=ar[j];
            ar[j]=temp;
            i++;j--;
        }
        for(int ele:ar){
            System.out.print(ele+" ");
        }
    }
}

package array;

public class printarr {
    static void main(String []args) {


//        int arr[] = {1, 2, 3, 4, 5};
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
        int arr[]={3,2,4,5,1};
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;
            j--;
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}

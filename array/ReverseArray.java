package array;

public class ReverseArray {
    static void main(String[] args) {
        int[] arr = {3,5,9,20,34,12};
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

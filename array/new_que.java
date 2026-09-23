package array;

public class new_que {
    static void main(String[] args) {
        int[] arr = {2,4,5,6,7,86,55,34,32,22,11};
        int n = arr.length;

        // Print the array
        for(int i=0;i<n; i++){
            System.out.print(arr[i] + " ");
        }

        // Second method to print array
        int i = 0;
        while(i<n){
            System.out.print(arr[i] + " ");
            i++;
        }

        // third method to print array
        for(int ele: arr){
            System.out.print(ele);
        }

    }
}

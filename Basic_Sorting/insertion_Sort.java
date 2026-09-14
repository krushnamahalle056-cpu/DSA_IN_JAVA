package Basic_Sorting;

public class insertion_Sort {
    public static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele + " ");
        }
    }

    static void main(String[] args) {
        int[] arr = {3,5,-1,0,2,8,5};
        print(arr);

        for(int i = 1; i< arr.length; i++){
            int j = i;
            while(j > 0 && arr[j] > arr[j-1]){
                int temp = arr[j] ;
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;

            }
        }

        System.out.println(" ");

        print(arr);

    }

}

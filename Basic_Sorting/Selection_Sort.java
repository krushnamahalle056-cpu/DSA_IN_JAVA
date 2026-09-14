package Basic_Sorting;

public class Selection_Sort {
    public static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele + " ");
        }
    }

    static void main(String[] args) {
        int[] arr = {1,-2,6,0,5,8,4,7};
        int n = arr.length;
        print(arr);

        for(int i = 0; i< n-1 ; i++){
            int minIndex = i;
            for(int j = i+1; j<n ; j++){
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }


        }

//        for(int i = 0; i<n-1; i++){
//            int min = Integer.MAX_VALUE;
//            int minIndex = -1;
//            for(int j =i; j<n; j++){
//                if (arr[j] < min){
//                    min = arr[j];
//                    minIndex = j;
//                }
//            }
//
//            int temp = arr[i];
//            arr[i] = arr[minIndex] ;
//            arr[minIndex] = temp;
//        }
        System.out.println(" ");
        print(arr);
    }

}

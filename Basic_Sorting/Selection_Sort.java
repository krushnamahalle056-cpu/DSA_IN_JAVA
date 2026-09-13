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

    }

}

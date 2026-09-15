package Binary_Search;

public class Binary_Search_code {
    static void main(String[] args) {
        int[] arr = {-1,-3,3,5,7,8,9,12,14,19,23,34,56,78,909};
        int target = 23;
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int index = -1;
        while(start <= end){
            int mid = (start + end)/2;
            if(arr[mid] == target){
                index = mid;
            }else if(arr[mid] < target){
                start = mid +1;
            }
            else{
                end = mid -1;
            }
        }

        System.out.println(index);
    }
}

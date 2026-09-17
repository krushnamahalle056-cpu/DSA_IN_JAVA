package Binary_Search;

public class search_rotated_sorted_array {
    static void main(String[] args) {
        int[] arr = {3,5,6,7,8,9,10,1,2};
        int target = 1;
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                System.out.println(mid);
                break;
            }
            else if(arr[start] <= arr[mid]){
                if(arr[start] <= target && arr[mid] > target){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else{
                if(arr[end] > target && arr[mid] <= target){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
        }
    }
}


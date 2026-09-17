package Random_Question;

public class find_Similer_element {

    public static void main(String[] args) {

        int[] arr = {1,1,2,2,4,4,6,6,7,8,8,9,9};

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            // Make mid even
            if (mid % 2 != 0) {
                mid--;
            }

            if (arr[mid] == arr[mid + 1]) {

                // Pair is correct
                // Single element is on the right
                start = mid + 2;

            } else {

                // Pair is broken
                // Single element is on the left
                end = mid;
            }
        }

        System.out.println(arr[start]);
    }
}

//// maximum count of nagative integer and positive integer
//
//int n = nums.length;
//int p = 0;
//int neg = 0;
//int start = 0;
//int end = n-1;
//
//        while(start<=end){
//int mid = start + (end-start)/2;
//            if(nums[mid] < 0){
//start = mid+1;
//        }else{
//end = mid-1;
//        }
//
//p = start;
//        }
//
//int lo = 0;
//int hi = n-1;
//        while(lo<= hi){
//int mid = lo+(hi-lo)/2;
//            if(nums[mid]<=0){
//lo = mid+1;
//        }else{
//hi = mid-1;
//        }
//neg = n-lo;
//        }
//
//                if(p>=neg){
//        return p;
//        }else{
//                return neg;
//        }
//
////  Search in Rotated Sorted Array

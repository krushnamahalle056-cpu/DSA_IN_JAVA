package Binary_Search;

import java.util.ArrayList;

public class first_and_last_Occurrences_BinarySearchQue {

    static void main(String[] args) {
        int[] arr = {-3,1,2,5,5,5,5,5,5,5,7,8,9,12,14,19,23,34,56,78,909};
        ArrayList<Integer> newarr= new ArrayList<>();
        int n = arr.length;
        int x= 5;
        int start = 0;
        int end = n-1;
        int indx1=-1;

        // for fist Occurrences
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] > x){
                end = mid-1;
            }
            else if(arr[mid]< x){
                start = mid +1;
            }else {
                indx1 = mid;
                end = mid-1;
            }
        }

        // While loop for last Occurrences

        int lo = 0;
        int hi = n-1;
        int indx2=-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid] > x){
                hi = mid-1;
            }
            else if(arr[mid]< x){
                lo = mid +1;
            }else {
                indx2 = mid;
                lo = mid+1;
            }
        }

        newarr.add(indx1);
        newarr.add(indx2);

        System.out.println(newarr);





    }
}

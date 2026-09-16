package Random_Question;

public class find_Similer_element {
    static void main(String[] args) {
        int[] arr= {1,1,2,2,4,4,6,6,7,8,8,9,9};
        int n = arr.length;
        int start = 0 ;
        int end = n-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(n == 1) System.out.println(arr[0]);
            if(arr[0] != arr[1]){
                System.out.println(arr[0]);
                break;
            }
            if(arr[mid-1] != arr[mid-2]) System.out.println(arr[mid-1]);
            if(arr[mid]==arr[mid-1] && arr[mid]==arr[mid+1]){
                System.out.println(arr[mid]);
                break;
            }
            int first=mid, second=mid;
            if(arr[mid]==arr[mid-1]){
                first = mid-1;
            }else{
                second = mid+1;
            }

            int firstHalf= first - start;
            int secondHalf= end - second;
            if(firstHalf % 2 == 0){
                start = second+1;
            }else{
                end = first -1;
            }



        }

    }
}

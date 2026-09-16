package Random_Question;

public class find_Similer_element {
    static void main(String[] args) {
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
                // Pair is correct, single element is on right
                start = mid + 2;
            } else {
                // Pair is broken, single element is on left
                end = mid;
            }
        }

        System.out.println(arr[start]);

        }

    }
}

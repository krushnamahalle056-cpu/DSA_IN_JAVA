package array;

public class FindDoublicateEle {
    static void main(String[] args) {
       // Que: Print all elements
        int[] arr = {10, 20, 30, 40, 50};
        for(int ele: arr){
            System.out.print(ele+" ");
        }

        // Que: Find sum of array
        int[] a = {10, 20, 30, 40, 50};
        int sum = 0;
        for(int i=0; i<a.length; i++){
            sum += a[i];
        }
        System.out.print("sum= "+sum);

    }
}

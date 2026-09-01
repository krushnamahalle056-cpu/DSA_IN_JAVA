package array;

import java.util.Scanner;

public class Segregate_0s_and_1s {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }


        segregate(arr);
    }

    static void segregate(int[] arr) {
        int NumberOfZeros = 0;
        int NumberOfOnes = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                NumberOfZeros++;
            }else{
                NumberOfOnes ++;
            }
        }

        for(int i = 0; i < NumberOfZeros; i++){
            arr[i] = 0;
        }
        for(int i = NumberOfZeros; i < arr.length; i++){
            arr[i] = 1;
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
